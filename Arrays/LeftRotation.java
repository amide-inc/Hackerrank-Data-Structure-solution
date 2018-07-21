import java.util.Scanner;

public class h4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int d = in.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = in.nextInt();
        }
        int res[] = new int[n];
        int k = d%n;
        if(k!=0) {
            for(int i=0;i<k;i++) {
                res[n-k+i] = arr[i];
            }
            for(int i=k;i<n;i++) {
                res[i-k] = arr[i];
            }
        }
        if(k==0) {
            for(int i=0;i<n;i++)
                System.out.print(arr[i]+" ");
            
        }else {
            for(int i=0;i<n;i++)
                System.out.print(res[i]+" ");
        }
        

    }
    

}
