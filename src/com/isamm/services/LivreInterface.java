package com.isamm.services;

import java.util.List;

import comm.isamm.beans.livre;


public interface LivreInterface {
	
	List<livre> findAll();
	Boolean FindOne(String isbn);


}
