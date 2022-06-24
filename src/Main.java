public class Main {
    public static void main(String[] args) {
        int start = 100; // начальный счет
        int add = 1100; // сумма пополнения
        int quantity = start + add; //  сумма на счете после пополнения
        int bonus = add / 100 * 1;
        if (add < 1000) {
            System.out.println("Нет бонусов");
        } else {
            System.out.println(quantity + bonus);
        }

    }
}
