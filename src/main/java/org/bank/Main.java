package org.bank;

import org.bank.pojo.BankAccount;
import org.bank.pojo.Customer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.Transaction;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setId(1);
        customer.setName("Kareem Emad El-Farargi");
        customer.setEmail("kareememadelfrargi@gmail.com");

        BankAccount bankAccount1 = new BankAccount();
        bankAccount1.setAccountNumber(123456);
        bankAccount1.setBalance(5000.0);
        bankAccount1.setType("Savings");
        bankAccount1.setCustomer(customer);

        BankAccount bankAccount2 = new BankAccount();
        bankAccount2.setAccountNumber(123457);
        bankAccount2.setBalance(10000.0);
        bankAccount2.setType("Checking");
        bankAccount2.setCustomer(customer);

        customer.setBankAccounts(Arrays.asList(bankAccount1,bankAccount2));

        SessionFactory sessionFactory = new Configuration()
                .addAnnotatedClass(org.bank.pojo.BankAccount.class)
                .addAnnotatedClass(org.bank.pojo.Customer.class)
                .configure().buildSessionFactory();
        Session session = sessionFactory.openSession();

        Transaction transaction = session.beginTransaction();

        session.persist(customer);

        transaction.commit();

        //region
        session.close();
        sessionFactory.close();
        //endregion

        System.out.println("Data Inserted Successfully!");

    }
}