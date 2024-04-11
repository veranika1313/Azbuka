import java.util.Scanner;

public class CountVowelsConstants {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите слово: ");
        String word = scanner.next();

        int vowels = 0;
        int consonants = 0;

        word = word.toLowerCase();

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (ch == 'а' || ch == 'е' || ch == 'и' || ch == 'о' || ch == 'у'|| ch == 'ы' || ch == 'ё') {
                vowels++;
            } else if (ch >= 'а' && ch <= 'я') {
                consonants++;
            }
        }

        System.out.println("Количество гласных букв: " + vowels);
        System.out.println("Количество согласных букв: " + consonants);
    }
}
