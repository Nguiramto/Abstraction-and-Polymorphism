
public class TypeTwo implements ObjectBehavior{

    private final int attributeValue = 200;
    private String detailTwo;

    public TypeTwo (String detailTwo) {
        this.detailTwo = detailTwo;
    }

    @Override
    public void performAction() {
        System.out.println("Type Two Performing Action.");

    }

    @Override
    public void haltAction() {
        System.out.println("Type Two Halting Action.");

    }

    @Override
    public int getAttribute() {
        return attributeValue;
    }

    @Override
    public String getType() {
        return "TypeTwo";
    }

    public String getDetailTwo() {
        return detailTwo;
    }
}
