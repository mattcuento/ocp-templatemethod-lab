package lab.assignment.beforerefactoring.clientcode;

import lab.assignment.beforerefactoring.CoffeeMakerTemplate;

import lab.assignment.beforerefactoring.MochaMaker;

import lab.assignment.beforerefactoring.CappucinoMaker;

import lab.assignment.beforerefactoring.AmericanoMaker;

public class CoffeeClient {


    public static void main(String[] args) {
        CoffeeMakerTemplate mocha = new MochaMaker();
        mocha.makeCoffee();

        System.out.println("********************");

        CoffeeMakerTemplate cappucino = new CappucinoMaker();
        cappucino.makeCoffee();

        System.out.println("********************");

        CoffeeMakerTemplate americano = new AmericanoMaker();
        americano.makeCoffee();
    }

}
