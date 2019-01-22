package store;

import ingredients.Cheese;
import ingredients.Clams;
import ingredients.Dough;
import ingredients.Pepperoni;
import ingredients.Sauce;
import ingredients.Veggies;
import ingredients.concrete.FreshClams;
import ingredients.concrete.Garlic;
import ingredients.concrete.MarinaraSauce;
import ingredients.concrete.Mushroom;
import ingredients.concrete.Onion;
import ingredients.concrete.RedPepper;
import ingredients.concrete.ReggianoCheese;
import ingredients.concrete.SlicedPepperoni;
import ingredients.concrete.ThinCrustDough;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
 
	public Dough createDough() {
		return new ThinCrustDough();
	}
 
	public Sauce createSauce() {
		return new MarinaraSauce();
	}
 
	public Cheese createCheese() {
		return new ReggianoCheese();
	}
 
	public Veggies[] createVeggies() {
		Veggies veggies[] = { new Garlic(), new Onion(), new Mushroom(), new RedPepper() };
		return veggies;
	}
 
	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}

	public Clams createClam() {
		return new FreshClams();
	}
}
