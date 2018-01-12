package com.au.hibernet.AssignmentHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Employee e = new Employee();
        e.setEid(101);
        e.setName("Shrey");
        e.setSalary(20000);
        
        Laptop laptop = new Laptop();
        laptop.setLid(10);
        laptop.setBrand("APPLE");
        laptop.setPrice("70000");
        
        e.setLaptop(laptop);
        
        Expenses exp = new Expenses();
        exp.setExid(1);
        exp.setAmount(100);
        

        Expenses exp1 = new Expenses();
        exp1.setExid(2);
        exp1.setAmount(50);
        
        e.getExpenses().add(exp);
        e.getExpenses().add(exp1);
        
        Configuration com = new Configuration().configure().addAnnotatedClass(Employee.class).addAnnotatedClass(Laptop.class).addAnnotatedClass(Expenses.class);
        SessionFactory sf = com.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tran = session.beginTransaction();
        session.save(exp);
        session.save(exp1);
        session.save(laptop);
        session.save(e);
        tran.commit();
        session.close();
    }
}
