/**
*	Class-Name: QuackCounter.java
*	Name: Kanyildiz Muhammedhizir
*	Klasse: 4AHITM
*	Datum: 15.05.2016
**/

package headfirst.designpatterns.combining.observer;

/**
*	Pattern: Decorator
*	Beschreibung: 	Diese Klasse implementiert vom Interface Quackable
					Die statische Methode numberOfQuacks wird mittels der Klasse QuackCounter hochgezählt und somit 
					werden die Enten um eine Counter-Funktion dekoriert. Die Duck-Implementationen sind die Kernkomponente, 
					wie in der Klasse CountingDuckFactory ersichtlich.
*					
**/

public class QuackCounter implements Quackable {
	
	//Klassenvariable duck vom Typen Quackable
	Quackable duck;
	//statische variable numberOfQuacks vom Typen numberOfQuacks
	static int numberOfQuacks;
  
	/**
	*	Methoden Name: QuackCounter
	*
	*	Der Konstruktor hat einen Parameter vom Typen Quackable.
	*	Somit setzt es die variable duck die es bekommt, auf die duck variable die in dieser Klasse deffiniert ist.(zuweißung)
	**/
	
	public QuackCounter(Quackable duck) {
		this.duck = duck;
	}
	/**
	*	Methoden Name: quack
	*
	*	Diese Methode ruft die Methode quack vom Interface Quackable auf.
	*	Dann wird die Int variable numberOfQuacks erhöt.
	**/
	public void quack() {
		duck.quack();
		numberOfQuacks++;
	}
 	/**
	*	Methoden Name: getQuacks
	*
	*	Es ist eine statische Methode mit dem Typen Integer.
	*	Rückgabewert; numberOfQuacks
	*	
	**/
	public static int getQuacks() {
		return numberOfQuacks;
	}
	
	/**
	*	Methoden Name: registerObserver
	*
	*	Es hat als Parameter einen observer
	*	In dieser Methode wird die Methode registerObserver mit dem Parameter observer aufgerufen. 
	*	Die Methode registerOberserver befindet sich in observable
	**/
	
	public void registerObserver(Observer observer) {
		duck.registerObserver(observer);
	}
	
 	/**
	*	Methoden Name: notifyObservers
	*
	*	Diese Methode ruft die Methode notifyObservers von der Klasse Observable auf.
	**/
	
	public void notifyObservers() {
		duck.notifyObservers();
	}
	
   	/**
	*	Methoden Name: toString
	*
	*	Diese Methode ruft Quckable auf und dies wird als String zurückgegeben.
	**/
	public String toString() {
		return duck.toString();
	}
}
