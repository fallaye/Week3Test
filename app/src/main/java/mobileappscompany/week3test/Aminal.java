package mobileappscompany.week3test;

/**
 * Created by fallaye on 12/15/17.
 */

public class Aminal implements Action {

    protected int energie;

    public int getEnergie() {
        return energie;
    }

    public void setEnergie(int energie) {
        this.energie = energie;
    }

    public Aminal() {}

    public Aminal(int energie) { this.energie = energie; }

    @Override
    public void makeSound() {
        energyLevel(this.getEnergie(), "sound");
    }

    @Override
    public void eatFood() {
        energyLevel(this.getEnergie(), "eat");

    }

    @Override
    public void sleep() {
        energyLevel(this.getEnergie(), "sleep");
    }

    protected void energyLevel(int energie, String action){
        switch (action){
            case "sound":
                this.energie = energie - 3;
                break;
            case "eat":
                this.energie = energie + 5;
                break;
            case "sleep":
                this.energie = energie + 10;
                default:
                    break;
        }
    }
}
