/**
*	Class-Name: Quackable.java
*	Name: Kanyildiz Muhammedhizir
*	Klasse: 4AHITM
*	Datum: 15.05.2016
**/

package headfirst.designpatterns.combining.observer;

/**
*	Pattern: Factory/Decorator Method
*	Beschreibung: 	Diese Klasse erbt von der Klasse QuackObservable
*					Somit Überschreibt es die Methoden der Klasse QuackObservable.
*					Diese Klasse ruft die Methode quack auf.
*					
**/

public interface Quackable extends QuackObservable {
	public void quack();
}
