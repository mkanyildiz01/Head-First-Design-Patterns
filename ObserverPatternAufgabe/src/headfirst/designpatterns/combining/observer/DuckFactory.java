/**
*	Class-Name: DuckFactory.java
*	Name: Kanyildiz Muhammedhizir
*	Klasse: 4AHITM
*	Datum: 15.05.2016
**/
package headfirst.designpatterns.combining.observer;
/**
*	Pattern: Factory Method
*	Beschreibung: 	Dies ist eine Abstrakte Klasse mit Abstrakten Methoden.
* 					Es erbt von der AbstractDuckFactory Klasse.
*					Damit hat es zugriff auf alle Abstrakte Methoden der Abstrakten Klasse: AbstractDuckFactory.(In diesem Beispiel)
*					In den Methoden ruft es jeweils eine andere Duck-Klasse auf.
*					
**/
public class DuckFactory extends AbstractDuckFactory {
    /**
	*	Methoden Name: createMallardDuck
	*
	*	In dieser Methode wird ein MallardDuck Instanziert.
	* 	Diese Methode wird als Quackable zurückgegeben.
	**/
	public Quackable createMallardDuck() {
		return new MallardDuck();
	}
    /**
	*	Methoden Name: createRedheadDuck
	*
	*	In dieser Methode wird ein RedheadDuck Instanziert.
	* 	Diese Methode wird als Quackable zurückgegeben.
	**/
	public Quackable createRedheadDuck() {
		return new RedheadDuck();
	}
    /**
	*	Methoden Name: createDuckCall
	*
	*	In dieser Methode wird ein DuckCall Instanziert.
	* 	Diese Methode wird als Quackable zurückgegeben.
	**/
	public Quackable createDuckCall() {
		return new DuckCall();
	}
    /**
	*	Methoden Name: createRubberDuck
	*
	*	In dieser Methode wird ein RubberDuck Instanziert.
	* 	Diese Methode wird als Quackable zurückgegeben.
	**/
	public Quackable createRubberDuck() {
		return new RubberDuck();
	}
}
