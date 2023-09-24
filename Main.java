import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in, "люблю грозу в начале мая");
        String line = sc.nextLine();
 
        String[] rus = {"у", "е", "ё", "ы", "а", "о", "э", "я", "и", "ю"};
        for (int i = 0; i < rus.length; i++) {
            line = line.replace(rus[i], "");
        }
	}
}