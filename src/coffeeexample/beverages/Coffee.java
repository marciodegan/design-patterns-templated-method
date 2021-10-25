package coffeeexample.beverages;

import coffeeexample.beverages.CaffeineBeverage;

public class Coffee extends CaffeineBeverage {

    public void addCondiments() {
        System.out.println("Adding Sugar and Milk");
    }

    public void brew() {
        System.out.println("Grinding Coffee");
    }

}
