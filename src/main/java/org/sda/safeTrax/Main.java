package org.sda.safeTrax;

import org.hibernate.SessionFactory;
import org.sda.safeTrax.config.HibernateConfiguration;
import org.sda.safeTrax.entities.Order;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        SessionFactory factory = HibernateConfiguration.getSessionFactory();

        System.out.println();
        System.out.println();
        System.out.println("----------- Welcome to SafeTrax -------------");
        System.out.println(" Please select an action:");

        System.out.println();
        String selection = "";
        while (!selection.equals("exit")) {
            System.out.println("(1) - Type 1 to insert a package");
            System.out.println("(2) - Type 2 to change package status");
            System.out.println("(3) - Type 3 to show details");
            System.out.println("(4) - Type 'exit' to close the application");


            selection = scanner.nextLine();
        }
    }
}