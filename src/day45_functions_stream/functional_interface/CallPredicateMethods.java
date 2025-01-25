package day45_functions_stream.functional_interface;

public class CallPredicateMethods {
    public static void main(String[] args) {

        System.out.println("Is Palindrome? ");
        System.out.println(UsePredicate.isPalindrome.test("anna"));
        System.out.println(UsePredicate.isPalindrome.test("loop"));

        System.out.println();
        System.out.println("Is Prime? ");
        boolean isPrime = UsePredicate.isPrime.test(5);
        System.out.println(isPrime);
        System.out.println(UsePredicate.isPrime.test(6));
    }
}
