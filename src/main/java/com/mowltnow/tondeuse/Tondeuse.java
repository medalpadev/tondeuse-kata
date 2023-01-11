package com.mowltnow.tondeuse;

import java.util.List;

public class Tondeuse {
	
	private int abscisse;
	private int ordonnee;
	private Orientation orientation;
	private List<Character> instructions;
	
	public Tondeuse() {
	}

	public Tondeuse(int abscisse, int ordonnee, Orientation orientation, List<Character> instructions) {
		super();
		this.abscisse = abscisse;
		this.ordonnee = ordonnee;
		this.orientation = orientation;
		this.setInstructions(instructions);
	}

	public int getAbscisse() {
		return abscisse;
	}

	public void setAbscisse(int abscisse) {
		this.abscisse = abscisse;
	}

	public int getOrdonnee() {
		return ordonnee;
	}

	public void setOrdonnee(int ordonnee) {
		this.ordonnee = ordonnee;
	}

	public Orientation getOrientation() {
		return orientation;
	}

	public void setOrientation(Orientation orientation) {
		this.orientation = orientation;
	}

	public List<Character> getInstructions() {
		return instructions;
	}

	public void setInstructions(List<Character> instructions) {
		this.instructions = instructions;
	}

	
	

}
