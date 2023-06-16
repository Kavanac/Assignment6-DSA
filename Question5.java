
	import java.io.*;
	import java.util.*;

	public class Question5 {

		
		static long minValue(int A[], int B[], int n)
		{
			
			Arrays.sort(A);
			Arrays.sort(B);

			long result = 0;
			for (int i = 0; i < n; i++)
				result += (A[i] * B[n - i - 1]);

			return result;
		}

		
		public static void main(String[] args)
		{
			int A[] = {5,3,4,2 };
			int B[] = { 4,2,2,5};
			int n = A.length;
			;
			System.out.println(minValue(A, B, n));
		}
	}




