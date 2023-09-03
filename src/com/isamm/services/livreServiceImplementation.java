package com.isamm.services;

import java.util.List;


import comm.isamm.beans.livre;
import comm.isamm.dao.livreDAO;

public class livreServiceImplementation implements LivreInterface {
	livreDAO l=new livreDAO() ;


	@Override
	public List<livre> findAll() {
		// TODO Auto-generated method stub
		return l.findAll();
	}

	@Override
	public Boolean FindOne(String isbn) {
		// TODO Auto-generated method stub
		return l.FindOne(isbn);
	}

}
