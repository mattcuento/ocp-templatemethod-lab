package lab.assignment.afterrefactoring.clientcode;

import lab.assignment.afterrefactoring.CoffeeMaker;

import lab.assignment.afterrefactoring.MochaMaker;

import lab.assignment.afterrefactoring.CappucinoMaker;

import lab.assignment.afterrefactoring.AmericanoMaker;

public class CoffeeClient {


    public static void main(String[] args) {
        MochaMaker mocha = new MochaMaker();
        mocha.makeCoffee();

        System.out.println("********************");

        CappucinoMaker cappucino = new CappucinoMaker();
        cappucino.makeCoffee();

        System.out.println("********************");

        AmericanoMaker americano = new AmericanoMaker();
        americano.makeCoffee();
    }

}
