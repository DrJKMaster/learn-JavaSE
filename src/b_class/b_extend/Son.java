package b_class.b_extend;

class Son extends Father {
    private final String name = "Son";

    public String getName() {
        return this.name;
    }

    public String getSuperName() {
        return super.name;
    }
}
