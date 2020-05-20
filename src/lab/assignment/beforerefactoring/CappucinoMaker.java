package lab.assignment.beforerefactoring;

public class CappucinoMaker extends CoffeeMaker {

    protected void addIngredients() {
        System.out.println("Add hot milk");
        System.out.println("Add cinnamon");
    }

    protected void finalTouch() {
        System.out.println("Top with milk foam");
    }
    
}