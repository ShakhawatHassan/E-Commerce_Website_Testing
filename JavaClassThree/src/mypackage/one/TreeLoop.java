package mypackage.one;

public class TreeLoop {

	public static void main(String[] args) {
		int i=1;
		while (i<5) {
			System.out.println(i+": Talentech");
			if (i==3) {
				break;
			}
			i++;
		}
	System.out.println("Break encountered");
	while (j<5) {
		if (j==3) {
			continue;
		}
		System.out.println(j+": Talentech");
	}
	
	}
	

}
