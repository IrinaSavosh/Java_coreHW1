package HomeWork1.App;

import java.util.ArrayList;
import java.util.List;

public class AnimalRegistry {
    private final List<Animal> animals;


    public AnimalRegistry() {
        this.animals = new ArrayList<>();
    }

    /**
     * @param animal Объект animal
     */
    public void addAnimal(Animal animal) {
        this.animals.add(animal);

    }

    public Animal getAnimal(String name) {
        for (Animal animal : animals) {
            if (name.equals(animal.getName())) {
                return animal;
            }
        }
        return null;
    }

    /** Метод выводит список команд, которые выполняет животное
     * @param animalName имя питомца
     */
    public void printCommands(String animalName) {
        Animal animal = getAnimal(animalName);
        if (animal != null) {
            System.out.println("Список команд, которые выполняет ");
            System.out.print(animalName);
            System.out.print(":");
            for (String command : animal.getCommands()) {
                System.out.println("- ");
                System.out.print(command);
            }
        } else {
            System.out.println("Животное с таким именем не найдено");
        }
    }

    /** Метод добавления команд
     * @param animalName Имя питомца
     * @param command Новая команда
     */
    public void teachAnimalCommand(String animalName, String command) {
        Animal animal = getAnimal(animalName);
        if (animal != null) {
            List<String> commands = animal.getCommands();
            commands.add(command);
            animal.setCommands(commands);
            System.out.print("Животное ");
            System.out.print(animalName);
            System.out.print(" теперь умеет выполнять команду ");
            System.out.println(command);
        } else {
            System.out.println("Животное с таким именем не найдено");
        }
    }


}
