package exp1.structural.adapter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MediaPlayer player = new MediaAdapter();

        while (true) {
            System.out.print("Enter type (mp3/mp4/exit): ");
            String type = scanner.nextLine().trim();
            if (type.equalsIgnoreCase("exit")) break;

            System.out.print("Enter file name: ");
            String file = scanner.nextLine().trim();

            player.play(type, file); // ✅ One simple call
        }
        scanner.close();
    }
}
