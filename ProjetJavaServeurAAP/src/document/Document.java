package document;

import abonne.Abonne;
import abonne.PasAutoriseException;

public interface Document {
	int numero();
	void reserver(Abonne ab) throws PasLibreException, PasAutoriseException ;
	void emprunter(Abonne ab) throws PasLibreException, PasAutoriseException;
	void retour() ; // document rendu ou annulation r�servation
}