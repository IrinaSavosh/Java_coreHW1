package HomeWork1.App;

import java.time.LocalDate;
import java.util.List;

public class Cat extends Animal {
    public Cat(String name, String type, LocalDate birthday, List<String> commands) {
        super(name, type, birthday, commands);
    }

    /**
     * Метод выаолняет команды (наследование от родительского)
     */
    @Override
    public void performCommands() {
        System.out.println("Кот выполняет команды и очень противно орет");
        System.out.println("мяяяяяяяяяяяяяу \n мяяяяяяяяяяяяяу \n  мяяяяяяяяяяяяяу");
    }
}
