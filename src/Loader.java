
public class Loader
{
    public static void main(String[] args)
    {
        Cat murka = new Cat();
        System.out.println("Murka weight: " + murka.getWeight());
        murka.feed();
        System.out.println("After feed Murka weight: " + murka.getWeight());
        System.out.println(murka.getStatus());

        Cat vasya = new Cat();
        System.out.println("Vasya weight: " + vasya.getWeight());
        vasya.drink();
        System.out.println("After drink Vasya weight: " + vasya.getWeight());
        System.out.println(vasya.getStatus());

        Cat murzik = new Cat();
        System.out.println("Murzik weight: " + murzik.getWeight());
        murzik.meow();
        System.out.println("After meow Murzik weight: " + murzik.getWeight());
        System.out.println(murzik.getStatus());

        Cat barsik = new Cat();
        System.out.println("Barsik weight: " + barsik.getWeight());
        System.out.println(barsik.getStatus());
    }
}