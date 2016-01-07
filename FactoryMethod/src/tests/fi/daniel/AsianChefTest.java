package fi.daniel;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AsianChefTest {

    Chef asianChef;

    @Before
    public void init(){
        asianChef = new AsianChef();
    }

    @Test
    public void prepareAsianSoup(){
        Meal meal = asianChef.createMeal(MealType.SOUP);
        assertTrue(meal instanceof AsianMeal);
        MealType mealType = meal.getMealType();
        assertEquals(mealType.toString().toUpperCase(), MealType.SOUP.name());
    }

    @Test
    public void prepareAsianMain(){
        Meal meal = asianChef.createMeal(MealType.MAIN);
        assertTrue(meal instanceof AsianMeal);
        MealType mealType = meal.getMealType();
        assertEquals(mealType.toString().toUpperCase(), MealType.MAIN.name());
    }

    @Test
    public void prepareAsianDessert(){
        Meal meal = asianChef.createMeal(MealType.DESSERT);
        assertTrue(meal instanceof AsianMeal);
        MealType mealType = meal.getMealType();
        assertEquals(mealType.toString().toUpperCase(), MealType.DESSERT.name());
    }
}