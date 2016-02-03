package br.com.dbs.util;

public class CriaTabelas {

	public static void main(String[] args) {
		JPAUtil.createEntityManager();
		JPAUtil.closeEntityManager();
	}

}
