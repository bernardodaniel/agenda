package br.com.dbs.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class AgendaRepositorio {

	private Long nextId = 1L;
	private List<Agenda> agendas = new ArrayList();
	
	public void adiciona(Agenda agenda) {
		agenda.setId(nextId++);
		if (agendas.contains(agenda)) {
			agendas.add(agendas.indexOf(agenda), agenda);
		} else {
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
