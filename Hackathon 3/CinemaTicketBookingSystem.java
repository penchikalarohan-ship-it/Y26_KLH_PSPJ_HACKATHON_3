
import java.util.Scanner;

class Cinema {
    String movieName;
    double ticketPrice;
    int tickets;
    String customerName;

    Cinema() {
        movieName = "Avatar";
        ticketPrice = 200;
    }

    Cinema(String m, double p) {
        movieName = m;
        ticketPrice = p;
    }

    void bookTicket(String name, int t) {
        customerName = name;
        tickets = t;
        display();
    }

    void bookTicket(String name, String movie, double price, int t) {
        customerName = name;
        movieName = movie;
        ticketPrice = price;
        tickets = t;
        display();
    }

    void display() {
        System.out.println();

        if (tickets <= 0) {
            System.out.println("Invalid number of tickets");
            return;
        }

        double total = ticketPrice * tickets;
        double discount = 0;

        if (tickets >= 5) {
            discount = total * 0.10;
        }

        double amount = total - discount;

        System.out.println("Customer Name      : " + customerName.toUpperCase());
        System.out.println("Movie Name         : " + movieName.toUpperCase());
        System.out.printf("Ticket Price       : Rs. %.2f%n", ticketPrice);
        System.out.println("Number of Tickets  : " + tickets);
        System.out.println("Booking Status     : Booking Successful");
        System.out.printf("Total Amount       : Rs. %.2f%n", total);
        System.out.printf("Discount           : Rs. %.2f%n", discount);
        System.out.printf("Final Amount       : Rs. %.2f%n", amount);
    }

    boolean checkName(String n1, String n2) {
        return n1.equalsIgnoreCase(n2);
    }
}

public class CinemaTicketBookingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("========== CINEMA TICKET BOOKING ==========");

        Cinema c1 = new Cinema();

        System.out.println("Enter customer name:");
        String name1 = sc.nextLine();

        System.out.println("Enter number of tickets:");
        int t1 = sc.nextInt();
        sc.nextLine();

        c1.bookTicket(name1, t1);

        Cinema c2 = new Cinema("Avatar", 200);

        System.out.println();
        System.out.println("Enter customer name:");
        String name2 = sc.nextLine();

        System.out.println("Enter number of tickets:");
        int t2 = sc.nextInt();

        c2.bookTicket(name2, "Avatar", 200, t2);

        System.out.println();

        if (c1.checkName(name1, name2)) {
            System.out.println("Customer Verification: Names Match");
        } else {
            System.out.println("Customer Verification: Names Do Not Match");
        }

        System.out.println("=============================================");

        sc.close();
    }
}
