/**
*	Class-Name: Quackable.java
*	Name: Kanyildiz Muhammedhizir
*	Klasse: 4AHITM
*	Datum: 15.05.2016
**/

package headfirst.designpatterns.combining.observer;

/**
*	Pattern: Factory Method/Decorator/Adapter
*	Beschreibung: 	Dieses Interface erbt von der Klasse QuackObservable
*					Somit Überschreibt es die Methoden der Klasse QuackObservable.
*					Außerdem ist es ein Interface					
*					Diese Klasse deffiniert und stellt die Methode quack zu verfügung damit die anderen Klassen diese Überschreiben können.
*					
**/

public interface Quackable extends QuackObservable {
	public void quack();
}
