
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

    /** * Инкапсуляция. В Java инкапсуляция понимается как механизм, связывающий код и данные, 
    которыми он манипулирует, защищая оба этих компонента от внешнего вмешательства и злоупотреблений. 
    Инкапсуляцию можно считать защитной оболочкой, которая предохраняет код и данные от произвольного 
    доступа со стороны другого кода, находящегося снаружи оболочки. Доступ к коду и данным, 
    находящимся внутри оболочки, строго контролируется тщательно определённым интерфейсом. */
    
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
