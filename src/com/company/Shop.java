package com.company;

public class Shop {
    public static void main(String[] args) {

        Client client = new Client();
        Machine SuzukiJimny = new Machine();

        int minAge = 18;

        if (client.age < minAge) {
            System.out.println("приходите через  " + (minAge - client.age) + " года, будем рады вас видеть");
            return;
        }

        if (client.money >= SuzukiJimny.price) {

            congratulations();
            return;

        } else {
            if (client.credit) {
                int lastSumm = SuzukiJimny.price - client.money;
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

