import java.io.*;

public class Arr {
  public static void main(String[] args) throws IOException{

    // 1, 10 個の数値を入力する。
    // 入力された各々の数値を 2 倍にして表示する。
    // BufferedReader br = new BufferedReader(
    //                       new InputStreamReader( System.in ) );
    // int []numbers = new int[10];
    // for(int i = 0; i < 10; i++){
    //   numbers[i] = Integer.parseInt(br.readLine());
    // }
    // System.out.println("----------------");
    // for(int i = 0; i < 10; i++){
    //   System.out.println(numbers[i] * 2);
    // }


    // 2, 10 個の数値を入力する。
    // 入力された順番と逆の順番で 10 個の数値を表示する。
    // BufferedReader br = new BufferedReader(
    //                       new InputStreamReader( System.in ) );
    // int []numbers = new int[10];
    // for(int i = 0; i < 10; i++){
    //   numbers[i] = Integer.parseInt(br.readLine());
    // }
    // System.out.println("----------------");
    // for(int i = 9; i >= 0; i--){
    //   System.out.println(numbers[i]);
    // }


    // 3, 10 個の数値を入力する。
    // 入力された数値を偶数と奇数に分類して表示する。
    // BufferedReader br = new BufferedReader(
    //                       new InputStreamReader( System.in ) );
    // int[] numbers = new int[10];
    // for(int i = 0; i < 10; i++){
    //   numbers[i] = Integer.parseInt(br.readLine());
    // }
    // for(int i = 0; i < 10; i++){
    //   if(numbers[i]%2 == 0){
    //     System.out.println("偶数");
    //   }else{
    //     System.out.println("奇数");
    //   }
    // }

    // 解答
    // BufferedReader br = new BufferedReader(
    //                         new InputStreamReader( System.in ) );
    // int values[] = new int[10];

    // for( int i = 0 ; i < 10 ; i++ ){
    //     values[i] = Integer.parseInt( br.readLine() );
    // }

    // System.out.print( "\n偶数：" );
    // for( int n : values ){
    //     if( n % 2 == 0 )
    //         System.out.print( n + " " );
    // }

    // System.out.print( "\n奇数：" );
    // for( int n : values ){
    //     if( n % 2 != 0 )
    //         System.out.print( n + " " );
    // }


    // 4, 数値を繰り返して入力し、合計が 100 を超えた場合、または入力が 10 回行われた場合、
    // 入力を止め入力された数値をすべて表示するプログラムを作成しなさい。
    // BufferedReader br = new BufferedReader(
    //                       new InputStreamReader( System.in ) );
    // int[] numbers = new int[10];
    // int sum = 0;
    // for(int i = 0; sum < 100 && i < 10; i++){
    //   numbers[i] = Integer.parseInt(br.readLine());
    //   sum += numbers[i];
    // }
    // for(int i = 0; i < 10; i++){
    //     System.out.println(numbers[i]);
    // }

    // 解答
    // int values[] = new int[10];
    // int cnt, sum;

    // for( cnt = 0, sum = 0 ; cnt < 10 && sum <= 100 ; cnt++ ){
    //     values[cnt] = Integer.parseInt( br.readLine() );
    //     sum += values[cnt];
    // }

    // for( int i = 0 ; i < cnt ; i ++ ){
    //     System.out.print( "\n" + values[i] );
    // }


    // 5, 次のコードに追加し、入力された数値を 16 桁の２進数で表示するプログラムを完成させなさい。
    // BufferedReader br = new BufferedReader(
    //                         new InputStreamReader( System.in ) );
    // int value = Integer.parseInt( br.readLine() );

    // int binary[] = new int[16];

    // for( int i = 15; i >= 0; i--, value /= 2){
    //   binary[i] = value % 2;
    // }
    // System.out.print("2進数：");
    // for( int i = 0 ; i < 16 ; i++ ){
    //     System.out.print(binary[i] );
    // }



    // 6, 次のコードに追加し、九九表を表示するプログラムを完成させなさい。
    BufferedReader br = new BufferedReader(
                          new InputStreamReader( System.in ) );
    int kuku[][] = new int[9][];

    for( int i = 0 ; i < 9 ; i++ ){
      kuku[i] = new int[9];

      for( int j = 0 ; j < 9 ; j++ ){
        kuku[i][j] = ( i + 1 ) * ( j + 1 );
      }
    }

    for( int i = 0 ; i < 9 ; i++ ){
      for( int j = 0 ; j < 9 ; j++ ){
        System.out.printf( " %2d", kuku[i][j] );

        System.out.println();
      }
    }



  }
}
