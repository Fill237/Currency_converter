import java.util.Scanner;

public class Main {

    static final Scanner src = new Scanner(System.in);

    public static void main(String[] args) {
	    System.out.println("Введите курс доллара");
        double usd = src.nextDouble();
        System.out.println("Введите кол-во рублей");
        int rub = src.nextInt();
        double rub1 = (int) rub;
        double conv = rub1/usd;
        System.out.println("Вы можете купить: " + String.format("%.2f", conv));
    }
}
