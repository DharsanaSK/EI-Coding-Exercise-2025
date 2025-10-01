package exp1.behavioral.observer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NewsAgency agency = new NewsAgency();

        Observer channel1 = new NewsChannel("Channel A");
        Observer channel2 = new NewsChannel("Channel B");

        agency.attach(channel1);
        agency.attach(channel2);

        System.out.println("Enter news updates. Type 'exit' to quit.");
        while (true) {
            System.out.print("News: ");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("exit")) break;

            agency.setNews(input);
        }

        System.out.println("News updates finished.");
        scanner.close();
    }
}
