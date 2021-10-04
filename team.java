import java.io.*;
import java.util.*;
 
public class team {
    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        PrintWriter pw = new PrintWriter(System.out);
        
        int n=sc.ni();
        int a[][]=new int[n][3];
        int k=0,solved=0;
        for(int i=0;i<n;i++)
        {
            a[i][0]=sc.ni();
            a[i][1]=sc.ni();
            a[i][2]=sc.ni();
            if(a[i][0]==1)
            k++;
            if(a[i][1]==1)
            k++;
            if(a[i][2]==1)
            k++;
            if(k>=2)
            solved++;


            k=0;
        }
        pw.println(solved);
        
        pw.close();
    }
    
    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;
 
        public FastScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }
 
        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
 
        int ni() {
            return Integer.parseInt(next());
        }
    }
}