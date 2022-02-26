import java.util.*;
import java.lang.Math;
class basicCalculator{
    public static void main(String[] args){
        System.out.println("This is basic calculator apply for two operands");
        System.out.println("Type\n\tAddition: add\n\tSubtraction: sub\n\tMultiplication: mul\n\tDivision: div\n\tPower: pow");
        Scanner sc = new Scanner(System.in);
        String operator = sc.next();
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(calculator(operator, a, b));
    }
    public static int calculator(String operator, int a, int b){
        int ans=0;
        if(operator.equalsIgnoreCase("add"))
        ans = a+b;
        if(operator.equalsIgnoreCase("sub"))
        ans = a-b;
        if(operator.equalsIgnoreCase("mul"))
        ans = a*b;
        if(operator.equalsIgnoreCase("div"))
        ans = a/b;
        if(operator.equalsIgnoreCase("pow"))
        ans = (int)Math.pow(a,b);

        return ans;
    }
}