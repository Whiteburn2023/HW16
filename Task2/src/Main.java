import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
        String text = new Scanner(System.in).nextLine();
        System.out.println(method(text));

            //"My Wonderful Family. I live in a house near the mountains. I have two brothers and one sister, and I was born last. My father teaches mathematics, and my mother is a nurse at a big hospital. My brothers are very smart and work hard in school. My sister is a nervous girl, but she is very kind. My grandmother also lives with us. She came from Italy when I was two years old. She has grown old, but she is still very strong. She cooks the best food! My family is very important to me. We do lots of things together. My brothers and I like to go on long walks in the mountains. My sister likes to cook with my grandmother. On the weekends we all play board games together. We laugh and always have a good time. I love my family very much. ";

    }
    public static String method(String text){
        text = text.replaceAll("[,.!+-;:]", "");
        return text.replaceAll("\\s+", "\n");

        /*
        String input = text.replaceAll("[.,!:;]", "");
        String[] arr = input.split(" ");
        for (String name : arr) {
            System.out.println(name);
        }
         */
    }

    //todo метод

}