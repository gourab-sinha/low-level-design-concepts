package oops.designPatterns.decoratorV2.beverages.decorators;

import oops.designPatterns.decoratorV2.beverages.Beverage;

public class EspressoShotDecorator extends BeverageDecorator{
    public EspressoShotDecorator(Beverage beverage){
        super(beverage);
    }

    @Override
    public int cost() {
        return this.beverage.cost() + 10;
    }
}
