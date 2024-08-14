import decorator.Hotdog;
import decorator.Simple;
import decorator.Vegan;
import decorator.extras.free.WithKetchup;
import decorator.extras.free.WithMayonnaise;
import decorator.extras.free.WithMustard;
import decorator.extras.paid.WithBacon;
import decorator.extras.paid.WithFries;
import decorator.extras.paid.WithTofu;

public class Main {
    public static void main(String[] args) {


        // fazer all-in para as três versões de hamburguer


        Hotdog simple = new WithKetchup(new WithMustard(new Simple()));
        System.out.println(simple.getChoice());
        System.out.println("The price is: "+simple.getPrice());
        System.out.println("==================="+"\n");

        Hotdog vegan = new WithFries(new WithBacon(new Vegan()));
        System.out.println(vegan.getChoice());
        System.out.println("The price is: "+vegan.getPrice());
        System.out.println("==================="+"\n");

        Hotdog chaos = new WithBacon(new WithFries(new WithTofu(new WithKetchup(new WithMayonnaise(new Vegan())))));
        System.out.println(chaos.getChoice());
        System.out.println(chaos.getPrice());
    }
}