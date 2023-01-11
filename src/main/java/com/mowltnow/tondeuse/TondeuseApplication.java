package com.mowltnow.tondeuse;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class TondeuseApplication {

	public static void main(String[] args) {
		try (BufferedReader reader = new BufferedReader(new FileReader("test.txt"))) {

			Pelouse pelouse = initialiserTaillePelouse(reader.readLine());

			String position, instructions;
			while ((position = reader.readLine()) != null && (instructions = reader.readLine()) != null)
				ajouterTondeuse(position, instructions, pelouse);

			ControlleurTondeuse.impacterInstruction(pelouse);

			pelouse.getListTondeuseDeployees().stream().forEach(t -> System.out
					.println("Tondeuse : " + t.getAbscisse() + " " + t.getOrdonnee() + " " + t.getOrientation()));
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	private static void ajouterTondeuse(String coordonneesInitialesTondeuse, String instructionsTondeuse,
			Pelouse pelouse) {

		StringTokenizer coordonneesInitialesTondeuseAsTokens = new StringTokenizer(coordonneesInitialesTondeuse, " ");
		//StringTokenizer instructionsTondeuseAsTokens = new StringTokenizer(instructionsTondeuse, "");
		
		int abscisseTondeuse = Integer.parseInt(coordonneesInitialesTondeuseAsTokens.nextToken());
		int ordonneeTondeuse = Integer.parseInt(coordonneesInitialesTondeuseAsTokens.nextToken());
		String orientationTondeuse = coordonneesInitialesTondeuseAsTokens.nextToken();
		List<Character> listeInstructions = instructionsTondeuse.chars().mapToObj(c -> (char)c).collect(Collectors.toList());
				
				//Collections.list(instructionsTondeuseAsTokens).stream()
				//.map(instructionAsToken -> ((String)instructionAsToken).charAt(0)).collect(Collectors.toList());

		Tondeuse tondeuse = new Tondeuse(abscisseTondeuse, ordonneeTondeuse, Orientation.valueOf(orientationTondeuse),
				listeInstructions);

		pelouse.getListTondeuseDeployees().add(tondeuse);

	}

	private static Pelouse initialiserTaillePelouse(String ligne) {
		StringTokenizer stringTokenizer = new StringTokenizer(ligne, " ");
		if (stringTokenizer.countTokens() != 2) {
			throw new RuntimeException("Erreur lors de l'initialisation de la Pelouse : nombre d'arguments incorrect");
		} else {
			return new Pelouse(Integer.parseInt(stringTokenizer.nextToken()),
					Integer.parseInt(stringTokenizer.nextToken()), new ArrayList<Tondeuse>());
		}
	}
}
