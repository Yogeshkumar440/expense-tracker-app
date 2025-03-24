package com.yogesh.expense.controller;

import com.yogesh.expense.dto.ExpenseDto;
import com.yogesh.expense.service.ExpenseService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    // Build get expense by id REST API
    @GetMapping("/{id}")
    public ResponseEntity<ExpenseDto> getExpenseById(@PathVariable("id") Long expenseId){
        ExpenseDto expense = expenseService.getExpenseById(expenseId);
        return ResponseEntity.ok(expense);
    }

    // Build get allExpenses REST API
    @GetMapping
    public ResponseEntity<List<ExpenseDto>> getAllExpenses(){
        List<ExpenseDto> expenses = expenseService.getAllExpenses();
        return ResponseEntity.ok(expenses);
    }

    // Build update Expense REST API
    @PutMapping("/{id}")
    public ResponseEntity<ExpenseDto> updateExpense(@PathVariable("id") Long expenseId,@RequestBody ExpenseDto expenseDto){
        ExpenseDto updatedExpense = expenseService.updateExpense(expenseId, expenseDto);
        return ResponseEntity.ok(updatedExpense);
    }

    // Build delete expense REST API
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteExpense( @PathVariable("id") Long expenseId){
        expenseService.deleteExpense(expenseId);
        return ResponseEntity.ok("Expense deleted successfully");
    }
}
