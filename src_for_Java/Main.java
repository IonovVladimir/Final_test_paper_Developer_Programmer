import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("Тестирование:");
        /*
        Animal lion= new Animal("Лев","white", 0.3, "Africa");

        System.out.println(lion.toString());

        lion.eat(2F);

        Animal dog= new Pet("Simon", "red", 30.0, "California", "Jon");
        System.out.println(dog.toString());
        dog.eat(3F);

        Animal Rick= new Dog("Rick", "Black", 30.0, "California", "Jon", "bulldog");
        System.out.println(Rick.toString());
         */

        //Аннотация и пример кода

        /*
        Класс Animal - базовый класс, описывающий общее поведение животных.
        Класс Pet - субкласс Animal, описывающий домашних животных.
        Классы Dog, Cat, Hamster - субклассы Pet, описывающие конкретные виды домашних животных.
        Класс PackAnimal - субкласс Animal, описывающий животных, используемых для переноса грузов.
        Классы Horse, Camel, Donkey - субклассы PackAnimal, описывающие конкретные виды животных,
        используемых для переноса грузов.
         */

        // Создаю домашних животных
        //Dog myDog = new Dog(1,"Бобик", "черный", 10.0, "Москва", "Иван", "Овчарка");
        //Cat myCat = new Cat(2,"Мурка", "серый", 5.0, "Санкт-Петербург", "Мария", true);
        //Hamster myHamster = new Hamster(982,"Хрюша", "серый", 0.2, "Санкт-Петербург", "Мария", 3);

        // Использую методы домашних животных
        //myDog.bark();
        //myCat.meow();
        //myHamster.runInWheel();
//
        //System.out.println(myDog);
        //System.out.println(myCat);
        //System.out.println(myHamster);
//
        //// Создаю животных для переноса грузов
        //Horse myHorse = new Horse(1, "Буцефал", "вороной", 600.0, "Конюшня", 150, "Арабская");
        //Camel myCamel = new Camel(2,"Жора", "рыжий", 800.0, "Пустыня", 300, 2);
        //Donkey myDonkey = new Donkey(23,"Иа", "серый", 300.0, "Ферма", 80, true);
//
        //// Использую методы животных для переноса грузов
        //myHorse.neigh();
        //myCamel.spit();
        //myDonkey.bray();
//
        //System.out.println(myHorse);
        //System.out.println(myCamel);
        //System.out.println(myDonkey);
//
        //System.out.println("**********");
//
        //Animal animal = new Animal("Animal", "blue", 70.0, "Sea");
        //animal.learnCommand("Команда 1");
        //animal.learnCommand("Команда 2");
        //animal.printKnownCommands();
//
        //System.out.println("Учим собаку");
//
        //Dog dog = new Dog("Барон", "коричневый", 10.5, "Домашний адрес", "Владелец", "Пудель");
        //dog.learnCommand("Сидеть");
        //dog.learnCommand("Лежать");
        //dog.learnCommand("Принести мяч");
//
        //System.out.println(" проверяю эксэпшэны и дубляж комманд");
//

        AnimalRegistry registry = new AnimalRegistry();

        // Создаю  объекты различных животных
        Dog dog = new Dog(1, "Барон", "Коричневый", 25.0, "ул. Кукуева 15", "Пётр", "Лабрадор", Arrays.asList("Сидеть", "Голос"));
        Cat cat = new Cat(2, "Хорус", "Чёрный", 4.5, "ул. Осады 3", "Импи", true);
        Hamster hamster = new Hamster(3, "Хома", "Чёрнобелый", 0.5, "ул. Сорьяна 654", "Алиса", 5);
        Horse horse = new Horse(4, "Майка", "Грязный", 500.0, "ул. Печенькова 1", 200, "Арабская");
        Camel camel = new Camel(5, "Папирос", "Верблюжий", 700.0, "Египетский квартал 17", 300, 2);
        Donkey donkey = new Donkey(6, "Иа", "Серый", 100.0, "Ферма", 50, true);

        // Добавляю животных в реестр
        registry.addAnimal(dog);
        registry.addAnimal(cat);
        registry.addAnimal(hamster);
        registry.addAnimal(horse);
        registry.addAnimal(camel);
        registry.addAnimal(donkey);

        System.out.println("Вывод всех животных из реестра");
        System.out.println("Все животные в реестре:");
        registry.displayAnimals();

        //System.out.println("Вывод команды, которые знают животные");
        System.out.println("\nКоманды, известные животным:");
        registry.displayCommands();

        System.out.println("Всего животных в реестре: " + registry.getTotalAnimalCount());

    }


}