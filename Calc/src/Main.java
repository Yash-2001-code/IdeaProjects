import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Calculation obj = new Calculation();
        Scanner scn = new Scanner(System.in);
        int x=scn.nextInt();
        int y=scn.nextInt();
        int ans = obj.subtract(x,y);
        System.out.println(ans);
    }
}
class Calculation{
    public int num1;
    public int num2;
    public int sum(int a,int b){
        this.num1=a;
        this.num2=b;
        return num1+num2;
    }
    public int subtract(int a,int b) {
        this.num1 = a;
        this.num2 = b;
        return num1-num2;
    }
}