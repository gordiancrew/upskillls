package com.company.classes.aggregation_and_composition.Task4;

public class Main {
    //4. Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки счета.
    // Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам.
    // Вычисление суммы по всем счетам, имеющим положительный и отрицательный балансы отдельно.
    public static void main(String[] args) {
        Account a1 = new Account("Kozlov", 222333444, 2000);
        Account a2 = new Account("Ivanov", 222333555, 6700);
        Account a3 = new Account("Kozlov", 222222222, 2900);
        Account a4 = new Account("Davidov", 555555555, -300);
        AccountsList list1 = new AccountsList();
        list1.setAccount(a1);
        list1.setAccount(a2);
        list1.setAccount(a3);
        list1.setAccount(a4);
        System.out.println(list1);
        list1.sortAccountsForCash();
        System.out.println(list1);
        list1.printSumCash();
        list1.printSumPositiveNegative();
    }
}
