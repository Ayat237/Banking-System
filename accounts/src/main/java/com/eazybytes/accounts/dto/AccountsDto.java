package com.eazybytes.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;


@Data
@Schema(
        name = "Accounts",
        description = "Schema to hold account information"
)
public class AccountsDto {

    @Schema(
            description = "AccountNumber of bank Account",example = "1090001123"
    )
    @NotEmpty(message = "AccountNumber can not be null or empty")
    @Pattern(regexp = "($|[0-9]{10})",message = "AccountNumber must be 10 digits")
    private Long accountNumber;

    @Schema(
            description = "AccountType of bank Account",example = "saving"
    )
    @NotEmpty(message = "AccountType can not be null or empty")
    private String accountType;

    @Schema(
            description = "BranchAddress of bank Account",example = "123 NewYork"
    )
    @NotEmpty(message = "BranchAddress can not be null or empty")
    private String branchAddress;
}
