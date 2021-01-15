package ir.afarinesh.inventorymanagementservice.services.commands;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class ConsumeProductCommand {

    private long productId;

    private int number;
}
