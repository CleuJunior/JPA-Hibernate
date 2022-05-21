package br.treinamentojpa.aplicacao;

import br.treinamentojpa.dominio.Pessoa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Programa {
    public static void main(String[] args) {

//        Pessoa p1 = new Pessoa(null, "Silvo Luiz", "silvo.luiz@outlook.com");
//        Pessoa p2 = new Pessoa(null, "Renata Franca", "renata.89@gmail.com");
//        Pessoa p3 = new Pessoa(null, "Flavio Souza", "souza.fernando.flavio@gmail.com");


        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
        EntityManager em = emf.createEntityManager();

        Pessoa pessoaDeletar = em.find(Pessoa.class, 2);

        em.getTransaction().begin();

        em.remove(pessoaDeletar);


//        em.persist(p1);
//        em.persist(p2);
//        em.persist(p3);

        em.getTransaction().commit();

        System.out.println("Terminate");
        em.close();
        emf.close();

    }
}
