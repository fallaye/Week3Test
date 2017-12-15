package mobileappscompany.week3test;

/**
 * Created by fallaye on 12/15/17.
 */

public class Tiger extends Aminal {
    static int numTiger;

    public Tiger() {
    }

    public Tiger(int energie) {
        super(energie);
    }

    @Override
    public void sleep(){
        int energie = this.getEnergie() + 5;
        this.setEnergie(energie);
    }
}
