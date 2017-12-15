package mobileappscompany.week3test;

/**
 * Created by fallaye on 12/15/17.
 */

public class Jungle {

    String [] food = {"meat", "fish", "bugs", "grain"};

    Aminal monkey = new Monkey();
    Aminal tiger = new Tiger();
    Aminal snake = new Snake();

    protected void jungleMakeSound(){
        snake.makeSound();
        tiger.makeSound();
        monkey.makeSound();
    }

}
