public class Pet extends Animal {
    protected String owner;

    public Pet(int setRegistryNumber,String name, String color, Double weight, String address, String owner) {
        super(setRegistryNumber,name, color, weight, address);
        if (owner == null) {
            throw new IllegalArgumentException("Имя хозяина не может быть null");
        }
        this.owner = owner;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void play() {
        System.out.println("Играем с питомцем " + name);
    }

    @Override
    public String toString() {
        return super.toString() + " and my owner is " + owner;
    }
}