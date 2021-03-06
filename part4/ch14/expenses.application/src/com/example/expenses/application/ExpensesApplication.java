package com.example.expenses.application;

import com.example.expenses.readers.Reader;
import com.example.expenses.readers.http.HttpReader;

public class ExpensesApplication {

    public static void main(String[] args) {
        Reader reader = new HttpReader();
    }

}
