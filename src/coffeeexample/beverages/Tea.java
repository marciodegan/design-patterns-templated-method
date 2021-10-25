package coffeeexample.beverages;

import coffeeexample.beverages.CaffeineBeverage;

public class Tea extends CaffeineBeverage {

    public void addCondiments() {
        System.out.println("Adding Lemon");
    }

    public void brew() {
        System.out.println("Adding tea bag");
    }

}
