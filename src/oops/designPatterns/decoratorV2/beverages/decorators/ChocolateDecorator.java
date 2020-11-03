package oops.designPatterns.decoratorV2.beverages.decorators;

import oops.designPatterns.decoratorV2.beverages.Beverage;

public class ChocolateDecorator extends BeverageDecorator{

    public ChocolateDecorator(Beverage beverage){
        super(beverage);
    }

    @Override
    public int cost() {
        return this.beverage.cost() + 5;
    }
}
