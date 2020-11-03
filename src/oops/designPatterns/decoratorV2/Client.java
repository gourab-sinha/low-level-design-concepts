package oops.designPatterns.decoratorV2;

import oops.designPatterns.decoratorV2.beverages.Beverage;
import oops.designPatterns.decoratorV2.beverages.Espresso;
import oops.designPatterns.decoratorV2.beverages.decorators.ChocolateDecorator;
import oops.designPatterns.decoratorV2.beverages.decorators.EspressoShotDecorator;

public class Client {
    public static void main(String[] args) {
        Espresso coffee = new Espresso();
        System.out.println(coffee.cost());

        Beverage coffeeWithChocolate = new ChocolateDecorator(coffee);
        System.out.println(coffeeWithChocolate.cost());

        Beverage coffeeWithDoubleChocolate = new ChocolateDecorator(coffeeWithChocolate);
        System.out.println(coffeeWithDoubleChocolate.cost());

        Beverage coffeeWithChocolateAndEspressoShot = new EspressoShotDecorator(coffeeWithDoubleChocolate);
        System.out.println(coffeeWithChocolateAndEspressoShot.cost());
    }
}
