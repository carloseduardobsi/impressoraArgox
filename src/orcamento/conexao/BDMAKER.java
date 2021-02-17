package orcamento.conexao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class BDMAKER {

    private static final EntityManagerFactory emfPu = Persistence.createEntityManagerFactory("Dbmaker");

    public static EntityManager getEntityManager() {
        return emfPu.createEntityManager();
    }
    

}