package brcomdio.model;

public class Space {
    protected Integer actual;
    protected  int expected;
    protected  boolean fixed;

    public Space(final int expected, final boolean fixed){
        this.expected = expected;
        this.fixed = fixed;
        if (fixed) {
            actual = expected;
        }
    }
    public Integer getActual() {
        return actual;
    }
    public int getExpected() {
        return expected;
    }
    public boolean isFixed() {
        return fixed;
    }
    public void clearSpace(){
        setActual(null);
    }
    public void setActual(Integer actual) {
        if (fixed) {
            return;
        }
        this.actual = actual;
    }
}
