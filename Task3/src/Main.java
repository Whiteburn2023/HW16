import java.util.Scanner;
import java.util.SplittableRandom;

public class Main {
    public static void main(String[] args) {
        int spaceCount = 0;
        System.out.println("Введите ФИО");
        String input = new Scanner(System.in).nextLine().trim();
        for (int i = 0; i < input.length(); i++){
            if (input.charAt(i) == ' '){
            spaceCount++;
            }
        }
        if (input.matches("[А-я\\s-]+") && spaceCount == 2) {  //

            String[] arr = input.trim().split(" ");
            System.out.println("Фамилия: " + arr[0]);
            System.out.println("Имя: " + arr[1]);
            System.out.println("Отчество: " + arr[2]);
        } else {
            System.out.println("Введенная строка не является ФИО");
        }


        //todo ФИО
    }
}