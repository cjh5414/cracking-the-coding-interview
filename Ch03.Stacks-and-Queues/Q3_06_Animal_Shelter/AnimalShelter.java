package Q3_06_Animal_Shelter;

import java.util.LinkedList;


class AnimalShelter {
    private int curid = 0;
    private LinkedList<Cat> cats = new LinkedList();
    private LinkedList<Dog> dogs = new LinkedList();

    public void enqueue(Dog dog) {
        dog.setId(curid++);
        dogs.add(dog);
    }

    public void enqueue(Cat cat) {
        cat.setId(curid++);
        cats.add(cat);
    }

    public Animal dequeueAny() {
        if (dogs.isEmpty()) return cats.remove();
        else if (cats.isEmpty()) return dogs.remove();
        else if (cats.peek().isOlderThan(dogs.peek()))
            return cats.remove();
        else
            return dogs.remove();
    }

    public Dog dequeueDog() {
        return dogs.remove();
    }

    public Cat dequeueCat() {
        return cats.remove();
    }
}