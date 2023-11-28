public class Main {
    public static void main(String[] args) {
        Integer result1 = MaximumFinder.findMaximum(3,2,1);
        System.out.println("Test Case 1.1 Result: " + result1);
        Integer result2 = MaximumFinder.findMaximum(2,3,1);
        System.out.println("Test Case 1.2 Result: " + result2);
        Integer result3 = MaximumFinder.findMaximum(1,2,3);
        System.out.println("Test Case 1.3 Result: " + result3);

        Float result4 = MaximumFinder.findMaximum(10.5f, 5.2f, 8.7f);
        System.out.println("Test Case 2.1 Result: " + result4);
        Float result5 = MaximumFinder.findMaximum(5.2f, 10.5f, 8.7f);
        System.out.println("Test Case 2.2 Result: " + result5);
        Float result6 = MaximumFinder.findMaximum(8.7f,5.2f,10.5f);
        System.out.println("Test Case 2.3 Result: " + result6);
    }
    }


