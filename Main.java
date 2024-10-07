import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[]args) {

        TypeOne typeOne = new TypeOne("Detail information for Type One");
        TypeTwo typeTwo = new TypeTwo("Detail information for Type Two");
        TypeThree typeThree = new TypeThree("Detail information for Type Three");

        List<ObjectBehavior> objects = new ArrayList<>();
        objects.add(typeOne);
        objects.add(typeTwo);
        objects.add(typeThree);

        for (ObjectBehavior type : objects) {
            System.out.println("..." +type.getType() + "...");
            type.performAction();
            System.out.println("Attribute Value : " +type.getAttribute());
            System.out.println("Type : " +type.getType());


            if (type instanceof TypeOne) {
                TypeOne typeOne1 = (TypeOne) type;
                System.out.println("Detail One : " +typeOne1.getDetailOne());
            } else if (type instanceof TypeTwo) {
                TypeTwo typeTwo2 = (TypeTwo) type;
                System.out.println("Detail Two : " +typeTwo2.getDetailTwo());
            } else if (type instanceof  TypeThree) {
                TypeThree typeThree3 = (TypeThree) type;
                System.out.println("Detail Three : " +typeThree3.getDetailThree());
            }

            type.haltAction();
        }
    }
}
