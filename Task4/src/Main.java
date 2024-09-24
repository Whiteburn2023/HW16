import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            System.out.println("Введите телефонный номер: ");
            String phone = new Scanner(System.in).nextLine().trim();
            phone = phone.replaceAll("[^\\d]", "");
            if (phone.matches("^[78][0-9]{10}$")) {
                System.out.println(phone);
            } else if(phone.length() == 10){
                System.out.println(7 + phone);
            } else {
                System.out.println("Неверный формат номера");
            }
        }
    }
}