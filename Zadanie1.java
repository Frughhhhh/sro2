abstract class Employee {
    protected String name;
    protected double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public abstract void work();
    public abstract void introduce();
}

class Developer extends Employee {
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
}

class Manager extends Employee {
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
}

public class Main {
    public static void main(String[] args) {
        Employee dev = new Developer("Ануар", 300000, "Java");
        Employee man = new Manager("Томирис", 500000, 10);

        dev.introduce();
        dev.work();

        man.introduce();
        man.work();
    }
}
