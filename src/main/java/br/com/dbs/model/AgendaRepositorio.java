package br.com.dbs.model;

import java.util.Collection;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.dbs.util.JPAUtil;

public class AgendaRepositorio {
	
	private EntityManager em = JPAUtil.createEntityManager();
	
	public void adiciona(Agenda agenda) {
		em.getTransaction().begin();
		em.persist(agenda);
		em.getTransaction().commit();
	}
	
	public void remove(Agenda agenda) {
		em.getTransaction().begin();
		em.remove(agenda);
		em.getTransaction().commit();
	}
	
	public Collection<Agenda> todas() {
		Query q = em.createQuery("select a from Agenda a");
		return q.getResultList();
	}
}
