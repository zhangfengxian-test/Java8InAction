package com.zfx.part2.ch5;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

public class TradersTransactions {

    /*1 Find all transactions in the year 2011 and sort them by value (small to high).
    2 What are all the unique cities where the traders work?
    3 Find all traders from Cambridge and sort them by name.
    4 Return a string of all traders’ names sorted alphabetically.
    5 Are any traders based in Milan?
    6 Print the values of all transactions from the traders living in Cambridge.
    7 What’s the highest value of all the transactions?
    8 Find the transaction with the smallest value.*/

    public static void main(String[] args) {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario","Milan");
        Trader alan = new Trader("Alan","Cambridge");
        Trader brian = new Trader("Brian","Cambridge");
        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );

        listing1(transactions);
        listing2(transactions);
        listing3(transactions);
        listing4(transactions);
        listing5(transactions);
        listing6(transactions);
        listing7(transactions);
        listing8(transactions);
    }

    static void listing1(List<Transaction> transactions) {
        List<Transaction> tr2011 = transactions.stream()
                .filter(t -> t.getYear() == 2011)
                .sorted(comparing(Transaction::getValue))
                .collect(toList());
        System.out.println(tr2011);
    }

    static void listing2(List<Transaction> transactions) {
        List<String> uniqueCities = transactions.stream()
                .map(t -> t.getTrader().getCity())
                .distinct()
                .collect(toList());
        System.out.println(uniqueCities);
    }

    static void listing3(List<Transaction> transactions) {
        List<Trader> traders = transactions.stream()
                .filter(t -> t.getTrader().getCity().equals("Cambridge"))
                .map(Transaction::getTrader)
                .distinct()
                .sorted(comparing(Trader::getName))
                .collect(toList());
        System.out.println(traders);
    }

    static void listing4(List<Transaction> transactions) {
        String traderStr = transactions.stream()
                .map(t -> t.getTrader().getName())
                .distinct()
                .sorted()
                .reduce("", (s1, s2) -> s1 + s2);
        System.out.println(traderStr);
    }

    static void listing5(List<Transaction> transactions) {
        boolean milanBased = transactions.stream()
                .anyMatch(t -> t.getTrader().getCity().equals("Milan"));
        System.out.println(milanBased);
    }

    // Prints all transactions’ values from the traders living in Cambridge
    static void listing6(List<Transaction> transactions) {
        transactions.stream()
                .filter(t -> t.getTrader().getCity().equals("Cambridge"))
                .map(Transaction::getValue)
                .forEach(System.out::println);
    }

    // What’s the highest value of all the transactions
    static void listing7(List<Transaction> transactions) {
        Integer highest = transactions.stream()
                .map(Transaction::getValue)
                .reduce(0, Integer::max);
        System.out.println(highest);
    }

    // Finds the transaction with the smallest value
    static void listing8(List<Transaction> transactions) {
        transactions.stream()
                .reduce((t1, t2) -> t1.getValue() < t2.getValue() ? t1 : t2)
                .ifPresent(System.out::println);
    }
}
