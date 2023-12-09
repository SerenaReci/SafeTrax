package org.sda.safeTrax;

import org.hibernate.SessionFactory;
import org.sda.safeTrax.config.HibernateConfiguration;
import org.sda.safeTrax.entities.Order;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in)
        SessionFactory factory = HibernateConfiguration.getSessionFactory();

    }
}