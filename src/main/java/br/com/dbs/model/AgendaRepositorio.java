package br.com.dbs.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class AgendaRepositorio {

	private Long nextId = 1L;
	private List<Agenda> agendas = new ArrayList();
	
	public void adiciona(Agenda agenda) {
		
		if (agendas.contains(agenda)) {
			agendas.remove(agenda);
			agendas.add(agenda);
		} else {
			agenda.setId(nextId++);
			agendas.add(agenda);
		}
	}
	
	public void remove(Agenda agenda) {
		agendas.remove(agenda);
	}
	
	public Collection<Agenda> todas() {
		return agendas;
	}
}
