import java.io.*;

public class Arr {
  public static void main(String[] args) throws IOException{
    // 1,10 個の数値を入力する。
    // 入力された各々の数値を 2 倍にして表示する。
    BufferedReader br = new BufferedReader(
                          new InputStreamReader( System.in ) );
    int []numbers = new int[10];
    for(int i = 0; i < 10; i++){
      numbers[i] = Integer.parseInt(br.readLine());
    }
    System.out.println("----------------");
    for(int i = 0; i < 10; i++){
      System.out.println(numbers[i] * 2);
    }

    // 10 個の数値を入力する。
    // 入力された順番と逆の順番で 10 個の数値を表示する。





  }
}
