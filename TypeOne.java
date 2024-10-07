public class TypeOne implements ObjectBehavior {

    private final int attributeValue = 100;
    private String detailOne;


    public TypeOne (String detailOne) {
        this.detailOne = detailOne;

    }


    @Override
    public void performAction() {
        System.out.println("Type One performing Action.");

    }

    @Override
    public void haltAction() {
        System.out.println("Type One halting Action.");

    }

    @Override
    public int getAttribute() {
        return attributeValue;
    }

    @Override
    public String getType() {
        return "TypeOne";
    }

    public String getDetailOne() {
        return detailOne;
    }
}
