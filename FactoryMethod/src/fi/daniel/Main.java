package fi.daniel;

public class Main {

    public static void main(String[] args) {
        Chef chef = new AsianChef();
        System.out.println(chef.createMeal(MealType.SOUP).getDescription());
        System.out.println(chef.createMeal(MealType.MAIN).getDescription());
        System.out.println(chef.createMeal(MealType.DESSERT).getDescription());

        chef = new IndianChef();
        System.out.println(chef.createMeal(MealType.SOUP).getDescription());
        System.out.println(chef.createMeal(MealType.MAIN).getDescription());
        System.out.println(chef.createMeal(MealType.DESSERT).getDescription());
    }
}
