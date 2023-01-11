package com.mowltnow.tondeuse;

import java.util.List;

public class Pelouse {

	private int largeur;
	private int longueur;
	List<Tondeuse> listTondeuseDeployees;
	
	public Pelouse(int largeur, int longueur, List<Tondeuse> listTondeuseDeployees) {
		super();
		this.largeur = largeur;
		this.longueur = longueur;
		this.listTondeuseDeployees = listTondeuseDeployees;
	}

	
	
	public Pelouse() {
	}



	public int getLargeur() {
		return largeur;
	}

	public void setLargeur(int largeur) {
		this.largeur = largeur;
	}

	public int getLongueur() {
		return longueur;
	}

	public void setLongueur(int longueur) {
		this.longueur = longueur;
	}

	public List<Tondeuse> getListTondeuseDeployees() {
		return listTondeuseDeployees;
	}

	public void setListTondeuseDeployees(List<Tondeuse> listTondeuseDeployees) {
		this.listTondeuseDeployees = listTondeuseDeployees;
	}
	
	
	
	
}
