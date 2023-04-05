package Homework;

public class BinarySearch {
    public static void main(String[] args) {
        int[] ints = {1,3,6,8,9,14,28,32};
        System.out.println(binarySearch(1,ints));
        System.out.println(binarySearch(3,ints));
        System.out.println(binarySearch(6,ints));
        System.out.println(binarySearch(8,ints));
        System.out.println(binarySearch(9,ints));
        System.out.println(binarySearch(14,ints));
        System.out.println(binarySearch(28,ints));
        System.out.println(binarySearch(32,ints));
        System.out.println(binarySearch(47,ints));
    }


    public static int binarySearch (int search, int[] array){
        int start = 0;
        int end = array.length - 1;

        while (start <= end){

            int middle =(start + end)/2;

            if(search < array[middle]){
                end = middle -1;
            }

            if(search > array[middle]){
                start = middle +1;
            }

            if (search == array[middle]){
                return middle;
            }

        }
        return -1;
    }
}
