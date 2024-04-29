package HomeWork1.App;

import java.time.LocalDate;
import java.util.List;

public class Bird extends Animal {
    public Bird(String name, String type, LocalDate birthday, List<String> commands) {
        super(name, type, birthday, commands);
    }

    /**
     * Метод выаолняет команды (наследование от родительского)
     */
    @Override
    public void performCommands() {
        System.out.println("Птичка выполняет команды и поет");
        System.out.println("чик-чирик \n чик-чирик \n  чик-чирик");
    }
}
