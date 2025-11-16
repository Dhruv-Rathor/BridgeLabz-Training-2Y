import java.util.List;
import java.util.ArrayList;

interface MealPlan {
    String getPlanName();
}

class VegetarianMeal implements MealPlan {
    public String getPlanName() { return "Vegetarian"; }
}

class VeganMeal implements MealPlan {
    public String getPlanName() { return "Vegan"; }
}

class KetoMeal implements MealPlan {
    public String getPlanName() { return "Keto"; }
}

class Meal<T extends MealPlan> {
    private T plan;
    public Meal(T plan) {
        this.plan = plan;
    }
    public String toString() {
        return "Generated " + plan.getPlanName() + " Meal";
    }
}

public class MealPlanGenerator {

    public static <T extends MealPlan> Meal<T> generatePersonalizedPlan(T mealPlan) {
        System.out.println("Validating and generating plan for: " + mealPlan.getPlanName());
        return new Meal<>(mealPlan);
    }

    public static void main(String[] args) {
        Meal<VegetarianMeal> veggie = generatePersonalizedPlan(new VegetarianMeal());
        System.out.println(veggie);

        Meal<KetoMeal> keto = generatePersonalizedPlan(new KetoMeal());
        System.out.println(keto);
    }
}
