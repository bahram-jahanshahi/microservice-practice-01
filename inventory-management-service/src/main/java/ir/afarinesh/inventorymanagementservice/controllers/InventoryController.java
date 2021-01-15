package ir.afarinesh.inventorymanagementservice.controllers;

import ir.afarinesh.inventorymanagementservice.core.usecase.UseCaseCommand;
import ir.afarinesh.inventorymanagementservice.core.usecase.UseCaseResult;
import ir.afarinesh.inventorymanagementservice.services.InventoryService;
import ir.afarinesh.inventorymanagementservice.services.commands.ConsumeProductCommand;
import ir.afarinesh.inventorymanagementservice.services.exceptions.ConsumeProductException;
import ir.afarinesh.inventorymanagementservice.services.results.ConsumeProductResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class InventoryController {

    final InventoryService inventoryService;

    public InventoryController(InventoryService inventoryService) {
        this.inventoryService = inventoryService;
    }

    @PostMapping("consume-product")
    public UseCaseResult<ConsumeProductResult> consumeProduct(@RequestBody UseCaseCommand<ConsumeProductCommand> command) {
        try {
            return this.inventoryService.consumeProduct(command);
        } catch (ConsumeProductException e) {
            return new UseCaseResult<ConsumeProductResult>(
                    null,
                    true,
                    e.getMessage()
            );
        }
    }
}
