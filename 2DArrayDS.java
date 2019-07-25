import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the hourglassSum function below.
    static int hourglassSum(int[][] arr) {
        int max=-999,sum=0,i,j,k=0,m=0;
        for(i=0;i<=3;i++)
        {
            
            for(m=0;m<=3;m++)
            {sum=0;
            for(k=m;k<m+3;k++)
            {
                sum=sum+arr[i][k];
            }
            j=i+2;
            for(k=m;k<m+3;k++)
            {
                sum=sum+arr[j][k];
            }
            
            //if(j==5)
              //  j-=2;
            sum=sum+arr[i+1][k-2];
            if(max<sum)
                max=sum;
        }
        }
    return max;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int result = hourglassSum(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
