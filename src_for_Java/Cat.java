public class Cat extends Pet {
    private boolean isPlayful;

    public Cat(int setRegistryNumber,String name, String color, Double weight, String address, String owner, Boolean isPlayful) {
        super(setRegistryNumber,name, color, weight, address, owner);
        if (isPlayful == null) {
            throw new IllegalArgumentException("Информация о игривости кошки не может быть null");
        }
        this.isPlayful = isPlayful;
    }

    public boolean isPlayful() {
        return isPlayful;
    }

    public void setPlayful(boolean playful) {
        isPlayful = playful;
    }

    public void meow() {
        System.out.println("Кошка " + name + " мяукает");
    }

    @Override
    public String toString() {
        return super.toString() + " and I am " + (isPlayful ? "playful" : "not playful");
    }
}