package coffeeexample.beverages;

public abstract class CaffeineBeverage {

/*
    // como o método prepareRecipe() difere em cada subclasse, ele é definido com abstract.
    public abstract void prepareRecipe() {
        System.out.println("Preparing Beverage");
    };
*/

    // agora o mesmo método prepareRecipe() será usado para fazer Tea e Coffee.
    // É declarado como final pq queremos impedir nossas sublclasses de neutralizá-lo e mudar a receita.
     public void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }
    // como é compartilhada entre as subclasses, este método é definido na superclasse.
    public void boilWater(){
        System.out.println("Boiling Water");
    };

    // como é compartilhada entre as subclasses, este método é definido na superclasse.
    public void pourInCup(){
        System.out.println("Pouring in Cup");
    };

    // como coffee e tea lidam com estes métodos de diferentes maneiras,
    // ambos terão que ser declarados como abstratos para que as subclasses se preocupem com os detalhes.
    abstract void brew();
    abstract void addCondiments();
}
