package lab.assignment.beforerefactoring.clientcode;

import lab.assignment.beforerefactoring.CoffeeMaker;

import lab.assignment.beforerefactoring.MochaMaker;

import lab.assignment.beforerefactoring.CappucinoMaker;

import lab.assignment.beforerefactoring.AmericanoMaker;

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
