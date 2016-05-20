/**
 *  Class Name: AbstractDuckFactory.java
 *  Name: Kanyildiz Muhammedhizir
 *  Klasse: 4AHITM
 *  Datum: 15.5.2016
 */
package headfirst.designpatterns.combining.observer;

/**
 *  Pattern:
 */

public abstract class AbstractDuckFactory {
 
	public abstract Quackable createMallardDuck();
	public abstract Quackable createRedheadDuck();
	public abstract Quackable createDuckCall();
	public abstract Quackable createRubberDuck();
}
