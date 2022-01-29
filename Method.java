import java.io.*;

public class Method {

  // 1,整数の 2 乗を計算するメソッドを作成しなさい。
  // １つの int 型引数を取り、結果を int 型の戻り値として返すこと。
  // また、メソッドの動作を検証できるようにプログラムを作成しなさい。
  // public static void main( String[]args ) throws IOException{
  //   BufferedReader br = new BufferedReader(
  //                         new InputStreamReader( System.in ) );
  //   int x = Integer.parseInt(br.readLine());
  //   System.out.println(x + "の2乗=" + squared(x));
  // }
  // static int squared(int n){
  //   return n * n;
  // }


  // 2,２つの整数の平均を計算するメソッドを作成しなさい。
  // ２つの int 型引数を取り、結果を int 型の戻り値として返すこと。
  // また、メソッドの動作を検証できるようにプログラムを作成しなさい。
  // ※ 	平均の計算は整数で行い、小数点以下は切り捨ててよい。

  // public static void main( String[]args) throws IOException {
  //   BufferedReader br = new BufferedReader(
  //                         new InputStreamReader( System.in ) );
  //   int x = Integer.parseInt(br.readLine());
  //   int y = Integer.parseInt(br.readLine());
  //   System.out.println("平均値：" + avg(x,y));
  // }

  // static int avg(int x ,int y){
  //   return (x + y) / 2;
  // }


  // 3,２つの整数の大きい方を選ぶメソッドを作成しなさい。
  // ２つの int 型引数を取り、大きい方の数値を戻り値として返すこと。
  // また、このメソッドを使用して、int 型の変数 x、y、z にそれぞれ数値を入力し、
  // 最も大きい数値を表示するプログラムを作成しなさい。

  // public static void main( String[]args ) throws IOException {
  //   BufferedReader br = new BufferedReader(
  //                         new InputStreamReader( System.in ) );
  //   int x = Integer.parseInt(br.readLine());
  //   int y = Integer.parseInt(br.readLine());
  //   int z = Integer.parseInt(br.readLine());
  //   System.out.println( max(x, max(y,z)) );
  // }

  // public static int max(int a, int b){
  //   if(a > b){
  //     return a;
  //   }else{
  //     return b;
  //   }
  // }

  // 4,サイズを示す数値（int）を引数とし、
  // 何等かの文字で例のような三角形を表示するメソッドを作成しなさい。
  // また、このメソッドを使用してサイズ 3、4、5 の３つの三角形を表示するプログラムを作成

    // public static void main(String[]args){
    //   triangle(3);
    //   triangle(4);
    //   triangle(5);
    // }
    // static void triangle(int size){
    //   for(int i = 0; i < size; i++){
    //     for(int j = 0; j <= i; j++){
    //       System.out.print("*");
    //     }
    //     System.out.println();
    //   }
    //   System.out.println();
    // }

    // 5,サイズを示す数値と、表示する文字を引数とし、
    // 三角形を表示するメソッドを作成しなさい。
    // このメソッドを使用して、サイズと文字の異なる３つの三角形を表示しなさい。
    // ※ 	サイズを示す引数は int 型、表示する文字の引数は char 型にする。
    
    // public static void main(String[]args) {
    //   triangle(3, '*');
    //   triangle(4, '+');
    //   triangle(5, '?');
    // }

    // static void triangle(int size, char c1){
    //   for(int i = 0; i < size; i++){
    //     for(int j = 0; j <= i; j++){
    //       System.out.print(c1);
    //     }
    //     System.out.println();
    //   }
    //   System.out.println();
    // }


    // 6,九九のひとつの段を表示するメソッドを作成しなさい。
    // 何の段（ 1 ～ 9 ）であるかを引数とします。
    // このメソッドを使用して、九九表を作成しなさい。
    // public static void main(String[]args){
    //   for(int i = 1; i < 10; i++){
    //     kuku(i);
    //   }
    // }

    // static void kuku(int num){
    //   for(int i = 1; i < 10; i++){
    //     System.out.print(" " + num * i);
    //     // System.out.printf( " %2d", num * i );
    //   }
    //   System.out.println();
    // }


    // 7,このメソッドを使用して 10000 以上 10100 未満の素数をすべて表示する

    // public static void main(String[]args) {
    //   for(int i = 10000; i < 10010; i++){
    //     if(judge(i)){
    //       System.out.print(i + " ");
    //     }
    //   }
    // }

    // static boolean judge(int num){
    //   for(int j = 1; j <= (j / 2); j++){
    //     if(num % j == 0){
    //       return false;
    //     }
    //   }
    //   return true;
    // }

    // 8,メソッドを再帰的に呼び出すことによって、
    // フィボナッチ数列の n 番目の項を計算するメソッドを作成しなさい。
    // 最初の２つの項、0 番目を 0、1 番目を 1 とします。
    // このメソッドを使用して、11 番目から 20 番目までの項を表示する
    // プログラムを作成しなさい。

    public static void main(String[]args){
      for(int i = 11; i <= 20; i++){
        System.out.print(fibo(i) + " ");
      }
    }
    static int fibo(int num){
      // int sum = 0;
      // sum += num;
      // return sum;
    }

    // 解答
    static int Fibonacci( int n ){
      if( n == 0 )
          return 0;
      else if( n == 1 )
          return 1;
      else
          return Fibonacci( n - 2 ) + Fibonacci( n - 1 );
    }

}
