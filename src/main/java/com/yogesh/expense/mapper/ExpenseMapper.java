package com.yogesh.expense.mapper;

import com.yogesh.expense.dto.CategoryDto;
import com.yogesh.expense.dto.ExpenseDto;
import com.yogesh.expense.entity.Category;
import com.yogesh.expense.entity.Expense;

public class ExpenseMapper {

    // Map expense entity to expenseDto
    public static ExpenseDto mapToExpenseDto(Expense expense){
        return new ExpenseDto(
                expense.getId(),
                expense.getAmount(),
                expense.getExpenseDate(),
                new CategoryDto(
                        expense.getCategory().getId(),
                        expense.getCategory().getName()
                        )
        );
    }

    // Map expenseDto to expense entity
    public static Expense mapToExpense(ExpenseDto expenseDto){
        Category category = new Category();
        category.setId(expenseDto.categoryDto().id());

        return new Expense(
                expenseDto.id(),
                expenseDto.amount(),
                expenseDto.expenseDate(),
                category
        );
    }
}
