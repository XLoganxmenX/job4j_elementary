package ru.job4j.loop;

public class Mortgage {
    public static int year(double amount, int salary, double percent) {
        int year = 0;
        double loanBalance = amount;
        while (loanBalance > 0) {
            loanBalance = (amount + (loanBalance * (percent / 100))) - salary;
            year++;
        }
        return year;
    }
}
