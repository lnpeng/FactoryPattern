# FactoryPattern

The pizza store application illustrates **Abstract Factory Pattern** and **Factory Method Pattern**. 

The pizza store has two franchise operations `NYPizzaStore` and `ChicagoPizzaStore` that prepare, bake, cut and box pizza. The abstract factory method `createPizza` in `PizzaStore` defers pizza creation to the subclasses `NYPizzaStore` and `ChicagoPizzaStore` and all franchise pizza stores leverage other `PizzaStore` code so that the pizzas are prepared in the same way. The **Factory Method Pattern** gives us a way to encapsulate the instantiation of concreat products.

To ensure that each franchise is using quality ingredients, a franchise store is refered to an ingredient factory to create a family of ingredients, i.e. dough, sauce, cheese, etc.. `PizzaIngredientFactory` defines an interface for the factory. `NYPizzaIngredientFactory` and `ChicagoIngredientFactory` implement `PizzaIngredientFactory` to create ingridents in the NY or Chicago familiy. Class `Pizza`'s `prepare` method is made abstract and will accept ingredients from the ingredient factory. The concrete pizza class, i.e. `CheesePizza`, uses the ingredient factory to collect ingredients. The **Abstract Facotry Pattern** provides an interface for creating families of related or dependant objects without specifying their concrete classes.

