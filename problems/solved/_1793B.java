import java.io.*;
import java.util.*;

public class _1793B {
  public static void main(String[] args) throws IOException {
    Reader in = new Reader();
    int cases = in.nextInt();
    while (cases --> 0) {
      int upper = in.nextInt();
      int lower = in.nextInt();
      int sign = -1;
      int len = 2 * (upper - lower);
      System.out.println(len);
      for (int i = 0; i < len; i++) {
        System.out.print(upper + " ");
        upper += sign;
        if (upper == lower) {
          sign = 1;
        }
      }
      System.out.println();
    }
  }
}

class Reader {
  private BufferedReader br;
  private StringTokenizer str;
  public Reader () {
    br = new BufferedReader(new InputStreamReader(System.in));
  }
  public String nextToken() throws IOException { 
    while (str == null || !str.hasMoreElements()) { 
      str = new StringTokenizer(br.readLine());
    } 
    return str.nextToken(); 
  } 
  public int nextInt() throws IOException {
    return Integer.parseInt(this.nextToken());
  }
  public char[] nextCharArr() throws IOException {
    return nextToken().toCharArray();
  }
  public int[] nextIntArr(int n) throws IOException {
    int[] out = new int[n];
    for (int i = 0; i < n; i++) {
      out[i] = nextInt();
    }
    return out;
  }
  public int[] nextIntArr() throws IOException {
    String[] str = br.readLine().split("\\s+");
    int[] inp = new int[str.length];
    for (int i = 0; i < str.length; i++) {
      inp[i] = Integer.parseInt(str[i]);
    }
    return inp;
  }
  public long[] nextLongArr() throws IOException {
    String[] str = br.readLine().split("\\s+");
    long[] inp = new long[str.length];
    for (int i = 0; i < str.length; i++) {
      inp[i] = Long.parseLong(str[i]);
    }
    return inp;
  }
  public String nextLine() throws IOException {
    return br.readLine();
  }
  public long nextLong() throws IOException {
    return Long.parseLong(this.nextToken());
  }
  public double nextDouble() throws IOException {
    return Double.parseDouble(this.nextToken());
  }
}