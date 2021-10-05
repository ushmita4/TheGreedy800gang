import java.io.*;
import java.util.*;
 
public class hitthelottery {
    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        PrintWriter pw = new PrintWriter(System.out);
        
        int n=sc.ni();
        int d100=n/100;
        int dr100=n%100;
        int d20=dr100/20;
        int dr20=dr100%20;
        int d10=dr20/10;
        int dr10=dr20%10;
        int d5=dr10/5;
        int dr5=dr10%5;
        int d1=dr5/1;
        int dr1=dr5%1;
        
        pw.println(d100+d20+d10+d5+d1);
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
