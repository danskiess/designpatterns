package fi.daniel;

import com.sun.istack.internal.NotNull;

public class AsianMeal implements Meal {

    private MealType mealType;

    public AsianMeal(@NotNull  MealType mealType) {
        this.mealType = mealType;
    }

    @Override
    public String getDescription() {
        return "Asian " + mealType.toString() + ", yum!";
    }

    @Override
    public MealType getMealType() {
        return mealType;
    }
}
