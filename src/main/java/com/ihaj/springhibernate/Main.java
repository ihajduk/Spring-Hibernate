package com.ihaj.springhibernate;

import com.ihaj.springhibernate.domain.entity.ProductsEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Created by iniu on 2016-04-16.
 */
public class Main {
    @Autowired
    ProductsEntity productsEntity;

    public void retrieve(){
        System.out.println("Kalorie serka wiejskiego = " + productsEntity.getProductCalories());
    }
    public void createProduct(){
        productsEntity.setProductId(4);
        productsEntity.setProductName("Kasza_jaglana");
        productsEntity.setProductCalories(378);
        productsEntity.setProductProtein(11);
        productsEntity.setProductCarbohydrate(73);
        productsEntity.setProductFat(4);
    }

    public void init(){
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("myDatabase");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();
        productsEntity = entityManager.getReference(ProductsEntity.class, 1);
        retrieve();
        entityManager.close();
        entityManagerFactory.close();
    }

    public static void main(String[] args) {
        Main performClass = new Main();

        ApplicationContext context = new ClassPathXmlApplicationContext("/META-INF/spring.xml");
        performClass.init();

        }
}
