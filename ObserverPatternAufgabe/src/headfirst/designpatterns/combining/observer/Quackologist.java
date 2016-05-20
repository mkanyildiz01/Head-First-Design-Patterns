/**
*	Class-Name: Quackologist.java
*	Name: Kanyildiz Muhammedhizir
*	Klasse: 4AHITM
*	Datum: 15.05.2016
**/

package headfirst.designpatterns.combining.observer;

/**
*	Pattern: Factory/Decorator Method
*	Beschreibung: 	Die Klasse Quackologist ist die einzige Observer (Beobachter)-Klasse. Alle Enten werden zur 
*					Observable-Klasse referenziert, welche die Quackologist-Klasse mittels der Methode update() 
*					benachrichtigt.
*					
**/

public class Quackologist implements Observer {
	
	/**
	*	Methoden Name: update
	*
	*	Diese Methode Gibt eine Nachricht in die Konsole aus. Diese Nachricht bekommt es als Parameter geliefert.
	**/
	
	public void update(QuackObservable duck) {
		System.out.println("Quackologist: " + duck + " just quacked.");
	}
	
 	/**
	*	Methoden Name: toString
	*
	*	Rückgabe: String: 'Quackologiest'
	**/
	
	public String toString() {
		return "Quackologist";
	}
}
