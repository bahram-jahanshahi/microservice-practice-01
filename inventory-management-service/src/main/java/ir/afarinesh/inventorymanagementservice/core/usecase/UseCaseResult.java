package ir.afarinesh.inventorymanagementservice.core.usecase;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class UseCaseResult<T> {

    private T result;

    private boolean hasError;

    private String errorMessage;
}
