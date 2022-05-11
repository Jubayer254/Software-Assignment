
public interface Calculator {
    void calculate();
}

class add implements Calculator
{

    public void calculate() {
        float answer = 6 + 2;
    }
	 
}

class sub implements Calculator
{

    public void calculate() {
         float answer = 6 + 2;
    }
	 
}


class mul implements Calculator
{

    public void calculate() {
         float answer = 6 + 2;
    }
    
	 
}


class div implements Calculator
{

    public void calculate() {
        float answer = 6 + 2;
    }
	 
}

class mod implements Calculator
{

    public void calculate() {
        float answer = 6 + 2;
    }
	 
}

class CalculatorFactory
{
 
	 public Calculator getOparetion(String type) throws Exception
	 {
		 switch (type)
		 {
			 case "add":
				 return new add();
			 case "sub":
				 return new sub();
			 case "mul":
				 return new mul();
                         case "div":
				 return new div();
                         case "mod":
				 return new mod();
			 default:
				 throw new Exception( "Calculator type : "+type+" cannot be instantiated");
		 }
	 }
}

class do_Oparetion
{
	 public static void main(String[] args) throws Exception
	 {
		 
		 CalculatorFactory shapeFactory = new CalculatorFactory();
		 Calculator add =shapeFactory.getOparetion("add");
		 add.calculate();
                 
		 Calculator sub = shapeFactory.getOparetion("sub");
		 sub.calculate();
		 
		 Calculator mul = shapeFactory.getOparetion("mul");
		 mul.calculate();
                 
                 Calculator div = shapeFactory.getOparetion("div");
		 div.calculate();
		 
		 Calculator mod= shapeFactory.getOparetion("mod");
		 mod.calculate();
	 }
}