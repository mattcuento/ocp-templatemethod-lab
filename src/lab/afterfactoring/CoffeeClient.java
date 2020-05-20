package lab.assignment.afterrefactoring.clientcode;

import lab.assignment.afterrefactoring.CoffeeMakerTemplate;

import lab.assignment.afterrefactoring.MochaMaker;

import lab.assignment.afterrefactoring.CappucinoMaker;

import lab.assignment.afterrefactoring.AmericanoMaker;

public class CoffeeClient {


    public static void main(String[] args) {
        CoffeeMakerTemplate coffee = new MochaMaker();
        coffee.makeCoffee();

        System.out.println("********************");

        coffee = new CappucinoMaker();
        coffee.makeCoffee();

        System.out.println("********************");

        coffee = new AmericanoMaker();
        coffee.makeCoffee();
    }

}
