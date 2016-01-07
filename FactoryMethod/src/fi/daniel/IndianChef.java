package fi.daniel;

import com.sun.istack.internal.NotNull;

public class IndianChef implements Chef {

    @Override
    public Meal createMeal(@NotNull MealType mealType) {
        return new IndianMeal(mealType);
    }
}
