import java.util.Scanner;

public class Main {

    // Agenda for today :
    // Binary Search
    // Broken Economy : ceil and floor
    // First and last index
    // Subset

    // Binary Search (BS) :
    // works only on sorted arrays (treat this as a hint to solve a problem)
    // to work on unsorted array, we need to sort to apply BS
    //
    // 1. Find the middle element of the array : mid = (start + end)/2
    // 2. Compare the middle element with the target : target -?- mid
    // 3. If the target is greater, search the right half of the array
    // target > mid ? start = mid + 1 : end = mid - 1
    // 4. If the target is smaller, search the left half of the array
    // 5. If the target is equal, return the index of the target
    // target == mid : return mid
    // 6. If the target is not found, return -1

    public static int binarySearch(int[] arr, int target) {

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        sc.close();
    }
}
