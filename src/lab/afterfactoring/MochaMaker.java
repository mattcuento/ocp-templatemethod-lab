package lab.assignment.afterrefactoring;

public class MochaMaker extends CoffeeMakerTemplate {

    protected void addIngredients() {
        System.out.println("Adding cocoa powder");
        System.out.println("Adding hot milk");
    }

    protected void finalTouch() {
        System.out.println("Adding sugar");
    }
    
}