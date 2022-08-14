
public class App {
    public static void main(String[] args) {
        Person person1 = new Person("Ivan", "Ivanov");
        Person person2 = new Person("Mary", "Ivanova");
        Person person3 = new Person("Olya", "Ivanova");
        // Person person4 = new Person("Dima", "Dimitrov");

        Tree tree = new Tree();

        tree.addLink(person1, person2, Relation.PARENT, Relation.CHILD);
        tree.addLink(person3, person2, Relation.PARENT, Relation.CHILD);
        tree.addLink(person1, person3, Relation.HUSBAND, Relation.WIFE);

        Research.printTree("Ivan", tree);
    }
}