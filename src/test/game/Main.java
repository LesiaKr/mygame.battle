package test.game;
//Зробити міні-гру - битва. Створити одну сутність -
//шаблонний варіант воїна. Зробити декілька типів воїнівнаслідників. Кожен з них має свої особливості , наприклад
//hp, зброя і т.д. Тут потрібно проявити свою фантазію і додавати класи, які хочеться. Потім має бути
// битва. Воїни можуть атакувати, якщо вони атакують, життя зменшується. На кожному етапі показувати інфу
import java.util.Scanner;

public class Main {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        WarriorOne warriorOne = new WarriorOne("Воїн №1", "ніж", 200, 1000);
        System.out.println(warriorOne.getName() + "\nhp: " + warriorOne.getHp() + "\nзброя: " + warriorOne.getWeapon()
                + "(" + warriorOne.getPower() + ")");
        System.out.println();

        WarriorTwo warriorTwo = new WarriorTwo("Воїн №2", "шабля", 300, 800);
        System.out.println(warriorTwo.getName() + "\nhp: " + warriorTwo.getHp() + "\nзброя: " + warriorTwo.getWeapon()
                + "(" + warriorTwo.getPower() + ")");
        System.out.println();

        WarriorThree warriorThree = new WarriorThree("Воїн №3", "пістолет", 500, 500);
        System.out.println(warriorThree.getName() + "\nhp: " + warriorThree.getHp() + "\nзброя: " + warriorThree.getWeapon()
                + "(" + warriorThree.getPower() + ")");
        System.out.println("\nБитва!!!");

        while (true) {
            System.out.println("\nВведіть номер воїна, що атакує: ");
            int numWarrior = sc.nextInt();
            System.out.println("Введіть номер воїна, якого атакують: ");
            int numTarget = sc.nextInt();

            if (numWarrior > 3 || numTarget > 3){
                System.out.println("Такого Воїна не існує. Спробуйте ще раз.");
            } else if (numWarrior == 1 && numTarget == 2){
                    warriorOne.attack(warriorTwo);
            } else if (numWarrior == 1 && numTarget == 3) {
                warriorOne.attack(warriorThree);
            } else if (numWarrior == 1 && numTarget == 1) {
                System.out.println("Це самогубство...Спробуйте ще раз.");
            } else if (numWarrior == 2 && numTarget == 1) {
                warriorTwo.attack(warriorOne);
            } else if (numWarrior == 2 && numTarget == 3) {
                warriorTwo.attack(warriorThree);
            } else if (numWarrior == 2 && numTarget == 2) {
                System.out.println("Це самогубство...Спробуйте ще раз.");
            } else if (numWarrior == 3 && numTarget == 1) {
                warriorThree.attack(warriorOne);
            } else if (numWarrior == 3 && numTarget == 2) {
                warriorThree.attack(warriorTwo);
            } else if (numWarrior == 3 && numTarget == 3) {
                System.out.println("Це самогубство...Спробуйте ще раз.");
            } else {
                System.out.println("Спробуйте ще раз.");
            }

            if (warriorTwo.getHp() <= 0 && warriorThree.getHp() <= 0) {
                System.out.println(" ");
                System.out.println("Битва закінчилась! Переміг " + warriorOne.getName());
                break;
            }
            if (warriorOne.getHp() <= 0 && warriorThree.getHp() <= 0) {
                System.out.println(" ");
                System.out.println("Битва закінчилась! Переміг " + warriorTwo.getName());
                break;
            }
            if (warriorTwo.getHp() <= 0 && warriorOne.getHp() <= 0) {
                System.out.println(" ");
                System.out.println("Битва закінчилась! Переміг " + warriorThree.getName());
                break;
            }
        }
    }
}
