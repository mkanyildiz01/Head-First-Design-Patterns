/**
*	Class-Name: DuckSimulator.java
*	Name: Kanyildiz Muhammedhizir
*	Klasse: 4AHITM
*	Datum: 15.05.2016
**/

package headfirst.designpatterns.combining.observer;

/**
*	In diesr Klasse wird das Programm ausgeführt und somit die Testfälle.
*	Hier befindet sich die Main
*
**/

public class DuckSimulator {
	/**
	*	Main-Methode die DuckFactory aufruft.
	**/
	public static void main(String[] args) {
		DuckSimulator simulator = new DuckSimulator();
		AbstractDuckFactory duckFactory = new CountingDuckFactory();
 
		simulator.simulate(duckFactory);
	}
  
	/**
	*	Diese Methode ruft sämtliche DuckFactory Zusammenhängenden Methoden und Klassen auf.
	**/
	void simulate(AbstractDuckFactory duckFactory) {
		
		// Hier wird ein ReadHeadDuck erstellt
		Quackable redheadDuck = duckFactory.createRedheadDuck();
		// Hier wird ein DuckCall erstellt
		Quackable duckCall = duckFactory.createDuckCall();
		// Hier wird ein RubberDuck erstellt
		Quackable rubberDuck = duckFactory.createRubberDuck();
		// Hier wird ein Goose erstellt
		Quackable gooseDuck = new GooseAdapter(new Goose());
		// Hier wird ein Flock erstellt
		Flock flockOfDucks = new Flock();
		
		// Hier werden die Erstellten sachen geadded
		flockOfDucks.add(redheadDuck);
		flockOfDucks.add(duckCall);
		flockOfDucks.add(rubberDuck);
		flockOfDucks.add(gooseDuck);
		// Hier wird ein Flock erstellt
		Flock flockOfMallards = new Flock();
 
		// Hier werden mehrere MallardDucks erstellt
		Quackable mallardOne = duckFactory.createMallardDuck();
		Quackable mallardTwo = duckFactory.createMallardDuck();
		Quackable mallardThree = duckFactory.createMallardDuck();
		Quackable mallardFour = duckFactory.createMallardDuck();

		// Die Erstellen MallardDucks werden hinzugefügt
		flockOfMallards.add(mallardOne);
		flockOfMallards.add(mallardTwo);
		flockOfMallards.add(mallardThree);
		flockOfMallards.add(mallardFour);

		flockOfDucks.add(flockOfMallards);
		
		// Ausgabe
		System.out.println("\nDuck Simulator: With Observer");

		Quackologist quackologist = new Quackologist();
		flockOfDucks.registerObserver(quackologist);

		simulate(flockOfDucks);
		
		// Ausgabe
		System.out.println("\nThe ducks quacked " + 
		                   QuackCounter.getQuacks() + 
		                   " times");
	}
	
	/**
	*	Methoden Name: sumulate
	*
	*	Diese Klasse hat einen Parameter den es im Oberservable hinzufüht.
	**/
	void simulate(Quackable duck) {
		duck.quack();
	}
}
