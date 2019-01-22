package store;

import ingredients.Cheese;
import ingredients.Clams;
import ingredients.Dough;
import ingredients.Pepperoni;
import ingredients.Sauce;
import ingredients.Veggies;
import ingredients.concrete.BlackOlives;
import ingredients.concrete.Eggplant;
import ingredients.concrete.FrozenClams;
import ingredients.concrete.MozzarellaCheese;
import ingredients.concrete.PlumTomatoSauce;
import ingredients.concrete.SlicedPepperoni;
import ingredients.concrete.Spinach;
import ingredients.concrete.ThickCrustDough;

public class ChicagoPizzaIngredientFactory 
	implements PizzaIngredientFactory 
{

	public Dough createDough() {
		return new ThickCrustDough();
	}

	public Sauce createSauce() {
		return new PlumTomatoSauce();
	}

	public Cheese createCheese() {
		return new MozzarellaCheese();
	}

	public Veggies[] createVeggies() {
		Veggies veggies[] = { new BlackOlives(), 
		                      new Spinach(), 
		                      new Eggplant() };
		return veggies;
	}

	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}

	public Clams createClam() {
		return new FrozenClams();
	}
}
