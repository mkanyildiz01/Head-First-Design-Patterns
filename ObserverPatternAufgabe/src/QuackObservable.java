/**
*	Class-Name: QuackObservable.java
*	Name: Kanyildiz Muhammedhizir
*	Klasse: 4AHITM
*	Datum: 15.05.2016
**/

package headfirst.designpatterns.combining.observer;

/**
*
*	Diese Klasse ist ein Interface.
*	Es beeinhaltet 2 Methoden.
*
**/
public interface QuackObservable {
	/**
	*	Die Methode registerObserver hat einen Parameter mit dem Typen Observer.
	**/
	public void registerObserver(Observer observer);
	public void notifyObservers();
}
