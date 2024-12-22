public class MealBuilder{
    public Meal prepareVegMeal(){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());

        return meal;
    }

    public Meal preapareNonVegMeal(){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Pepsi());

        return meal;
    }
}