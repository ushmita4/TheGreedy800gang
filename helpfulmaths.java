import java.io.*;
import java.util.*;
 
public class helpfulmaths {
    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        PrintWriter pw = new PrintWriter(System.out);
        
        String s=sc.next();
        String s1="";
        for(int i=49;i<=51;i++){
           for(int j=0;j<s.length();j++){
               if((s.charAt(j)==(char)i))
               s1=s1+s.charAt(j)+'+';
           }
        }
        pw.println(s1.substring(0,s.length()));
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