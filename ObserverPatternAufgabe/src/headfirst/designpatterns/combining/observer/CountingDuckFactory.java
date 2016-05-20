/**
*	Class-Name: CountingDuckFactory.java
*	Name: Kanyildiz Muhammedhizir
*	Klasse: 4AHITM
*	Datum: 15.05.2016
**/
package headfirst.designpatterns.combining.observer;

/**
*	Pattern: Factory Method
*	Beschreibung: 	Dies ist eine Abstrakte Klasse mit Abstrakten Methoden.
* 					Es erbt von der AbstractDuckFactory Klasse.
					Damit hat es zugriff auf alle Abstrakte Methoden der Abstrakten Klasse: AbstractDuckFactory.(In diesem Beispiel)
					In den Methoden ruft es jeweils eine andere Duck-Klasse auf.
					
**/

public class CountingDuckFactory extends AbstractDuckFactory {
  
  	/**
	*	Methoden Name: createMallardDuck
	*
	*	In dieser Methode wird zuerst die Klasse QuackCouter aufgerufen.
	*	In der QuackCounter Klasse wird ein parameter erwartet.
	*	In deisem Parameter wird ein neuer  MallardDuck weitergegeben (instanziert).
	* 	Diese Methode wird als Quackable zurückgegeben.
	**/
	
	public Quackable createMallardDuck() {
		return new QuackCounter(new MallardDuck());
	}
	
  	/**
	*	Methoden Name: createRedheadDuck
	*
	*	In dieser Methode wird zuerst die Klasse QuackCouter aufgerufen.
	*	In der QuackCounter Klasse wird ein parameter erwartet.
	*	In deisem Parameter wird ein neuer  RedheadDuck weitergegeben (instanziert).
	* 	Diese Methode wird als Quackable zurückgegeben.
	**/
	
	public Quackable createRedheadDuck() {
		return new QuackCounter(new RedheadDuck());
	}
  	
	/**
	*	Methoden Name: createDuckCall
	*
	*	In dieser Methode wird zuerst die Klasse QuackCouter aufgerufen.
	*	In der QuackCounter Klasse wird ein parameter erwartet.
	*	In deisem Parameter wird ein neuer  DuckCall weitergegeben (instanziert).
	* 	Diese Methode wird als Quackable zurückgegeben.
	**/
	
	public Quackable createDuckCall() {
		return new QuackCounter(new DuckCall());
	}
    
	/**
	*	Methoden Name: createRubberDuck
	*
	*	In dieser Methode wird zuerst die Klasse QuackCouter aufgerufen.
	*	In der QuackCounter Klasse wird ein parameter erwartet.
	*	In deisem Parameter wird ein neuer  RubberDuck weitergegeben (instanziert).
	* 	Diese Methode wird als Quackable zurückgegeben.
	**/
	public Quackable createRubberDuck() {
		return new QuackCounter(new RubberDuck());
	}
}
