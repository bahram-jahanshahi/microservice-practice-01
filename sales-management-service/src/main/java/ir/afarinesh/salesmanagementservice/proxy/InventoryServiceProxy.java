package ir.afarinesh.salesmanagementservice.proxy;

import ir.afarinesh.salesmanagementservice.core.usecase.UseCaseCommand;
import ir.afarinesh.salesmanagementservice.core.usecase.UseCaseResult;
import lombok.*;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "inventory-management-service")
public interface InventoryServiceProxy {
    @PostMapping("/api/v1/consume-product")
    UseCaseResult<ConsumeProductResult> consumeProduct(@RequestBody UseCaseCommand<ConsumeProductCommand> command);



    @AllArgsConstructor
    @NoArgsConstructor
    @Getter
    @Setter
    @ToString
    class ConsumeProductCommand {

        private long productId;

        private int number;
    }

    @AllArgsConstructor
    @NoArgsConstructor
    @Getter
    @Setter
    @ToString
    class ConsumeProductResult {

        private long number;
    }
}


