package ir.afarinesh.salesmanagementservice.controllers;

import ir.afarinesh.salesmanagementservice.core.usecase.UseCaseCommand;
import ir.afarinesh.salesmanagementservice.core.usecase.UseCaseResult;
import ir.afarinesh.salesmanagementservice.proxy.InventoryServiceProxy;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api/v1")
public class SalesController {

    final InventoryServiceProxy inventoryServiceProxy;

    public SalesController(InventoryServiceProxy inventoryServiceProxy) {
        this.inventoryServiceProxy = inventoryServiceProxy;
    }

    @PostMapping("/sales")
    public String sales() {

        UseCaseResult<InventoryServiceProxy.ConsumeProductResult> useCaseResult = inventoryServiceProxy.consumeProduct(new UseCaseCommand<>(
                new InventoryServiceProxy.ConsumeProductCommand(
                        28L,
                        8
                ),
                "fa"
        ));

        log.info(useCaseResult.toString());

        return "Sales done.";
    }
}
