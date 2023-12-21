import java.util.Objects;
import java.util.Scanner;
public class Store {
    static int gucci = 1000;
    static int iphone = 10000;
    static int goldOrange = 1700;
    static String order = "";
    static int n = 0;
    public static void main (String [] args) {
        User user1 = new User();
        Scanner in = new Scanner(System.in);
        System.out.println("Введи имя: ");
        user1.name = in.nextLine();
        System.out.println("Введи кол-во денег: ");
        user1.rub = Double.parseDouble(in.nextLine());
        user1.cart = 0;
        while(!Objects.equals(order, "end")) {
            System.out.println("Чего желаете? 1 - сумочка Gucci (1000 руб), 2 - iphone 15 Pro (10000 руб), 3 - золотой апельсин (1700 руб) \nend - закончить покупки");
            order = in.nextLine();

            switch (order) {
                case "1":
                    System.out.println("Введите количество: ");
                    n = Integer.parseInt(in.nextLine());
                    if (user1.rub < gucci*n) {
                        System.out.println("Недостаточно средств");
                    } else {
                        user1.cart += gucci*n;
                        user1.rub -= gucci*n;
                    }
                    break;
                case "2":
                    System.out.println("Введите количество: ");
                    n = Integer.parseInt(in.nextLine());
                    if (user1.rub < iphone*n) {
                        System.out.println("Недостаточно средств");
                    } else {
                        user1.cart += iphone*n;
                        user1.rub -= iphone*n;
                    }
                    break;
                case "3":
                    System.out.println("Введите количество: ");
                    n = Integer.parseInt(in.nextLine());
                    if (user1.rub < goldOrange*n) {
                        System.out.println("Недостаточно средств");
                    } else {
                        user1.cart += goldOrange*n;
                        user1.rub -= goldOrange*n;
                    }
                    break;
            }
            System.out.println("Корзина на: " + user1.cart + " рублей");
            System.out.println("Баланс на карте: " + user1.rub + " рублей");
        }
    }
}
