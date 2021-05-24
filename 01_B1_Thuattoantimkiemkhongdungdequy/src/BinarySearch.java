public class BinarySearch {
    static int[] list = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};
    static int binarySearch(int[] list, int value){
        int low = 0;
        int high = list.length-1;
        while (high>=low){
            int mid = (high+low)/2;
            if (value < list[mid]){
                high = mid-1;
            } else if (value>list[mid]){
                low = mid +1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(binarySearch(list,2));
        System.out.println(binarySearch(list,11));
        System.out.println(binarySearch(list,79));
        System.out.println(binarySearch(list,1));
        System.out.println(binarySearch(list,5));
        System.out.println(binarySearch(list,80));
    }
}
