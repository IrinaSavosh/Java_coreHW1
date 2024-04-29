package HomeWork1.App;

import java.time.LocalDate;
import java.util.List;

public class Dog extends Animal {
    public Dog(String name, String type, LocalDate birthday, List<String> commands) {
        super(name, type, birthday, commands);
    }

    /**
     * Метод выаолняет команды (наследование от родительского)
     */
    @Override
    public void performCommands() {
        System.out.println("Собака выполняет команды и лает");
        System.out.println("гав-гав-гав \n гав-гав-гав \n  гав-гав-гав");
    }
}
