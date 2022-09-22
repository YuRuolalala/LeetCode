package Array.BinarySearch;

public class Search_Insert_Position_35 {

    public int searchInsert(int[] arr,int key) {
        int L = 0, R = arr.length - 1;
        int M = L + ((R - L) >> 1);
        while (L <= R) {
            M = L + ((R - L) >> 1);
            if (arr[M] < key) {
                L = M + 1;
            } else if (arr[M] > key) {
                R = M - 1;
            } else {
                return M;
            }
        }
        return R + 1;
    }
}
