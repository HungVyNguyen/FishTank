package oop2opgave;

import java.util.Scanner;

public class Varelerger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Hvor mange låneenheder ønskes indtastet? ");
        int numItems = scanner.nextInt();
        scanner.nextLine(); // Tøm bufferen

        LoanItem[] loanItems = new LoanItem[numItems];

        for (int i = 0; i < numItems; i++) {
            System.out.print("Indtast type (bog eller video): ");
            String type = scanner.nextLine();

            System.out.print("Indtast titel: ");
            String title = scanner.nextLine();

            if ("bog".equalsIgnoreCase(type)) {
                System.out.print("Indtast forfatter: ");
                String author = scanner.nextLine();
                loanItems[i] = new Book(title, author);
            } else if ("video".equalsIgnoreCase(type)) {
                System.out.print("Indtast varighed (i minutter): ");
                int duration = scanner.nextInt();
                scanner.nextLine(); // Tøm bufferen
                loanItems[i] = new Video(title, duration);
            } else {
                System.out.println("Ugyldig type. Kun 'bog' eller 'video' er tilladt.");
                i--; // Gentag indtastning for samme indeks
            }
        }

        // Output
        System.out.println("\nLåneenheder:");

        for (LoanItem item : loanItems) {
            if (item != null) {
                System.out.println("Type: " + item.getType());
                System.out.println("Titel: " + item.getTitle());

                if (item instanceof Book) {
                    Book book = (Book) item;
                    System.out.println("Forfatter: " + book.getAuthor());
                } else if (item instanceof Video) {
                    Video video = (Video) item;
                    System.out.println("Varighed: " + video.getDuration() + " minutter");
                }

                System.out.println();
            }
        }

        scanner.close();
    }
}