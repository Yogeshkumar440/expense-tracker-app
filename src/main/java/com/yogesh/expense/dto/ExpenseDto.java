package com.yogesh.expense.dto;

import io.swagger.v3.oas.annotations.media.Schema;

import java.math.BigDecimal;
import java.time.LocalDate;

@Schema(
        description = "Expense DTO (Date Transfer Object) to transfer data between client and server"
)
public record ExpenseDto(Long id,
                         @Schema(
                                 description = "Expense Amount"
                         )
                         BigDecimal amount,
                         @Schema(
                                 description = "Expense created date"
                         )
                         LocalDate expenseDate,
                         @Schema(
                                 description = "Associated Expense category"
                         )
                         CategoryDto categoryDto) {
}
