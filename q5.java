public class q5 {
    public static void main(String[] args) {
        // initializing the values of the two numbers
        int num1 = 10;
        int num2 = 20;

        // printing the original values of the numbers
        System.out.println("Before swapping:");
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        // swapping the values of the two numbers using a third variable
        int temp = num1;
        num1 = num2;
        num2 = temp;

        // printing the swapped values of the numbers
        System.out.println("After swapping:");
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
    }
}
