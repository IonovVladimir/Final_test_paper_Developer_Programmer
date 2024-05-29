import java.util.List;

public class Dog extends Pet {
    private String breed;

    //public Dog(int setRegistryNumber, String name, String color, Double weight, String address, String owner, String breed, List<String> knownCommands) {
    //    super(setRegistryNumber,name, color, weight, address, owner);
    //    if (breed == null) {
    //        throw new IllegalArgumentException("Порода собаки не может быть null");
    //    }
    //    this.breed = breed;
    //}

    public Dog(int registryNumber, String name, String color, Double weight, String address, String owner, String breed, List<String> knownCommands) {
        super(registryNumber, name, color, weight, address, owner);
        if (breed == null) {
            throw new IllegalArgumentException("Порода собаки не может быть null");
        }
        this.breed = breed;
        if (knownCommands != null) {
            this.knownCommands.addAll(knownCommands);
        }
    }


    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void bark() {
        System.out.println("Собака " + name + " лает");
    }

    @Override
    public String toString() {
        return super.toString() + " and I am a " + breed;
    }

    ///Учим собаку

    public void learnCommand(String command) {
        super.learnCommand(command); // Вызываем метод из суперкласса
        System.out.println("Собака " + getName() + " выучила новую команду: " + command);
    }
}