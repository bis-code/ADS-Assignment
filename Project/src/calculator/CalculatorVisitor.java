package calculator;

import stack.LinkedList;
import stack.LinkedStack;

public class CalculatorVisitor implements Visitor,Calculator{
    private LinkedStack<Token> tokenStack;

    public CalculatorVisitor()
    {
        tokenStack = new LinkedStack<>();
    }

    public void pushOperand(Operand operand)
    {
        tokenStack.push(operand.getValue());
    }

    public void performOperation(Operator operator) throws MalformedExpressionException
    {
        Object val1;
        Object val2;

        try{
            if(operator.getOperation().equals(Operation.MINUS))
            {
                val1 = tokenStack.pop();
                val2 = tokenStack.pop();
                int resultMinus = (int)val2 - (int) val1;
                tokenStack.push(resultMinus);
            }
            else if(operator.getOperation().equals(Operation.PLUS))
            {
                val1 = tokenStack.pop();
                val2 = tokenStack.pop();
                int resultPlus = (int) val1 + (int) val2;
                tokenStack.push(resultPlus);
            }
            else if(operator.getOperation().equals(Operation.MULTIPLY))
            {
                val1 = tokenStack.pop();
                val2 = tokenStack.pop();
                int resultMultiply = (int) val1 * (int) val2;
                tokenStack.push(resultMultiply);
            }
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            throw new MalformedExpressionException("The operator must be: PLUS / MINUS / MULTIPLY, as well as two values.");
        }
    }

    @Override
    public int getResult() throws MalformedExpressionException {
        return (int)tokenStack.pop();
    }

    @Override
    public void visit(Operand operand) {
        pushOperand(operand);
    }

    @Override
    public void visit(Operator operator) {
        try
        {
            performOperation(operator);
        }
        catch (MalformedExpressionException e)
        {
            e.printStackTrace();
        }
    }
}
