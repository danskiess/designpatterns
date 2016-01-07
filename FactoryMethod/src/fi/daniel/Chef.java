package fi.daniel;

import com.sun.istack.internal.NotNull;

public interface Chef {
    Meal createMeal(@NotNull MealType mealType);
}
