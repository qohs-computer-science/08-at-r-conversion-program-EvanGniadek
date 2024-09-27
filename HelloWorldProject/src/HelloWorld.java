//Evan Gniadek 
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
		boolean cont = true;
		Scanner input = new Scanner(System.in);
		while(cont){
			int userIn = -1;
			while(userIn != 1 && userIn != 2){
				System.out.println("Hello, press 1 for decimal to binary conversion and 2 for binary to decimal conversion");
				userIn = input.nextInt();
			}//end of while 
			if(userIn == 1 ){
				System.out.println("enter a decimal number");
				int inD = input.nextInt();
				System.out.println("the number is " + Main.dToB(inD));
				System.out.println("press 1 to countinue");
				int answer = input.nextInt();
				cont = Main.keepOn(answer);

			} else if(userIn == 2){
				System.out.println("enter a binary number");
				String inB = input.next();
				System.out.println("the number is " + Main.bToD(inB));
				System.out.println("press 1 to countinue");
				int answer = input.nextInt();

				cont = Main.keepOn(answer);

		}//end of else 
			
		
		
	}//end of while 
	input.close();
    }//end of static void 

    public static String dToB(int decimal){
        String proBinary = "";
		int remain = 0;
        while(decimal > 0){
			remain = decimal%2;
			proBinary = remain + proBinary;
			decimal /=2;

		} //end of while 
        return proBinary;
    }//end of method
    public static int bToD(String binary){
        int decimal = 0;
        int iBinary = Integer.parseInt(binary);
        int n = 0;
        while(iBinary > 0){
	        if(iBinary%2 == 1)
		        decimal += Math.pow(2,n);
	        n++;
	        iBinary/= 10;
            }//while
        return decimal;
            }//end of static int 
	public static boolean keepOn(int given){
		if(given == 1)
			return true;
		else
			return false;
	}
}//end of class


