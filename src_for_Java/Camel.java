public class Camel extends PackAnimal {
    private int humpsCount;

    public Camel(int setRegistryNumber,String name, String color, Double weight, String address, int carryingCapacity, int humpsCount) {
        super(setRegistryNumber,name, color, weight, address, carryingCapacity);
        if (humpsCount <= 0 || humpsCount > 2) {
            throw new IllegalArgumentException("Количество горбов должно быть положительным числом и не превышать 2");
        }
        this.humpsCount = humpsCount;
    }

    public int getHumpsCount() {
        return humpsCount;
    }

    public void setHumpsCount(int humpsCount) {
        this.humpsCount = humpsCount;
    }

    public void spit() {
        System.out.println("Верблюд " + name + " плюется");
    }

    @Override
    public String toString() {
        return super.toString() + " and I have " + humpsCount + " humps";
    }
}