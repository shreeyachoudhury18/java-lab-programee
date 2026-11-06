import java.util.Scanner;

class test1
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Your name is:");

        String first = sc.next();
        String last = sc.next();

        System.out.println(first + last);

        System.out.println("My name is: " + first + last);
    }
}