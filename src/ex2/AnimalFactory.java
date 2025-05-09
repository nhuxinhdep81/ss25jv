package ex2;
public class AnimalFactory {
    public static Animal createAnimal(String type) {
        if (type == null) {
            return null;
        }
        if (type.equalsIgnoreCase("Dog")) {
            return new Dog();
        } else if (type.equalsIgnoreCase("Cat")) {
            return new Cat();
        }

        return null;
    }
}
