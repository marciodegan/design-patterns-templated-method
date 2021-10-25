package coffeeexample;

import coffeeexample.beverages.Coffee;
import coffeeexample.beverages.Tea;

public class TestBeveragePreparation {
    public static void main(String[] args) {
        Coffee coffee = new Coffee();
        coffee.prepareRecipe();

        System.out.println("=======");

        Tea tea = new Tea();
        tea.prepareRecipe();
    }
}
