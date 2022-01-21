import java.io.*;

class Repeat {
  public static void main(String[] args) throws IOException {

    // 2,九九、三の段（ 3 ～ 27 の 3 の倍数）を表示するプログラムを作成しなさい。
    // for(int i = 1; i < 10; i++) {
    //   System.out.println(i * 3);
    // }

    // 3,2 の 1 乗から 8 乗までを計算し表示するプログラムを作成しなさい。
    // int x = 1;
    // for(int n = 1; n <= 8; n++){
    //   x *= 2;
    //   System.out.println(x);
    // }

    // 4,7 の階乗を計算し、表示するプログラムを作成しなさい。
    // int x = 1;
    // for(int i = 7; i >= 1; i-- ) {
    //   x *= i;
    // }
    // System.out.println(x);

    // 解答
    // int x = 1;
    // for(int i = 2; i <= 7; i++){
    //   x *= i;
    // }
    // System.out.println(x);

    // 5,整数を 10 回入力し、平均値を求めるプログラムを作成しなさい。
    // BufferedReader br = new BufferedReader(
    //                             new InputStreamReader( System.in ) );

    // int sum = 0;
    // for(int i = 1; i <= 10; i++ ){
    //   System.out.println("数字を入力してね" + i + "回目");
    //   int x = Integer.parseInt(br.readLine());
    //   sum += x;
    // }

    // System.out.println(sum / 10);

    // 6,整数、0 か 1 を 10 回入力する。これを対戦成績と考え、0 を負け、1 を勝ちとして、勝ちの総数、負けの総数を表示するプログラムを作成しなさい。
    // BufferedReader br = new BufferedReader(
    //                             new InputStreamReader( System.in ) );
    //   int win = 0;
    //   int lose =0;
    //   for(int i = 1; i <= 10; i++ ){
    //     System.out.println("負け=>0,勝ち=>1　を入力してね");
    //     int x = Integer.parseInt(br.readLine());
    //     if(x == 0) {
    //       win ++;
    //     }else if (x == 1) {
    //       lose ++;
    //     }
    //   }
    //   System.out.println("勝ち" + win);
    //   System.out.println("負け" + lose);


      // 解答
      // BufferedReader br = new BufferedReader(
      //                   new InputStreamReader( System.in ) );
      // int wins = 0;

      // for( int i = 0 ; i < 10 ; i++ ){
      //     int result = Integer.parseInt( br.readLine() );

      //     if( result == 1 )
      //         wins += 1;
      // }

      // System.out.println( "勝ち" + wins + "回、負け" + ( 10 - wins ) + "回" );


      // 7,次のプログラムを作成しなさい。
      // 巨人、阪神戦で毎回の得点を入力する。（１回～９回）
      // 入力が終わったら、それぞれの得点とどちらが勝ったかを表示する。
      // ※ 	試合は巨人の先行とする。

      // BufferedReader br = new BufferedReader(
      //                     new InputStreamReader( System.in ) );
      // int g = 0;
      // int h = 0;
      // for(int i = 1; i <= 9; i++) {
      //   for(int x = 0; x < 2; x++){
      //     System.out.println(i + "回" + x);
      //     int point = Integer.parseInt(br.readLine());
      //     if(x == 0) {
      //       g += point;
      //     }else{
      //       h += point;
      //     }
      //   }
      // }
      // System.out.println("巨人" + g + ",阪神" + h);
      // if(g > h){
      //   System.out.println("巨人のかち");
      // }else if(g < h){
      //   System.out.println("阪神のかち");
      // }else{
      //   System.out.println("引き分け");
      // }


      // 解答
      // int giants = 0;
      // int tigers = 0;

      // for( int game = 1 ; game <= 9 ; game++ )
      // {
      //     System.out.print( game + "回表、巨人の得点は？" );
      //     giants += Integer.parseInt( br.readLine() );

      //     System.out.print( game + "回裏、阪神の得点は？" );
      //     tigers += Integer.parseInt( br.readLine() );
      // }

      // System.out.println( "巨人：" + giants + "点, 阪神：" + tigers + "点" );

      // if( giants > tigers )
      //     System.out.println( "巨人の勝ち" );
      // else if( giants < tigers )
      //     System.out.println( "阪神の勝ち" );
      // else
      //     System.out.println( "引き分け" );


      // 9,自然数（正の整数）を 10 回入力し、最大値、最小値を求めるプログラムを作成しなさい。
      // BufferedReader br = new BufferedReader(
      //                     new InputStreamReader( System.in ) );
      // int max = 0;
      // int min = 0;
      // System.out.println( "10回入力してね" );
      // for(int i = 0; i < 10; i++) {
      //   int x = Integer.parseInt( br.readLine() );

      //   if(i == 0){
      //     max = x;
      //     min = x;
      //   }else {
      //     if(max < x){
      //       max = x;
      //     }
      //     if(min > x) {
      //       min = x;
      //     }
      //   }
      // }
      // System.out.println( "最大値は" + max);
      // System.out.println( "最小値は" + min);


      // 10,個数を示す数値を入力し、その個数分だけ‘*’を表示するプログラムを作成しなさい。
      // BufferedReader br = new BufferedReader(
      //                     new InputStreamReader( System.in ) );
      // System.out.println( "入力してね" );
      // int x = Integer.parseInt( br.readLine() );
      // for(int i = 0; i < x; i++) {
      //   System.out.println( "*" );
      // }


      // 11,個数を示す数値を入力し、その個数分だけ 0 ～ 9 の数字を表示するプログラムを作成しなさい。数字は 0, 1, 2, 3, , の順に表示し、9 の次は 0 に戻るものとします。
      // BufferedReader br = new BufferedReader(
      //                     new InputStreamReader( System.in ) );
      // int x = Integer.parseInt(br.readLine());
      // for(int i = 0; i <= x; i++) {
      //   System.out.println(i);
      // }

      // int count = Integer.parseInt(br.readLine());
      // for(int i = 0, out = 0; i < count; i++) {
      //   System.out.println(out++);
      //   if(out > 9){
      //     out = 0;
      //   }
      // }


      // 12,数値を繰り返し入力し、合計が 100 を超えたら入力を止めて合計を表示するプログラムを作成しなさい。
      // BufferedReader br = new BufferedReader(
      //                     new InputStreamReader( System.in ) );

      // for(int sum = 0; sum > 100;){
      //   sum += Integer.parseInt(br.readLine());
      // }
      // System.out.println(sum);

      // int sum = 0;
      // while(sum <= 100){
      //   sum += Integer.parseInt(br.readLine());
      // }
      // System.out.println(sum);


      // 13,ストライク・カウントを数えるプログラムを作成しなさい。
      // １球ごとにストライクかボールかを入力する。
      // ３ストライクまたは４ボールになったら入力を止め、ストライクとボールのカウントを表示する。

      // BufferedReader br = new BufferedReader(
      //                     new InputStreamReader( System.in ) );
      // int s = 0;
      // int b = 0;
      // System.out.println("ストライクなら０を、ボールなら1を入力してね");

      // while(s < 3 && b < 4){
      //   int count = Integer.parseInt(br.readLine());
      //   if(count == 0){
      //     s ++;
      //   }else if(count == 1){
      //     b ++;
      //   }else{
      //     System.out.println("0か１でお願い");
      //   }
      // }
      // System.out.println("ストライク" + s + " ボール" + b);


      // 14,前の問題に次の修正を加えなさい。
      // １球ごとにストライク、ボール、ファウルの何れかを入力する。（残念ながらヒットにはなりません）
      // ファウルの場合、２ストライクまではストライクにカウントするが、３ストライクにはならない。
      // ３ストライクまたは４ボールになったら入力を止め、ストライクとボールのカウントを表示する。
      // BufferedReader br = new BufferedReader(
      //                     new InputStreamReader( System.in ) );
      //   int s = 0;
      //   int b = 0;
      //   System.out.println("ストライクなら０を、ボールなら1を、ファールなら2を入力してね");
      //   while(s < 3 && b < 4){
      //     int j = Integer.parseInt(br.readLine());
      //     if(j == 0 || (j == 2 && s < 2)) {
      //       s ++;
      //     }else if(j == 1){
      //       b ++;
      //     }
      //   }
      //   if(s == 3){
      //     System.out.println("ストラックアウト");
      //   }else if(b == 4){
      //     System.out.println("ファーボール");
      //   }

      // ***
      // 15,入力された数が素数かどうかを判定するプログラムを作成しなさい。
      // *retutnの後は処理されない特性に注意
      // BufferedReader br = new BufferedReader(
      //                     new InputStreamReader( System.in ) );
      // int x = Integer.parseInt(br.readLine());
      // if(x < 2){
      //   System.out.println("素数じゃない");
      //   return;
      // }

      // for(int i = 2; i < x; i++){
      //   if(x % i == 0){
      //       System.out.println("素数ではありません。");
      //       return;
      //   }
      // }
      // System.out.println("素数です");

      // *****
      // 16,2 以上の数値を入力し、素因数分解した結果を表示しなさい
      // BufferedReader br = new BufferedReader(
      //                     new InputStreamReader( System.in ) );
      // int x = Integer.parseInt(br.readLine());
      // if(x < 2){
      //     System.out.println("素数じゃない");
      //     return;
      //   }
      // for(int i = 2; x > 1; i++){
      //   while(x % i == 0){
      //     x /= i;
      //     System.out.print(i + " ");
      //   }
      // }


    // 17,九九表（一の段～九の段）を表示するプログラムを作成しなさい。
    for(int x = 1; x < 10; x++){
      for(int y = 1; y < 10; y++){
        // System.out.print(x + "*" + y + "=" + x * y + " ");
        System.out.printf("%d * %d = ", x,y);
        System.out.print(x * y + "  ");
      }
      System.out.println();
    }


    // 18,数値を繰り返して入力し、0 が入力されたら入力を止め、それまでの合計を表示するプログラムを作成しなさい。
    // BufferedReader br = new BufferedReader(
    //                       new InputStreamReader( System.in ) );
    //   int x = 1;
    //   int sum = 0;
    //   while(x != 0){
    //     x = Integer.parseInt(br.readLine());
    //     sum += x;
    //   }
    //   System.out.println("入力値の合計：" + sum);

      // 解答
      // int sum = 0;
      // for( ; ; ){
      //   int x = Integer.parseInt(br.readLine());
      //   sum += x;
      //   if(x == 0){
      //     break;
      //   }
      // }
      // System.out.println("入力値の合計：" + sum);


    // 19,数値を繰り返して入力し、0 が入力されたら入力を止め、平均値を表示するプログラムを作成しなさい。
      // BufferedReader br = new BufferedReader(
      //                       new InputStreamReader( System.in ) );
      // int sum = 0;
      // int icount = 0;
      // for(; ;){
      //   int x = Integer.parseInt(br.readLine());
      //   sum += x;
      //   if(x == 0){
      //     break;
      //   }
      //   icount ++;
      // }
      // System.out.println("入力値の平均：" + sum / icount);


    // 20,サイズを示す数値を入力し、何かの文字でそのサイズの三角形を表示するプログラムを作成しなさい。
    // BufferedReader br = new BufferedReader(
    //                         new InputStreamReader( System.in ) );
    // int x = Integer.parseInt(br.readLine());
    // for(int i = 0; i <= x; i++){
    //   for(int j = 0; j <= i; j++){
    //     System.out.print("*");
    //   }
    //   System.out.println();
    // }


    // 21,サイズを示す数値を入力し、そのサイズの×印を何等かの文字で表示するプログラムを作成しなさい。
    // BufferedReader br = new BufferedReader(
    //                       new InputStreamReader(System.in));
    // int size = Integer.parseInt(br.readLine());

    // for(int i = 0; i < size; i++){
    //     // System.out.println("*");
    //     // for(int j = 0 ; j <= i ; j++){
    //     //   System.out.print(" ");
    //     // }

    //     // 解答
    //     for(int j = 0 ; j < size ; j++){
    //         if(i == j || (size - i - 1) == j)
    //             System.out.print("*");
    //         else
    //             System.out.print(" ");
    //     }
    //     System.out.println("");
    // }


    // 22,フィボナッチ数列を表示するプログラムを作成しなさい。
    // 最初の２つの項を 0、1 とし、1000 まで（ 1000 以下の項）を表示するものとします。
    // int []numbers = {0,1};
    // int fibo = 0;
    // // System.out.print(numbers[0]);
    // for(int i = 2; fibo <= 1000; i++){
    //   fibo += 1;
    // }

    int n1 = 0;
    int n2 = 1;
    int n3 = n1 + n2;

    while(n1 <= 1000){
      System.out.print(n1 + ",");
      n1 = n2;
      n2 = n3;
      n3 = n1 + n2;
    }

  }
}