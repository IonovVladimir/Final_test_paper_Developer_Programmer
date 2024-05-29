public class Donkey extends PackAnimal {
    private boolean isObedient;

    //public Donkey(String name, String color, Double weight, String address, int carryingCapacity, boolean isObedient) {
    //    super(name, color, weight, address, carryingCapacity);
    //    this.isObedient = isObedient;
    //}

    public Donkey(int setRegistryNumber,String name, String color, Double weight, String address, int carryingCapacity, boolean isObedient) {
        super(setRegistryNumber,name, color, weight, address, carryingCapacity);
        if (!isValidBoolean(isObedient)) {
            throw new IllegalArgumentException("Недопустимое значение параметра isObedient");
        }
        this.isObedient = isObedient;
    }

    private static boolean isValidBoolean(boolean value) {
        return value == true || value == false;
    }

    public boolean isObedient() {
        return isObedient;
    }

    public void setObedient(boolean obedient) {
        isObedient = obedient;
    }

    public void bray() {
        System.out.println("Осел " + name + " иа-кает");
    }

    @Override
    public String toString() {
        return super.toString() + " and I am " + (isObedient ? "obedient" : "disobedient");
    }
}