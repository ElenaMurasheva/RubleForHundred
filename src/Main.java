public class Main {
    public static void main(String[] args) {

        int initialAmount = 100; // Первоначальная сумма на счете Клиента

        int extraMoney = 1100; // Сумма пополнения счета Клиентом

        if (extraMoney > 1_000) {
            int bonus = 100; // Количество рублей пополнения для одного бонуса
            int bonusAmount = extraMoney / bonus; // Сумма начисленых бонусов
            int finalAmount1 = initialAmount + extraMoney + bonusAmount; // Итоговая сумма на счете Клиента c бонусами
            System.out.println("Итоговая сумма на счете Клиента: " + finalAmount1 + ", бонус равен " + bonusAmount);
        } else {
            int finalAmount2 = initialAmount + extraMoney; // Итоговая сумма на счете Клиента без бонусов
            System.out.println("Итоговая сумма на счете Клиента: " + finalAmount2 + ", бонусов нет ");
        }

    }

}

