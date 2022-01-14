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




  }
}
