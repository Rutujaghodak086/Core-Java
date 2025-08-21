class Calculater{
public static int add(int a,int b)
{
return a+b;
}
public static int sub(int a,int b)
{
return a-b;
}
public static int mul(int a,int b)
{
return a*b;
}
public static int div(int a,int b)
{
return a/b;
}
public static void main(String args[]){
int a=20;
int b=5;
System.out.println("Addition :"+ add(a,b));
System.out.println("Subtraction :"+ sub(a,b));
System.out.println("Multiplication :"+ mul(a,b));
System.out.println("Division :"+ div(a,b));
}
}


