public class SumOfMatrix {
    public static void main(String[] args) {
        int[][] Matrix1 = {{1,2,3},
                           {4,5,6},
                           {7,8,9}};
        int N = Matrix1.length;
        int M = Matrix1[0].length;
        int result1 = Matrix_Sum(N,M,Matrix1);
        System.out.println(result1);

    }
    public static int Matrix_Sum(int N, int M, int Mat[][]){
        int sum = 0;
        for(int i=0; i<N; i++)
            for(int j = 0; j<M; j++)
                sum += Mat[i][j];
        return sum;

    }
}
