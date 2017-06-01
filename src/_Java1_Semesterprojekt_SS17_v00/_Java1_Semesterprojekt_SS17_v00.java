// Semesterprojekt SS17, Interimsversion v00
//
//
// Hier in diesem ersten Entwicklungsschritt wird das Menue
// als Dialog-Schnittstelle zum Bentzer formuliert. 
//

package _Java1_Semesterprojekt_SS17_v00;

public class _Java1_Semesterprojekt_SS17_v00 {
static private boolean go_on = true;

	public static void main(String[] args) {
		while(go_on){
			main_menu();
		}
		
	}
	private static void main_menu() {
		int answer = 0;
		System.out.println("      FRIENDS - Kontakteverwaltung\n");
		System.out.println("Wollen Sie...\n");
		System.out.println("      eine neue Person aufnehmen > 1");
		System.out.println("               Records auflisten > 2");
		System.out.println("   Records in eine Datei sichern > 3");
		System.out.println("   Records aus einer Datei laden > 4");
		System.out.println("                  Datei loeschen > 5");
		System.out.println("          das Programm verlassen > 6");
		answer = StdInput.readInt();
		System.out.println("Die Antwort war: "+answer);
		if (answer == 6) {
			System.out.println("bye, bye...");
			System.exit(0); // Applikationsende
		}
	}

}
