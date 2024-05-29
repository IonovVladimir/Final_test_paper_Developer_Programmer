public class Horse extends PackAnimal {
    private String breed;

    public Horse(int setRegistryNumber,String name, String color, Double weight, String address, int carryingCapacity, String breed) {
        super(setRegistryNumber,name, color, weight, address, carryingCapacity);
        if (breed == null || breed.trim().isEmpty()) {
            throw new IllegalArgumentException("Порода лошади не может быть пустой");
        }
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void neigh() {
        System.out.println("Лошадь " + name + " ржет");
    }

    @Override
    public String toString() {
        return super.toString() + " and I am a " + breed;
    }
}