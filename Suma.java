
import java.util.Scanner;
public class Suma {

	public static void main(String[] args) {
		int a,b,c,d,e;
		int sumap=0, sumanep=0;
		Scanner tastatura= new Scanner (System.in);
		System.out.println("Vnesete go prviot broj");
		a=tastatura.nextInt();
		System.out.println("Vnesete go vtoriot broj");
		b=tastatura.nextInt();
		System.out.println("Vnesete go tretiot broj");
		c=tastatura.nextInt();
		System.out.println ("Vnesete go cetvrtiot broj");
		d=tastatura.nextInt();
		System.out.println("Vnesete go petiot broj");
		e=tastatura.nextInt();
	if (a%2== 0) {
		sumap=sumap+a;
		
	} else {
		
		sumanep=sumanep+a;
	}
	if (b%2== 0) {
		sumap=sumap+b;
		
	}else {
		