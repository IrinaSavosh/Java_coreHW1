package HomeWork1.App;

import java.time.LocalDate;
import java.util.List;

public abstract class Animal {
    private String name;
    private String type;
    private LocalDate birthday;
    private List<String> commands;

    /**
     * @param name Имя питомца
     * @param type Тип животного: dog, cat, bird
     * @param birthday дата рождения животного в формате ГГГГ-ММ-ДД
     * @param commands Список команд, которые выполняет питомец
     */
    public Animal(String name, String type, LocalDate birthday, List<String> commands) {
        this.name = name;
        this.type = type;
        this.birthday = birthday;
        this.commands = commands;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public List<String> getCommands() {
        return commands;
    }

    public void setCommands(List<String> commands) {
        this.commands = commands;
    }

    /** Метод добавляет команды в список, а не создает новый
     * @param command Новая команда
     */
    public void addCommand(String command) {
        commands.add(command);
    }

    /**
     * метод Выполнить команды
     */
    public abstract void performCommands();
}
