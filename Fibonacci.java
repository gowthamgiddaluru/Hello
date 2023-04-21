public class Fibonacci {
    public void fibonacciNumber(int n){
        int num1=0,num2=1,num3;
        System.out.print(num1+","+num2);
        for(int i=2; i<n;++i){
            num3=num1+num2;
            System.out.print(","+num3);
            num1=num2;
            num2=num3;
        }
    }
    public static void main(String[] args){
        Fibonacci myObj=new Fibonacci();
        int num=8;
        myObj.fibonacciNumber(num);
    }
}
