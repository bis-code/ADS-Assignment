import calculator.*;

import java.util.ArrayList;

public class Client {
    private static final CalculatorVisitor calculatorVisitor = new CalculatorVisitor();

    public static void main(String[] args) {
        ArrayList<Token> tokenArrayList = new ArrayList<Token>();

        tokenArrayList.add(new Operand(15));
        tokenArrayList.add(new Operand(20));
        tokenArrayList.add(new Operator(Operation.MINUS));
        tokenArrayList.add(new Operand(23));
        tokenArrayList.add(new Operator(Operation.PLUS));
        tokenArrayList.add(new Operand(2));
        tokenArrayList.add(new Operator(Operation.MULTIPLY));
        tokenArrayList.add(new Operand(3));
        tokenArrayList.add(new Operator(Operation.PLUS));
        System.out.println(evaluateExpression(tokenArrayList));
    }

    public static int evaluateExpression(ArrayList<Token> tokenArrayList)
    {
        for(Token token : tokenArrayList)
        {
            if(token instanceof Operator)
            {
                calculatorVisitor.visit((Operator) token);
            }
            else
            {
                calculatorVisitor.visit((Operand) token);
            }
        }
        try {
            return calculatorVisitor.getResult();
        }
        catch (MalformedExpressionException e)
        {
            e.printStackTrace();
        }
        return 0;
    }

}
