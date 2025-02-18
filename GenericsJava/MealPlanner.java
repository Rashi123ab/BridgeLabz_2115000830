import java.util.ArrayList;
import java.util.List;
interface MealPlan {
    String getMealType();
}
class VegetarianMeal implements MealPlan {
    public String getMealType() {
        return "Vegetarian Meal";
    }
}
class VeganMeal implements MealPlan {
    public String getMealType() {
        return "Vegan Meal";
    }
}
class KetoMeal implements MealPlan {
    public String getMealType() {
        return "Keto Meal";
    }
}
class HighProteinMeal implements MealPlan {
    public String getMealType() {
        return "High-Protein Meal";
    }
}
class Meal<T extends MealPlan> {
    private T mealType;
    public Meal(T mealType) {
        this.mealType = mealType;
    }
    public T getMealType() {
        return mealType;
    }
}
class MealPlanGenerator {
    private List<Meal<? extends MealPlan>> meals = new ArrayList<>();
    public void addMeal(Meal<? extends MealPlan> meal) {
        meals.add(meal);
    }
    public void displayMeals() {
        for (Meal<? extends MealPlan> meal : meals) {
            System.out.println(meal.getMealType().getMealType());
        }
    }
    public static <T extends MealPlan> Meal<T> generateMealPlan(T mealType) {
        return new Meal<>(mealType);
    }
}
class MealPlanner{
    public static void main(String[] args) {
        Meal<VegetarianMeal> vegetarianMeal = MealPlanGenerator.generateMealPlan(new VegetarianMeal());
        Meal<VeganMeal> veganMeal = MealPlanGenerator.generateMealPlan(new VeganMeal());
        Meal<KetoMeal> ketoMeal = MealPlanGenerator.generateMealPlan(new KetoMeal());
        Meal<HighProteinMeal> highProteinMeal = MealPlanGenerator.generateMealPlan(new HighProteinMeal());
        MealPlanGenerator generator = new MealPlanGenerator();
        generator.addMeal(vegetarianMeal);
        generator.addMeal(veganMeal);
        generator.addMeal(ketoMeal);
        generator.addMeal(highProteinMeal);
        generator.displayMeals();
    }
}
