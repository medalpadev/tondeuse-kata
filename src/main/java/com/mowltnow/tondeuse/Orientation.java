package com.mowltnow.tondeuse;

import java.util.HashMap;
import java.util.Map;

public enum Orientation {
	N(0), E(1), S(2), O(3);

	Orientation(int i) {
		this.value = i;
	}

	public final int value;
	private static final Map<Integer, Orientation> listeOrientationParValeur = new HashMap<>();

	public int getValue() {
		return value;
	}

	public static Orientation getOrientationParValeur(Integer valeur) {
		return listeOrientationParValeur.get(valeur);
	}

	static {
		for (Orientation orientation : values()) {
			listeOrientationParValeur.put(orientation.value, orientation);
		}
	}

}
