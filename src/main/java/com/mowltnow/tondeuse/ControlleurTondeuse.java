package com.mowltnow.tondeuse;

public class ControlleurTondeuse {

	public static void impacterInstruction(Pelouse pelouse) {
		for (Tondeuse tondeuse : pelouse.getListTondeuseDeployees()) {
			for (Character instruction : tondeuse.getInstructions()) {
				switch (instruction) {
				case 'D':
					tondeuse.setOrientation(Orientation.getOrientationParValeur(
							tondeuse.getOrientation().getValue() == 3 ? 0 : tondeuse.getOrientation().getValue() + 1));
					break;

				case 'G':
					tondeuse.setOrientation(Orientation.getOrientationParValeur(
							tondeuse.getOrientation().getValue() == 0 ? 3 : tondeuse.getOrientation().getValue() - 1));
					break;

				case 'A':
					switch (tondeuse.getOrientation()) {
					case N:
						if (tondeuse.getOrdonnee() < pelouse.getLongueur()) {
							tondeuse.setOrdonnee(tondeuse.getOrdonnee() + 1);
						}
						break;
					case S:
						if (tondeuse.getOrdonnee() > 0) {
							tondeuse.setOrdonnee(tondeuse.getOrdonnee() - 1);
						}
						break;
					case E:
						if (tondeuse.getAbscisse() < pelouse.getLargeur()) {
							tondeuse.setAbscisse(tondeuse.getAbscisse() + 1);
						}
						break;
					case O:
						if (tondeuse.getAbscisse() > 0) {
							tondeuse.setAbscisse(tondeuse.getAbscisse() - 1);
						}
						break;
					}
					break;

				default:
					throw new RuntimeException("instruction invalide : elle doit etre D G ou A");
				}
			}
		}

	}

}
