package oops.designPatterns.decoratorV2.beverages.decorators;

import oops.designPatterns.decoratorV2.beverages.Beverage;

public abstract class BeverageDecorator extends Beverage {
    Beverage beverage;
    public BeverageDecorator(Beverage beverage){
        this.beverage=beverage;
    }
}
