package fi.daniel;

import com.sun.istack.internal.NotNull;

public class AsianChef implements Chef{

    @Override
    public Meal createMeal(@NotNull MealType mealType) {
        return new AsianMeal(mealType);
    }
}
