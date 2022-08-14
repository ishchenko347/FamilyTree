
public class Link {
    private Person personFirst;
    private Person personSecond;
    private Relation link;

    /** * Создали конструктор */
    public Link(Person personFirst, Person personSecond, Relation link) {
        this.personFirst = personFirst;
        this.personSecond = personSecond;
        this.link = link;
    }

    /** * Инкапсуляция */
    public Person getPersonFirst() {
        return personFirst;
    }

    public Person getPersonSecond() {
        return personSecond;
    }

    public Relation getLink() {
        return link;
    }

    /** * Допустиииим */
    @Override
    public String toString() {
        return "Link {" +
                "personFirst = " + personFirst +
                ", personSecond = " + personSecond +
                ", link = '" + link +
                "}";
    };
}
