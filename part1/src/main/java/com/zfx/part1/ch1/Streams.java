package com.zfx.part1.ch1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.groupingBy;

public class Streams {

    static List<Transaction> transactions = Arrays.asList();

    public static void main(String[] args) {
        /*Map<Currency, List<Transaction>> transactionByCurrencies = new HashMap<>();

        for (Transaction transaction : transactions) {
            if (transaction.getPrice() > 10000) {
                Currency currency = transaction.getCurrency();
                List<Transaction> transactionsForCurrency = transactionByCurrencies.get(currency);
                if (transactionsForCurrency == null) {
                    transactionsForCurrency = new ArrayList<>();
                    transactionByCurrencies.put(currency, transactionsForCurrency);
                }
                transactionsForCurrency.add(transaction);
            }
        }*/
        Map<Currency, List<Transaction>> transactionByCurrencies =
                transactions.stream()
                        .filter((Transaction t) -> t.getPrice() > 10000)
                        .collect(groupingBy(Transaction::getCurrency));
    }

}

@Data
class Currency {

}

@Data
@AllArgsConstructor
@NoArgsConstructor
class Transaction {
    int price;
    Currency currency;
}

