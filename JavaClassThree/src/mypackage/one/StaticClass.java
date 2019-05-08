package mypackage.one;

public class StaticClass {
	int value1=5;
		static int value2=10;
	
		public static void main(String[] args) {
StaticClass sta = new StaticClass();
System.out.println(sta.value1);
System.out.println(sta.value2);
	}
void sum (int val1, int val2) {
	int val3= val1+val2;
	System.out.println("The sum of"+val1+" and "+val2+" is: "+val3);
	
}
}
///multiplication

public class StaticClass {
	int value1=5;
		static int value2=10;
	
		public static void main(String[] args) {
StaticClass sta = new StaticClass();
System.out.println(sta.value1);
System.out.println(sta.value2);
sta.sum(2,3);
StaticClass mta = new StaticClass();
mta.sum(3,4);
	}
static void mult(int val1, int val2) {
	int val3= val1+val2;
	System.out.println("The multiplication of"+val1+" and "+val2+" is: "+val3);
	
}
}

