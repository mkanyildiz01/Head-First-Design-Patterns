/**
*	Class-Name: Observer.java
*	Name: Kanyildiz Muhammedhizir
*	Klasse: 4AHITM
*	Datum: 15.05.2016
**/

package headfirst.designpatterns.combining.observer;

/**
*	Observer ist ein Interface.
*	Dieses Interface deffiniert eine Methode update mit dem Parameter duck dessen Typ QuackObservable ist.
*	Diese Methode wird in Quackologist verwendet.
**/
public interface Observer {
	public void update(QuackObservable duck);
}
