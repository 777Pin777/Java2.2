public class Main {
    public static void main(String[] arge) {

        // входные данные
        int bonusLevel; // ед начисления бонусов (1 руб за каждые начисленные 100 руб)
        int account = 300; // сумма на счете
        int payment = 1500; // пополнение счета
        boolean inActive = true;

        //логика программы
        int percent = (payment > 1000) ? 1 : 0;
        int bonus = payment / 100 * percent;

        int balance = account + payment + bonus;
        System.out.println("Добрый день. Ваш баланс: " + balance + " р. Ваш бонус: " + bonus + " руб.");

    }
}

