


import java.io.*;

import java.util.*;
class bolt{
    public static void main(String args[])throws IOException{
        try{
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        if(t<1||t>100000){System.out.println("wrong input");}
        for(int i=0; i<t;i++){
    double k1=sc.nextFloat();
    double k2=sc.nextFloat();
    double k3=sc.nextFloat();
    double v=sc.nextFloat();
    double speed=k1*k2*k3*v;
    double time=100/speed;
    double time2=Round(time);
    double rec=9.58;
    if(k1>=2||k1<=0||k2>=2||k2<=0||k3<0||k3>1||v<=9||v>=11){System.out.println("wrong input");}
    else{
    if(time2<rec){
        System.out.println("yes");

    }else{
        System.out.println("no");

    }
}
        }
        }catch(Exception e){
            
            return;
        }
    }
    public static double Round(double R) {
        double p = (double)Math.pow(10,2);
        R = R * p;
        double tmp = Math.round(R);
        return (double)tmp/p;
    }
}