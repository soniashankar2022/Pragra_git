package AssignmentPragra.OCT17Assignment;

public class Constructor {
    static class Calculator{
        private double num1;
        private double num2;

        private double add(){
            return  (num1+num2);
        }
        private double Sub(){
            return num1-num2;
        }
        private double Mul(){
            return num1*num2;
        }
        private double Div(){
            if (num1 != 0) {
                return num2 / num1;
            } else {
                System.out.println("Division by zero is not allowed.");
                return 0;
            }
        }
        Calculator(double num1,double num2){
            this.num1=num1;
            this.num2=num2;



        }


    }

    public static void main(String[] args) {
        Calculator calc=new Calculator(10,94);
        calc.add();
        calc.Sub();
        calc.Mul();
        calc.Div();

        System.out.println("Addition: " + calc.add());
        System.out.println("Subtraction: " + calc.Sub());
        System.out.println("Multiplication: " + calc.Mul());
        System.out.println("Division: " + calc.Div());
    }

}
