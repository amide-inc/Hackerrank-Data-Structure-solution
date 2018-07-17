import java.util.Scanner;

public class h1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++) {
			a[i] = in.nextInt();
		}
		int re[] = reverseArray(a);
        for(int i=0;i<re.length;i++){
            System.out.print(re[i] +" ");
        }
		
	}
	static int[] reverseArray(int[] a) {
	   int res[] = new int[a.length];
	   int k = a.length-1;
	   for(int  i=0;i<a.length;i++) {
		   res[k-i] = a[i];
          
	   }
	   return res;
	   
	}

}
