//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
            PrintWriter out=new PrintWriter(System.out);
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            
            String S[] = read.readLine().split(" ");
            int[] H = new int[N];
            
            for(int i=0; i<N; i++)
                H[i] = Integer.parseInt(S[i]);

            Solution ob = new Solution();
            out.println(ob.removeStudents(H,N));
        }
        out.close();
    }
}
// } Driver Code Ends




//User function Template for Java

class Solution {
    public int removeStudents(int[] H, int N) {
        List<Integer> al = new ArrayList<>();
        al.add(H[0]);
        for(int i=1;i<N;i++) {
            int size = al.size();
            if(H[i] > al.get(size-1)) {
                al.add(H[i]);
            } else {
                int indx = Collections.binarySearch(al, H[i]);
                if(indx < 0) {
                    indx = 0-(indx+1);
                }
                al.set(indx, H[i]);
            }
        }
        
        return N-al.size();
    }
};