import java.util.*;

public class LineComparision {

        public static void main(String args[]) {

                Scanner scan = new Scanner(System.in);

                System.out.print("Enter the value of X1 :- ");

                int X1=scan.nextInt();

                System.out.print("Enter the value of Y1 :- ");

                int Y1=scan.nextInt();

                System.out.print("Enter the value of X2 :- ");

                int X2=scan.nextInt();

                System.out.print("Enter the value of Y2 :- ");

                int Y2=scan.nextInt();

		System.out.print("Enter the value of X3 :- ");

                int X3=scan.nextInt();

                System.out.print("Enter the value of Y3 :- ");

                int Y3=scan.nextInt();

                System.out.print("Enter the value of X4 :- ");

                int X4=scan.nextInt();

                System.out.print("Enter the value of Y4 :- ");

                int Y4=scan.nextInt();

		double distance1 = Math.sqrt((X2-X1)*(X2-X1) + (Y2-Y1) *(Y2-Y1)) ;

                System.out.println("Distance between "+"("+X1+","+Y1+"),"+"("+X2+","+Y2+") is "+distance1);

		double distance2 = Math.sqrt((X4-X3)*(X4-X3) + (Y4-Y3) *(Y4-Y3)) ;

                System.out.println("Distance between "+"("+X3+","+Y3+"),"+"("+X4+","+Y4+") is "+distance2);

		if ( distance1 == distance2 ) {

              		 System.out.println("The lengths of two straight lines are same");

		}

		else if (distance1 > distance2 ) {

	           	System.out.println(" 1st straight line length is greater than 2nd straight line length ");

		}

		 else  {

                        System.out.println(" 1st straight line length is less than 2nd straight line length ");

                }




	}
}
