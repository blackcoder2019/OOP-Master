package developer.arifkhan;

public class DeluxeBurger extends HamBurger{
    @Override
    public void addHamBurgerAddition1(String name, double price) {
        System.out.println("Can not add additional items to a delux burger ");

    }

    @Override
    public void addHamBurgerAddition2(String name, double price) {
        System.out.println("Can not add additional items to a delux burger ");

    }

    @Override
    public void addHamBurgerAddition3(String name, double price) {
        System.out.println("Can not add additional items to a delux burger ");

    }

    @Override
    public void addHamBurgerAddition4(String name, double price) {
        System.out.println("Can not add additional items to a delux burger ");

    }

    public DeluxeBurger() {
        super("Deluxe", "Sausage & Bacon", 14.53, "White");
        super.addHamBurgerAddition1("Chips",2.75);
        super.addHamBurgerAddition2("Drink",1.81);


    }
}
