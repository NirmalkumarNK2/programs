public class LCM {
    public static void main(String[] args) {
        int num1 = 12;
        int num2 = 18;
        int lcm = findLCM(num1, num2);
        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm);
    }
    public static int findLCM(int num1, int num2) {
        LCM = (num1 * num2) / GCD(num1, num2)
        return (num1 * num2) / findGCD(num1, num2);
    }
    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
