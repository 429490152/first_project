package leetcode;

public class mergearray {

    public static void main(String args[]){
        int[] arr = {1,3, 7, 8};
        int[] arr2 = {2, 4, 5 ,9, 10 };
        int m,n;
        merge(arr, m=6 ,arr2 ,n=7);
    }

    public static void merge(int A[], int m, int B[], int n) {
        int i=m-1, j=n-1, k=m+n-1;

        while (i>-1 && j>-1) {
            A[k--]= (A[i]>B[j]) ? A[i--] : B[j--];
        }
        while (j>-1) {
            A[k--]=B[j--];
        }

        for (int a=0 ; a<A.length;a++){
            System.out.print(A[a] +" ");
        }

    }
}
