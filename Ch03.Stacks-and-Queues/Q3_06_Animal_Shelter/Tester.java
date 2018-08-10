package Q3_06_Animal_Shelter;


public class Tester {
    public static void main(String[] args) {
        AnimalShelter animalShelter = new AnimalShelter();

        animalShelter.enqueue(new Cat("cat1"));
        animalShelter.enqueue(new Cat("cat2"));
        animalShelter.enqueue(new Dog("dog1"));

        animalShelter.enqueue(new Dog("dog2"));
        animalShelter.enqueue(new Cat("cat3"));
        animalShelter.enqueue(new Cat("cat4"));
        animalShelter.enqueue(new Dog("dog3"));
        animalShelter.enqueue(new Cat("cat5"));

        System.out.println("DequeueAny :" + animalShelter.dequeueAny().getName());
        System.out.println("DequeueAny :" + animalShelter.dequeueAny().getName());
        System.out.println("DequeueAny :" + animalShelter.dequeueAny().getName());

        System.out.println("DequeueCat :" + animalShelter.dequeueCat().getName());
        System.out.println("DequeueDog :" + animalShelter.dequeueDog().getName());
        System.out.println("DequeueDog :" + animalShelter.dequeueDog().getName());
    }
}
