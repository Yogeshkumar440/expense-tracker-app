package com.yogesh.expense.service.impl;

import com.yogesh.expense.dto.ExpenseDto;
import com.yogesh.expense.entity.Expense;
import com.yogesh.expense.mapper.ExpenseMapper;
import com.yogesh.expense.repository.ExpenseRepository;
import com.yogesh.expense.service.ExpenseService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

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
}
