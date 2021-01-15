package ir.afarinesh.inventorymanagementservice.services;

import ir.afarinesh.inventorymanagementservice.core.usecase.UseCaseCommand;
import ir.afarinesh.inventorymanagementservice.core.usecase.UseCaseResult;
import ir.afarinesh.inventorymanagementservice.services.commands.ConsumeProductCommand;
import ir.afarinesh.inventorymanagementservice.services.exceptions.ConsumeProductException;
import ir.afarinesh.inventorymanagementservice.services.results.ConsumeProductResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class InventoryService {

    public UseCaseResult<ConsumeProductResult> consumeProduct(UseCaseCommand<ConsumeProductCommand> command) throws ConsumeProductException {
        log.info("Product [" + command.getCommand().getProductId() + "] has been consumed " + command.getCommand().getNumber() + " times");
        return new UseCaseResult<>(
                new ConsumeProductResult(command.getCommand().getNumber()),
                false,
                ""
        );
    }
}
