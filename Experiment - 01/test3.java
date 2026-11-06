import java.util.Scanner;

class test3
{
    // Method to check palindrome
    void palindrome()
    {
        Scanner sc = new Scanner(System.in);

        // Local variables
        int n, temp, rev = 0, rem;

        // Take input from user
        System.out.print("Enter a number: ");
        n = sc.nextInt();

        // Store original number
        temp = n;

        // Reverse the number
        while(n > 0)
        {
            rem = n % 10;          // Get last digit
            rev = rev * 10 + rem;  // Form reverse number
            n = n / 10;            // Remove last digit
        }

        // Check whether palindrome or not
        if(temp == rev)
        {
            System.out.println("Palindrome Number");
        }
        else
        {
            System.out.println("Not a Palindrome Number");
        }
    }

    // Main method (Program starts here)
    public static void main(String args[])
    {
        // Create object of class
        test3 ob = new test3();

        // Call palindrome method
        ob.palindrome();
    }
}