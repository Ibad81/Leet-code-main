//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {

            int N;
            N = sc.nextInt();

            int[] asteroids = new int[N];
            for (int i = 0; i < N; i++) asteroids[i] = sc.nextInt();

            Solution obj = new Solution();
            int[] res = obj.asteroidCollision(N, asteroids);

            for (int e : res) System.out.print(e + " ");
            System.out.println();
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public static int[] asteroidCollision(int N, int[] arr) {
        // code here
        // ArrayList<Integer> list = new ArrayList<>();
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<N;i++){
            if(st.isEmpty())
            st.push(arr[i]);
            else if(st.peek()>0 && arr[i]<0 && st.peek() == Math.abs(arr[i]))
            st.pop();
            else if(st.peek()>0 && arr[i]<0 && st.peek()<Math.abs(arr[i])){
            st.pop();
            i--;    
            }
            else if(st.peek()>0 && arr[i]<0 && st.peek()>Math.abs(arr[i]))
            continue;
            else
            st.push(arr[i]);
        }
        int ans[] = new int[st.size()];
        int n = st.size() - 1;
        while(!st.isEmpty()){
            ans[n] = st.pop();
            n--;
        }
        return ans;
    }
}