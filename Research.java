import java.util.List;

public class Research {
    public static void printTree(String name, Tree tree) {
        List<Link> links = tree.getLinks();

        for (Link el : links) {
            if (el.getPersonFirst().getName().equals(name) &&
                    el.getLink() == Relation.PARENT) {
                System.out.println("CHILD " + name + ": " + el.getPersonSecond());
            }

            if (el.getPersonFirst().getName().equals(name) &&
                    el.getLink() == Relation.HUSBAND) {
                System.out.println("WIFE " + name + ": " + el.getPersonSecond());
            }
        }
    }
}
