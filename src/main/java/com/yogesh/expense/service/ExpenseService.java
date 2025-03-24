package com.yogesh.expense.service;

import com.yogesh.expense.dto.ExpenseDto;

public interface ExpenseService {

    ExpenseDto createExpense(ExpenseDto expenseDto);

    ExpenseDto getExpenseById(Long expenseId);
}
