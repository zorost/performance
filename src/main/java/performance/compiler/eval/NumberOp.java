package performance.compiler.eval;


public class NumberOp extends Op {
    private final double value;
    public NumberOp(double value) {
        this.value = value;
    }

    @Override
    public double doubleVal() {
        return value;
    }
}
