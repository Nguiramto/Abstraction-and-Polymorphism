public class TypeThree implements ObjectBehavior {

    private final int attributeValue = 300;
    private String detailThree;

    public TypeThree (String detailThree) {
        this.detailThree = detailThree;
    }

    @Override
    public void performAction() {
        System.out.println("Type Three Performing Action.");
    }

    @Override
    public void haltAction() {
        System.out.println("Type Three Halting Action.");

    }

    @Override
    public int getAttribute() {
        return attributeValue;
    }

    @Override
    public String getType() {
        return "TypeThree";
    }

    public String getDetailThree() {
        return detailThree;
    }
}
