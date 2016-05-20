/**
*	Class-Name: DecoyDuck.java
*	Name: Kanyildiz Muhammedhizir
*	Klasse: 4AHITM
*	Datum: 15.05.2016
**/

package headfirst.designpatterns.combining.observer;

/**
*	Pattern: Factory/Decorator Method
*	Beschreibung: 	Diese Klasse implementiert vom Interface Quackable.
*					Somit enthlt es alle Attribute und Methoden(1 Methode in unserem Fall) von Quackable.
*					
**/

public class DecoyDuck implements Quackable {
	
	
	// Globale Variable: observable von der Klasse Observable
	Observable observable;

	/**
	*	Methoden Name: DecoyDuck
	*
	*	Es erstellt eine neue Instanz von Observable mit dem Parameter observable
	**/

	public DecoyDuck() {
		observable = new Observable(this);
	}
	
	/**
	*	Methoden Name: quack
	*
	*	Es gib ein String '<< Silence >>' in die Konsole aus.
	*	Dannach ruft es die Methode notifyObservers auf.
	*	
	**/
	
 
	public void quack() {
		System.out.println("<< Silence >>");
		notifyObservers();
	}
 
		/**
	*	Methoden Name: registerObserver
	*
	*	Es hat als Parameter einen observer
	*	In dieser Methode wird die Methode registerObserver mit dem Parameter observer aufgerufen. 
	*	Die Methode registerOberserver befindet sich in observable
	**/
	
	public void registerObserver(Observer observer) {
		observable.registerObserver(observer);
	}

	/**
	*	Methoden Name: notifyObservers
	*
	*	Diese Methode ruft die Methode notifyObservers von der Klasse Observable auf.
	**/
	
	public void notifyObservers() {
		observable.notifyObservers();
	}
	
	/**
	*	Methoden Name: toString
	*
	*	Diese Methode ist ein String und hat den Rückgabetypen: String
	*	Es gibt den Namen der Ente als String aus: 'Decoy Duck'
	**/
	public String toString() {
		return "Decoy Duck";
	}
}
