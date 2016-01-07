package fi.daniel;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class IndianChefTest {

    Chef indianChef;

    @Before
    public void init(){
        indianChef = new IndianChef();
    }

    @Test
    public void prepareIndianSoup(){
        Meal meal = indianChef.createMeal(MealType.SOUP);
        assertTrue(meal instanceof IndianMeal);
        MealType mealType = meal.getMealType();
        assertEquals(mealType.toString().toUpperCase(), MealType.SOUP.name());
    }

    @Test
    public void prepareIndianMain(){
        Meal meal = indianChef.createMeal(MealType.MAIN);
        assertTrue(meal instanceof IndianMeal);
        MealType mealType = meal.getMealType();
        assertEquals(mealType.toString().toUpperCase(), MealType.MAIN.name());
    }

    @Test
    public void prepareIndianDessert(){
        Meal meal = indianChef.createMeal(MealType.DESSERT);
        assertTrue(meal instanceof IndianMeal);
        MealType mealType = meal.getMealType();
        assertEquals(mealType.toString().toUpperCase(), MealType.DESSERT.name());
    }

}