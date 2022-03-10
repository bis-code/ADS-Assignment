public abstract class Token {
    private CalculatorVisitor visitor;

    public Token()
    {
        visitor = new CalculatorVisitor();
    }

    public abstract void accept(CalculatorVisitor visitor);
}
