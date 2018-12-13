package comm.isamm.dao;

import java.util.ArrayList;
import java.util.List;

import comm.isamm.beans.livre;


public class livreDAO {
	
	List<livre> listelivres =new ArrayList<livre>();
	
public livreDAO() {
		
	listelivres.add(new livre("programmation", "12345", "smith") );
	listelivres.add(new livre("programmation", "12345", "smith"));
	listelivres.add(new livre("programmation", "12345", "smith"));
	listelivres.add(new livre("programmation", "12345", "smith"));
	}


public List<livre> findAll(){
	
	return listelivres;
}

public boolean FindOne(String isbn) {
	int i=0;
	boolean trouve=false;
	livre l1=new livre();
	for(livre livre:listelivres ) {
		if(livre.getIsbn().equals("isbn")) {
			trouve=true;
		}
		
	}
	return trouve;
}


}
