package Calculator;

public class Calculator {

    private MathService mathService;

    public Calculator(MathService mathService){
        this.mathService = mathService;
    }

    public int add(int a, int b){
        return mathService.add(a, b);
    }

    public int subtract(int a, int b){
        return mathService.subtract(a, b);
    }
}


