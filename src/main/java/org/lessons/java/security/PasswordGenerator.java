package org.lessons.java.security;

//salvare in opportune variabili il nome, cognome, colore preferito e data di nascita di un utente suddivisa in giorno, mese e anno in numero
//generare (e stampare a video) una password concatenando nome, cognome, colore preferito e somma di giorno, mese e anno di nascita, separate dal carattere -

import java.util.Scanner;

public class PasswordGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//String name = "dalila";
//String surname = "taldo";
//String favColour = "blu";
//short bornDay = 25;
//short bornMonth = 10;
//short bornYear = 1995;
//int bornSum = bornDay + bornMonth + bornYear;
		
//System.out.println(name + "-" + surname + "-" + favColour + "-" + bornSum);
		
Scanner input = new Scanner (System.in);

System.out.println("Digita il tuo nome");
String name = input.nextLine();
System.out.println("Digita il tuo conome");
String surname = input.nextLine();
System.out.println("Digita il tuo colore preferito");
String favColour = input.nextLine();
System.out.println("Digita il tuo giorno di nascita");
int bornDay = input.nextInt();
System.out.println("Digita il tuo mese di nascita");
int bornMonth = input.nextInt();
System.out.println("Digita il tuo anno di nascita");
int bornYear = input.nextInt();
int bornSum = bornDay + bornMonth + bornYear;

System.out.println(name + "-" + surname + "-" + favColour + "-" + bornSum);

	}

}



