public class PackAnimal extends Animal {
    private int carryingCapacity;

    public PackAnimal(int setRegistryNumber,String name, String color, Double weight, String address, int carryingCapacity) {
        super(setRegistryNumber,name, color, weight, address);
        if (carryingCapacity <= 0) {
            throw new IllegalArgumentException("Грузоподъемность должна быть положительным числом");
        }
        this.carryingCapacity = carryingCapacity;
    }

    public int getCarryingCapacity() {
        return carryingCapacity;
    }

    public void setCarryingCapacity(int carryingCapacity) {
        this.carryingCapacity = carryingCapacity;
    }

    public void carryLoad(int loadWeight) {
        if (loadWeight > carryingCapacity) {
            throw new IllegalArgumentException(name + " не может нести груз весом " + loadWeight +
                    " кг, так как его грузоподъемность составляет только " + carryingCapacity + " кг");
        }
        System.out.println(name + " несет груз весом " + loadWeight + " кг");
    }


    @Override
    public String toString() {
        return super.toString() + " и моя грузоподъемность составляет " + carryingCapacity + " килограмм";
    }
}