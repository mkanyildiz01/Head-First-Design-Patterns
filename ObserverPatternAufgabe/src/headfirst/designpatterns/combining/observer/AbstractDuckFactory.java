/**
*	Class-Name: AbstractDuckFactory.java
*	Name: Kanyildiz Muhammedhizir
*	Klasse: 4AHITM
*	Datum: 15.05.2016
**/
package headfirst.designpatterns.combining.observer;

/**
*	Pattern: Factory Method
*	Beschreibung: 	Dies ist eine Abstrakte Klasse mit Abstrakten Methoden.
* 					Dies ermäglicht den Kind Klassen die Methoden zu Überschreiben.
*					Das heißt, wenn die Methoden von CountingDuckFactory oder DuckFactory aufgerufen werden, wird die Mehtode in AbstractDuckFactory aufgerufen.
*					
*					DuckFactory und CountingDuckFactory instanziiert und werden als Quackable zurückgegeben.
*
*					Es wird nicht implementiert: Daher ist es keine AbstractFactory sondern MethodFactory			
**/
public abstract class AbstractDuckFactory {
 
	public abstract Quackable createMallardDuck();
	public abstract Quackable createRedheadDuck();
	public abstract Quackable createDuckCall();
	public abstract Quackable createRubberDuck();
}
