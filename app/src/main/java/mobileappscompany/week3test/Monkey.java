package mobileappscompany.week3test;

/**
 * Created by fallaye on 12/15/17.
 */

public class Monkey extends Aminal {

    static int numMonkey;

    public Monkey(){}

    public Monkey(int energie) {
        super(energie);
    }

    @Override
    public void eatFood(){
        int energie = this.getEnergie() + 2;
        this.setEnergie(energie);
    }

    @Override
    public void makeSound(){
        int energie = this.getEnergie() - 4;
        this.setEnergie(energie);
    }

    public void play() {
        System.out.print("Oooo Oooo Oooo");
        if (energie <= 0)
            System.out.print("Monkey is too tired.");
        else
            this.energie = this.energie - 8;
    }

}
