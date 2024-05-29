public class Hamster extends Pet {
    private int cageNumber;

    public Hamster(int setRegistryNumber,String name, String color, Double weight, String address, String owner, Integer cageNumber) {
        super(setRegistryNumber,name, color, weight, address, owner);
        if (cageNumber == null) {
            throw new IllegalArgumentException("Номер клетки хомяка не может быть null");
        }
        this.cageNumber = cageNumber;
    }

    public int getCageNumber() {
        return cageNumber;
    }

    public void setCageNumber(int cageNumber) {
        this.cageNumber = cageNumber;
    }

    public void runInWheel() {
        System.out.println("Хомяк " + name + " бежит в колесе");
    }

    @Override
    public String toString() {
        return super.toString() + " and I live in cage number " + cageNumber;
    }
}