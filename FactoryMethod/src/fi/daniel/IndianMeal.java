package fi.daniel;

import com.sun.istack.internal.NotNull;

public class IndianMeal implements Meal {

    private MealType mealType;

    public IndianMeal(@NotNull  MealType mealType) {
        this.mealType = mealType;
    }

    @Override
    public String getDescription() {
        return "Indian " + mealType.toString() +", yum!";
    }

    @Override
    public MealType getMealType() {
        return mealType;
    }
}
