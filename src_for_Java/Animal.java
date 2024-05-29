import java.util.ArrayList;
import java.util.List;

public class Animal {
    private int registryNumber;
    protected String name;
    protected String color;
    protected Double weight;
    protected String address;
    public List<String> knownCommands;

    public Animal(int registryNumber, String name, String color, Double weight, String address) {
        if (name == null || color == null || weight == null || address == null) {
            throw new IllegalArgumentException("Ни один из этих параметров не может быть нулевым");
        }
        this.registryNumber = registryNumber;
        this.name = name;
        this.color = color;
        this.weight = weight;
        this.address = address;
        this.knownCommands = new ArrayList<>();
    }

    public Animal(int registryNumber, String name, String color, Double weight, String address, List<String> knownCommands) {
        if (name == null || color == null || weight == null || address == null) {
            throw new IllegalArgumentException("Ни один из этих параметров не может быть нулевым");
        }
        this.registryNumber = registryNumber;
        this.name = name;
        this.color = color;
        this.weight = weight;
        this.address = address;
        this.knownCommands = knownCommands != null ? new ArrayList<>(knownCommands) : new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getRegistryNumber() {
        return registryNumber;
    }

    public void setRegistryNumber(int registryNumber) {
        this.registryNumber = registryNumber;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void eat(double food) {
        if (food < 0) {
            throw new IllegalArgumentException("Корм для животного не может быть отрицательным");
        }
        weight += food;
        System.out.println("Животное " + name + " было накормлено. Новый вес: " + weight);
    }

    @Override
    public String toString() {
        return "I am " + this.getClass().getSimpleName() + " ( my address " + address + ")";
    }

    public void learnCommand(String command) {
        if (command == null || command.trim().isEmpty()) {
            throw new IllegalArgumentException("Команда не может быть нулевой или пустой");
        }
        if (!knownCommands.contains(command)) {
            knownCommands.add(command);
            System.out.println("Животное " + getName() + " выучило команду: " + command);
        } else {
            System.out.println("Животное " + getName() + " уже знает эту команду: " + command);
        }
    }

    public void printKnownCommands() {
        System.out.println("Список команд, которые знает " + getName() + ":");
        for (String command : knownCommands) {
            System.out.println("- " + command);
        }
    }

    public void forgetCommand(String command) {
        if (command == null || command.trim().isEmpty()) {
            throw new IllegalArgumentException("Команда не может быть нулевой или пустой");
        }
        if (knownCommands.contains(command)) {
            knownCommands.remove(command);
            System.out.println("Животное " + getName() + " забыло команду: " + command);
        } else {
            System.out.println("У животного " + getName() + " нет команды: " + command + " для забывания");
        }
    }
}
