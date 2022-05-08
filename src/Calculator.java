public class Calculator {
    int result;
    public int add(int num1, int num2){
        result = num1+num2;
        return result;
    }
    public int sub(int num1, int num2){
        result = num1-num2;
        return result;
    }
    public int mul(int num1, int num2){
        result = num1*num2;
        return result;
    }
    public float div(int num1, int num2){
        result = num1/num2;
        return result;
    }

    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println("The Result of Addition: "+c.add(6,2));
        System.out.println("The Result of Subtraction: "+c.sub(6,2));
        System.out.println("The Result of Multiplication: "+c.mul(6,2));
        System.out.println("The Result of Division: "+c.div(6,2));
    }

}