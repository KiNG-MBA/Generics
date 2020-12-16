public class PrintArray {
    public static void main(String[] args) {
        String[] text = {"ali", "masoud", "hassan", "mehdi", "saeed"};
        Integer[] numbers = {12, 432, 523, 81, 15, 9};
        Double[] decimal = {8.3, 88.34, 50.1, 90.9, 63.33};
        Character[] characters = {'c', 'd', 't', '5', 'm'};

        printArray(text);
        printArray(text,0,4);
        printArray(numbers);
        printArray(numbers,2,6);
        printArray(decimal);
        printArray(characters);

    }

    // write a generics method
    public static <G> void printArray(G[] array) {
        //print array
        for (G arrays : array) {
            System.out.print(arrays + " || ");
        }
        System.out.println("\n+++++++++++++++++++++++++");

    }

    // overload method with different parameter
    public static <G> void printArray(G[] array, int lowSubscript, int highSubscript) {
        //check index value
        if (lowSubscript < 0 || highSubscript > array.length-1) {
            throw new IllegalArgumentException("Out of array range");
        }

        //print array
        for (int i = lowSubscript; i <highSubscript ; i++) {
            System.out.print(array[i]+" * ");
        }
        System.out.println("\n#########################");
    }

    // overload method as not generics
    public static void printArray(String[] text) {
        //print array
        for (String texts : text) {
            System.out.print(texts + " // ");
        }
        System.out.println("\n*************************");
    }


}
