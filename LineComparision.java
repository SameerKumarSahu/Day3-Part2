public class LineComparision {

        public static void main(String args[]) {

                System.out.println("Welcome to Line Comparision Program");
		int x1=4,y1=3,x2=6,y2=9;
		double distance = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1) *(y2-y1)) ;
		//System.out.println(distance);
		System.out.println("Distance between "+"("+x1+","+y1+"),"+"("+x2+","+y2+") is "+distance);
	}
}
