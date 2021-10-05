import java.io.*;
import java.util.*;

 
public class iwannabetheguy {
    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        PrintWriter pw = new PrintWriter(System.out);
        
        int n=sc.ni();
        HashMap<Integer, Integer> level
            = new HashMap<Integer, Integer>();
        int x=sc.ni();
        for(int i=1;i<=x;i++){
            int l=sc.ni();
            if(level.containsKey(l))
            level.put(l, level.get(l) + 1);

            else{
                level.put(l, 1);
            }
        }
        int y=sc.ni();
        for(int i=1;i<=y;i++){
            int l=sc.ni();
            if(level.containsKey(l))
            level.put(l, level.get(l) + 1);

            else{
                level.put(l, 1);
            }
        }
         int l2=level.size();
        if(n==l2)
        pw.println("I become the guy.");

        else 
        pw.println("Oh, my keyboard!");
        
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
