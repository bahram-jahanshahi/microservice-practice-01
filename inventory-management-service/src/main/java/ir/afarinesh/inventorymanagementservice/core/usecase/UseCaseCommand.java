package ir.afarinesh.inventorymanagementservice.core.usecase;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class UseCaseCommand<T> {
    private T command;
    private String locale;
}
