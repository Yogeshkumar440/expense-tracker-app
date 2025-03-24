package com.yogesh.expense.service.impl;

import com.yogesh.expense.dto.ExpenseDto;
import com.yogesh.expense.entity.Expense;
import com.yogesh.expense.mapper.ExpenseMapper;
import com.yogesh.expense.repository.ExpenseRepository;
import com.yogesh.expense.service.ExpenseService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class ExpenseServiceImpl implements ExpenseService {

    private final ExpenseRepository expenseRepository;

    @Override
    public ExpenseDto createExpense(ExpenseDto expenseDto) {
        // Convert ExpenseDto to Expense Entity
        Expense expense = ExpenseMapper.mapToExpense(expenseDto);

        // Save expense entity to database
        Expense savedExpense = expenseRepository.save(expense);
        return ExpenseMapper.mapToExpenseDto(savedExpense);
    }

    @Override
    public ExpenseDto getExpenseById(Long expenseId) {

        // get expense entity from the database using id
        Expense expense = expenseRepository.findById(expenseId).orElseThrow(() -> new RuntimeException("Expense not found with id: " + expenseId));

        return ExpenseMapper.mapToExpenseDto(expense);
    }

    @Override
    public List<ExpenseDto> getAllExpenses() {
        List<Expense> expenses = expenseRepository.findAll();
        return expenses.stream().map(ExpenseMapper::mapToExpenseDto).collect(Collectors.toList());
    }
}
