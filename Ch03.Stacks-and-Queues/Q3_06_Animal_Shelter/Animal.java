package Q3_06_Animal_Shelter;


class Animal {
    private int id;
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return name;
    }

    public boolean isOlderThan(Animal animal) {
        return this.id < animal.getId();
    }
}