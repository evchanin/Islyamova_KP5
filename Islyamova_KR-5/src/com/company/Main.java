package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Task_1();
        System.out.println(" ");
        Task_2();
        System.out.println(" ");
        Task_3();
    }

        private static void Task_1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя: ");
        String na = scanner.nextLine();
        System.out.println("Введите фамилию: ");
        String sern = scanner.nextLine();
        System.out.println("Введите год рождения: ");
        int ThisYear = 2022;
        int yea = scanner.nextInt();
        Human chel = new Human(na, sern, yea);
        System.out.println("Имя: " + chel.name );
        System.out.println("Фамилия: " + chel.sername);
        System.out.println("Год рождения: " + chel.year );
        System.out.println("Возраст: " + (ThisYear- chel.year));
    }
    private static void Task_2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длинну первого катета: ");
        double cat1 = scanner.nextInt();
        System.out.println("Введите длинну второго катета: ");
        double cat2 = scanner.nextInt();
        double hipot = (Math.sqrt(Math.pow(cat1, 2) + Math.pow(cat2, 2)));
        RightTriangle triag = new RightTriangle(cat1, cat2 , hipot);
        System.out.print("Длинна гиптенузы равна: " + triag.hypotenuse);


}
    private static void Task_3() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите высоту: ");
        double h = scanner.nextInt();
        System.out.println("Введите массу: ");
        double m = scanner.nextInt();
        PotentialEnergy e = new PotentialEnergy(h, m);
        e.Energy();

    }

}