import java.util.*;
import java.io.*;
class strongstring {
    public static void main(String srgs[])throws IOException{
        try{
        Scanner sc=new Scanner(System.in);
        int count=0;int con=0;
        int test=sc.nextInt();
        
        for(int j=0;j<test;j++){
        
        int n=sc.nextInt();
        
        
        int k=sc.nextInt();
        
        
        String s= sc.next();s=s.toLowerCase();count=0;con=0;
        for(int i=0;i<n;i++){
            
            char ch=s.charAt(i);
            if(ch=='*'){
                count++; if(count>=k){con=count;}

            }else{
                count=0;
            }
        }if(con>=k){System.out.println("yes");}else{System.out.println("no");}
    }

    }catch(Exception e){return;}
}
    
}
