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

        String result7 = MaximumFinder.findMaximum("Banana", "Peach", "Apple");
        System.out.println("Test Case 1.1 Result: " + result7);
        String result8 = MaximumFinder.findMaximum("Peach", "Banana", "Apple");
        System.out.println("Test Case 1.2 Result: " + result8);
        String result9 = MaximumFinder.findMaximum("Apple", "Peach", "Banana");
        System.out.println("Test Case 1.3 Result: " + result9);

        System.out.println("TC 1.1: " + MaximumFinder.findMaximum(3, 2, 1)); 
        System.out.println("TC 1.2: " + MaximumFinder.findMaximum(1, 3, 2));
        System.out.println("TC 1.3: " + MaximumFinder.findMaximum(1, 2, 3));

        System.out.println("TC 2.1: " + MaximumFinder.findMaximum(3.0f, 2.0f, 1.0f)); 
        System.out.println("TC 2.2: " + MaximumFinder.findMaximum(1.0f, 3.0f, 2.0f)); 
        System.out.println("TC 2.3: " + MaximumFinder.findMaximum(1.0f, 2.0f, 3.0f)); 

        System.out.println("TC 3.1: " + MaximumFinder.findMaximum("Apple", "Peach", "Banana"));
        System.out.println("TC 3.2: " + MaximumFinder.findMaximum("Banana", "Apple", "Peach"));
        System.out.println("TC 3.3: " + MaximumFinder.findMaximum("Peach", "Banana", "Apple"));

        GenericClass<Integer> integerFinder = new GenericClass<>(3, 5, 8);
        System.out.println("Test Case 1.1 Result: " + integerFinder.findMaximum());

        GenericClass<Float> floatFinder = new GenericClass<>(7.0f, 15.3f, 3.8f);
        System.out.println("Test Case 1.2 Result: " + floatFinder.findMaximum());

        GenericClass<String> stringFinder = new GenericClass<>("Kriti", "jaiswal", "girl");
        System.out.println("Test Case 1.3 Result: " + stringFinder.findMaximum());

        GenericClass<Double> doubleFinder = new GenericClass<>(3.5, 7.2, 1.8);
        System.out.println("Additional Test Case Result: " + doubleFinder.findMaximum());

        //more than 3 parameters 
        System.out.println("finding maximum whem we have inputs 5,8,2,1,10,7 : " + MaximumFinder.findMaximum(5, 8, 2, 1, 10, 7));
    }
}

    
    


