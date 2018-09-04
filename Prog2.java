import java.io.*;
import java.util.*;

public class Prog2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        short t;
        int n = 0;
        t = sc.nextShort() ;
        for(int i = 0 ;i<t ; i++){
            n = sc.nextInt();
            int k = sc.nextInt();
            Float[] s = new Float[n];
            for(int j = 0 ;j<n ; j++){
                s[j] = sc.nextFloat() ;
            }
            float max = 0,min = 0;
            if(k==0){
                max = Collections.max(Arrays.asList(s)) ;   
                
            }
            else{
                min = Collections.min(Arrays.asList(s)) ;
                max = Collections.max(Arrays.asList(s)) ;   
                if((min*-1) > max)
                    max = min * -1 ;
            }
            System.out.println(max);
        }
        sc.close();
    }
}