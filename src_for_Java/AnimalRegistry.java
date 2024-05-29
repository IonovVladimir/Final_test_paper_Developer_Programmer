import java.util.ArrayList;
import java.util.List;

public class AnimalRegistry {
    private final List<Animal> animalList;

    public AnimalRegistry() {
        this.animalList = new ArrayList<>();
    }

    public void addAnimal(Animal animal) {
        animalList.add(animal);
        renumberAnimals(); // Вызов метода для автоперенумерации
    }

    public void editAnimal(int index, Animal newAnimal) {
        if (index >= 0 && index < animalList.size()) {
            animalList.set(index, newAnimal);
            renumberAnimals(); // Вызов метода для автоперенумерации
        } else {
            System.out.println("Invalid index");
        }
    }

    public void removeAnimal(int index) {
        if (index >= 0 && index < animalList.size()) {
            animalList.remove(index);
            renumberAnimals(); // Вызов метода для автоперенумерации
        } else {
            System.out.println("Invalid index");
        }
    }

    private void renumberAnimals() {
        for (int i = 0; i < animalList.size(); i++) {
            animalList.get(i).setRegistryNumber(i + 1);
        }
    }

    public void displayAnimals() {
        if (animalList.isEmpty()) {
            System.out.println("The animal registry is empty.");
        } else {
            System.out.println("Animals in the registry:");
            for (Animal animal : animalList) {
                System.out.println("- Registry Number: " + animal.getRegistryNumber() + ", Name: " + animal.getName());
            }
        }
    }

    public void displayCommands() {
        for (Animal animal : animalList) {
            System.out.println(animal.getName() + " commands:");
            animal.printKnownCommands();
            System.out.println();
        }
    }

    public int getTotalAnimalCount() {
        return animalList.size();
    }
}
