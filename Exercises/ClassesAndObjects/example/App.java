package ClassesAndObjects.example;

public class App {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        System.out.println(dog1);

        Dog dog2 = new Dog();
        dog2.setName("annie");
        dog2.setWeight(34.0);

        Dog dog3 = new Dog("Avi",48.0);
        System.out.println(dog3);
    }
    
}
