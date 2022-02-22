package com.company;

public class Shop {
    public static void main(String[] args) {

        Client client = new Client();

        client.name = "Ivan";
        client.surname = "Ivanov";
        client.middleName = "Ivanov";
        client.age = 19;
        client.credit = true;
        client.money = 10000;

        Machine suzukiJimny = new Machine();

        suzukiJimny.name = "Suzuki Jimny";
        suzukiJimny.amount = 3;
        suzukiJimny.price = 650_900;

        int minAge = 18;

        if (client.age < minAge) {
            System.out.println("приходите через  " + (minAge - client.age) + " года, будем рады вас видеть");
            return;
        }

        if (client.money >= suzukiJimny.price) {

            congratulations();
            return;

        } else {
            if (client.credit) {
                int lastSumm = suzukiJimny.price - client.money;
                int monthPay = lastSumm / 36;
                System.out.println("Поздравляем! Кредит оформлен. Ежемесячный платеж " + monthPay);
                congratulations();
                return;
            } else {
                System.out.println("приходите когда будут деньги)");
            }

        }

    }

    public static void congratulations() {
        System.out.println("Поздравляем с покупкой!");

    }
}

