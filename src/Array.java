public class Array {
    public static void main(String[] args) {
     int[] A = {1,2,3,4,5,6,7,8,9,10};
    for(int i=0; i<10; i++){
        System.out.println(A[i]);
    }
// max and min
        int max = A[0];
        int min = A[0];
        for(int i=0; i<10; i++){
            if (A[i] > max) {
                max = A[i];
            }
            if (A[i]< min){
                min = A[i];
            }
        }
        System.out.println("max" + max);
        System.out.println("min" + min);

    }
}

// this case the time complexity is O(n)

