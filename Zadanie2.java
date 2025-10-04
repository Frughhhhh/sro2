interface Reportable {
    void generateReport();
}

interface Trainable {
    void attendTraining();
}

class Developer extends Employee implements Trainable {
    private String programmingLanguage;

    public Developer(String name, double salary, String programmingLanguage) {
        super(name, salary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void work() {
        System.out.println(name + " пишет код на " + programmingLanguage);
    }

    @Override
    public void introduce() {
        System.out.println("Я разработчик, меня зовут " + name + ". Зарплата: " + salary);
    }

    @Override
    public void attendTraining() {
        System.out.println(name + " проходит тренинг по " + programmingLanguage);
    }
}

class Manager extends Employee implements Reportable {
    private int teamSize;

    public Manager(String name, double salary, int teamSize) {
        super(name, salary);
        this.teamSize = teamSize;
    }

    @Override
    public void work() {
        System.out.println(name + " управляет командой из " + teamSize + " человек.");
    }

    @Override
    public void introduce() {
        System.out.println("Я менеджер, меня зовут " + name + ". Зарплата: " + salary);
    }

    @Override
    public void generateReport() {
        System.out.println(name + " готовит отчёт о работе команды из " + teamSize + " человек.");
    }
}

public class Main {
    public static void main(String[] args) {
        Developer dev = new Developer("Ануар", 300000, "Java");
        Manager man = new Manager("Томирис", 500000, 10);

        dev.introduce();
        dev.work();
        dev.attendTraining();

        man.introduce();
        man.work();
        man.generateReport();
    }
}
