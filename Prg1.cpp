#include<bits/stdc++.h>

int fun(int n){
    if(n == 1)
            return 1;
        else if(n == 2)
            return 2;
        else if(n == 3)
            return 3;
        else return (fun(n-1)%pow(10,9) + fun(n-2)%pow(10,9) + fun(n-3)%pow(10,9))%(pow(10,9)) ;
}

int main(){
     int t,n;
        cin>>t ;
        for(int i = 0 ;i<t ; i++){
            cin>>n;
            int n = fun(n);
            int d,rev = 0;
            while(n != 0){
            d = n%10;
            rev = rev * 10 + d ;
            n = n/10 ;

        }
            cout<<rev ;
        }
    return 0; 
}