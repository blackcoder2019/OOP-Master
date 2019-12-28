package developer.arifkhan;

public class Main {

    public static void main(String[] args) {
        HamBurger hamBurger = new HamBurger("Basic", "Sausage", 3.56, "White");
        double price = hamBurger.itemizeHamBurger();
        hamBurger.addHamBurgerAddition1("Tomato", 0.27);
        hamBurger.addHamBurgerAddition2("Lettuce", 0.75);
        hamBurger.addHamBurgerAddition3("Cheese", 1.13);
        System.out.println("Total Burger price is " + hamBurger.itemizeHamBurger());

        HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.67);
        healthyBurger.addHealthAddition1("Egg", 5.43);
        healthyBurger.addHealthAddition2("Lentils", 3.41);
        System.out.println("Total Healthy Burger price is " + healthyBurger.itemizeHamBurger());

        DeluxeBurger deluxeBurger=new DeluxeBurger();
        deluxeBurger.addHamBurgerAddition1("Should not do this",50.53);
        deluxeBurger.itemizeHamBurger();


    }
}
