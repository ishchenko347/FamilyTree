public class Person {

    private String name;
    private String surname;

    /** * Создали конструктор */
    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    /** * Инкапсуляция */
    public String getName() {
        return name;
    }

    /** * И тут она же */
    public String getSurname() {
        return surname;
    }

    /** * Нужно почитать об этом */
    @Override
    public String toString() {
        return "name = " + name +
                ", surname = " + surname;
    };
}
