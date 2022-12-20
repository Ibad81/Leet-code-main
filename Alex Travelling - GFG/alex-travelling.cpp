//{ Driver Code Starts
// Initial Template for C++

#include <bits/stdc++.h>
using namespace std;

// } Driver Code Ends
// User function Template for C++
class Solution {
  public:
    int bfs(vector<pair<int,int>> adj[],int s,vector<bool>& visited,vector<int>& weights)
    {
      
        
        queue<pair<int,int>> q;
        q.push({s,0});
        weights[s]=0;
        visited[s]=true;
        while(q.empty()!=true)
        {
            
            pair<int,int> it = q.front();
            q.pop();
            
            int x = it.first;
            //int w = it->second;
            
            for(auto i = adj[x].begin(); i!=adj[x].end(); i++)
            {
                int a = i->first;
                int b = i->second;
                if(weights[x]+b<weights[a])
                {
                   weights[a] =weights[x]+b;
                   //visited[a]=true;
                   visited[a]=true;
                q.push({a,b});
                }
                
            }
            
         
        }
        int max = INT_MIN;
        for(int i=1;i<weights.size();i++)
        {
           if(weights[i]>max)
           max = weights[i];
        }
       
        return max;
           
    }
    int minimumCost(vector<vector<int>>& flights, int n, int k) {
        // code here
        vector<pair<int,int>> adj[n+1];
        for(int i=0;i<flights.size();i++)
        {
            int x = flights[i][0];
            int y = flights[i][1];
            int z = flights[i][2];
            adj[x].push_back(make_pair(y,z));
        }
        vector<bool> visited(n+1,false);
        vector<int> weights(n+1,INT_MAX);
       
       int max =  bfs(adj,k,visited,weights);
         for(int i=1;i<visited.size();i++)
        {
            if(visited[i]==false)
           {
              return -1;
           }
        }
       return max;
    }

};


//{ Driver Code Starts.
int main() {
    int t;
    cin >> t;
    while (t--) {
        int n, k;
        cin >> n >> k;
        int size;
        cin >> size;
        vector<vector<int>> flights(size,vector<int>(3));
        for (int i = 0; i < size; i++) {
            vector<int> temp;
            for (int j = 0; j < 3; ++j) {
                int x;
                cin >> x;
                temp.push_back(x);
            }
            flights[i]=temp;
        }

        Solution ob;
        cout << ob.minimumCost(flights, n, k) << "\n";
    }
}

// } Driver Code Ends