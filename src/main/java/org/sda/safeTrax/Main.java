package org.sda.safeTrax;

import org.hibernate.SessionFactory;
import org.sda.safeTrax.config.HibernateConfiguration;
import org.sda.safeTrax.entities.Order;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        SessionFactory factory = HibernateConfiguration.getSessionFactory();

    }
}