package com.kh.finalkh11.controller;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class jpaMain {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("kh11fc");
		
	}

}
