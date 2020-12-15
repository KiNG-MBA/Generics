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

    public static <G> void printArray(G[] array) {
        for (G arrays : array) {
            System.out.print(arrays + " || ");
        }
        System.out.println();

    }

    public static <G> void printArray(G[] array, int lowSubscript, int highSubscript) {
        if (lowSubscript < 0 || highSubscript > array.length-1) {
            throw new IllegalArgumentException("Out of array range");
        }

        for (int i = lowSubscript; i <highSubscript ; i++) {
            System.out.print(array[i]+" * ");
        }
        System.out.println("#########################");
    }


}
