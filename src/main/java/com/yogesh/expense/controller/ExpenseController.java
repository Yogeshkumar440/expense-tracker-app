package com.yogesh.expense.controller;

import com.yogesh.expense.dto.ExpenseDto;
import com.yogesh.expense.service.ExpenseService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/expenses")
@AllArgsConstructor
public class ExpenseController {

    private final ExpenseService expenseService;

    // Build create expense REST API
    @PostMapping
    public ResponseEntity<ExpenseDto> createExpense(@RequestBody ExpenseDto expenseDto){
        ExpenseDto expense = expenseService.createExpense(expenseDto);

        return new ResponseEntity<>(expense, HttpStatus.CREATED);

    }
}
