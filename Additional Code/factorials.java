public class factorials {
    public static void main(String[] args) {
        System.out.print(factorialRecursion(5));
        System.out.print(factorialFor(5));
    }
    public static int factorialRecursion(int i) { // factorials with recursion
        if (i <= 0)
            return 1;
        else
            return (i) * factorialRecursion(i - 1);
    }
    public static int factorialFor(int i) { // factorials with for loop
        int sum = 1;
        for (int k = 0; k < i; k++)
            sum = sum + (sum * k);
        return sum;
    }

    /*

if (n < = 1) // base case
        return 1;
    else    
        return n*fact(n-1); // recursion


    */
}