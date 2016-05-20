/**
*	Class-Name: Observable.java
*	Name: Kanyildiz Muhammedhizir
*	Klasse: 4AHITM
*	Datum: 15.05.2016
**/

package headfirst.designpatterns.combining.observer;

/**
*	Pattern: Observer
*	Beschreibung: 	Es Implementiert QuackObservable
					Die Klasse Quackologist ist die einzige Observer (Beobachter)-Klasse. 
*					Alle Enten werden zur Observable-Klasse referenziert, welche die 
*					Quackologist-Klasse mittels der Methode update() benachrichtigt.
*
*					
**/

import java.util.Iterator;
import java.util.ArrayList;

public class Observable implements QuackObservable {
	// Klassen Array mit dem Typen Observer und dem namen observer
	ArrayList<Observer> observers = new ArrayList<Observer>();
	// Klassen Variable mit dem Typen QuackObservable mit dem namen duck
	QuackObservable duck;
	
		/**
	*	Methoden Name: Observable
	*
	*	Der Konstruktor hat einen Parameter vom Typen QuackObservable.
	*	Somit setzt es die variable duck die es bekommt, auf die duck variable die in dieser Klasse deffiniert ist.(zuweißung)
	**/
	public Observable(QuackObservable duck) {
		this.duck = duck;
	}
	
	/**
	*	Methoden Name: registerObserver
	*
	*	Es hat als Parameter einen observer
	*	In dieser Methode wird die Methode registerObserver mit dem Parameter observer aufgerufen. 
	*	Die Methode fügt obversers ins ArrayList hinzu
	**/
	public void registerObserver(Observer observer) {
		observers.add(observer);
	}
	/**
	*	Methoden Name: notifyObservers
	*
	*	Hier befindet sich ein Iterator mit dem man alle elemente vom Arraylist durchgehen kann und dies auch gemacht wird.
	*	Es wird noch dazu überprüft.
	**/
	public void notifyObservers() {
		Iterator<Observer> iterator = observers.iterator();
		while (iterator.hasNext()) {
			Observer observer = iterator.next();
			observer.update(duck);
		}
	}
	/**
	*	Methoden Name: getObservers
	*
	*	Typ: Iterator<Observer>
	*	Rückgabe: observer mit dem iterator
	**/
	public Iterator<Observer> getObservers() {
		return observers.iterator();
	}
}
