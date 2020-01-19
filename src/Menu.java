public class Menu {
    public static void main(String[] args) {

        Drink drink1 = new Drink();
        drink1.name = "Mojito";
        drink1.price = 25;
        drink1.ingredient1.name = "rum";
        drink1.ingredient2.name = "lime juice";
        drink1.ingredient3.name = "mint";
        drink1.ingredient1.quantity = 50;
        drink1.ingredient2.quantity = 15;
        drink1.ingredient3.quantity = 10;
        drink1.alcohol = true;

        Drink drink2 = new Drink();
        drink2.name = "Banana duo";
        drink2.price = 20;
        drink2.ingredient1.name = "banan juice";
        drink2.ingredient2.name = "currant juice";
        drink2.ingredient3.name = "orange";
        drink2.ingredient1.quantity = 1;
        drink2.ingredient2.quantity = 200;
        drink2.ingredient3.quantity = 1;
        drink2.alcohol = false;


        float sumOfIngredients1 = drink1.ingredient1.quantity + drink1.ingredient2.quantity +
                drink1.ingredient3.quantity;
        float sumOfIngredients2 = drink2.ingredient1.quantity + drink2.ingredient2.quantity +
                drink2.ingredient3.quantity;
        System.out.println("MENU\n");
        System.out.println(drink1.name + "-" + drink1.price + " zł");
        System.out.println(drink1.ingredient1.name + " - " + drink1.ingredient1.quantity + " ml");
        System.out.println(drink1.ingredient2.name + " - " + drink1.ingredient2.quantity + " ml");
        System.out.println(drink1.ingredient3.name + " - " + drink1.ingredient3.quantity + " pieces");
        System.out.println("Drink has alcohol: " + drink1.alcohol +"\n");
        System.out.println("Capacity: " + sumOfIngredients1 +"ml\n");

        System.out.println(drink2.name + " - " + drink2.price + " zł");
        System.out.println(drink2.ingredient1.name + " - " + drink2.ingredient1.quantity + " ml");
        System.out.println(drink2.ingredient2.name + " - " + drink2.ingredient2.quantity + " ml");
        System.out.println(drink2.ingredient3.name + " - " + drink2.ingredient3.quantity + " pieces");
        System.out.println("Drink has alcohol: " + drink2.alcohol);
        System.out.println("Capacity: " + sumOfIngredients2 + "ml");






    }
}
