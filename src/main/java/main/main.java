package main;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import main.models.users_model;

public class main
{
    public static void main(String []args)
    {
        try {
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("connection");
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
//        EntityManager em=emf.createEntityManager();
//        em.getTransaction().begin();
//
//        users_model user=new users_model();
//        user.setName("Reza");
//        user.setFamily("Farazi");
//        user.setNational_id("123456798");
//        em.persist(user);

    }
}
