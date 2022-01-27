// 実行
// javac Index.java コンパイルを行う
// java Index

// "\n" == 改行   バックスラッシュの打ち方option+¥

// import java.io.＊は「入出力（inputとoutput）に関するパッケージの中身を全て用意せよ」
// import java.net.*は「ネットワークに関するパッケージの中身を全て用意せよ」
// 名称空間(パッケージ)を外部から参照するための設定です。
// Java のクラスは階層化していて、天文学的な数の名前が存在します。
// それを、全部認識すると、もの凄く遅くなってしまいます。
// また、階層が違うけど、たまたま名前が同じだと混乱してしまいます。
// import java.io.*; で始まる名前のクラスなどを認識できる。netの方も同様

// 汎用的でOSに依存しないメリットがある
//   例えばmacos、windowsのどちらでも安定して動作するという点
//   作ったソフトが動く環境を考える手間が省ける

// たくさんのメリットがあるなかで
// 動かすためのインフラの整備が難しいみたい

// String[] argsは、プログラム起動時に指定する値（コマンドライン引数）
// argsの引数の名前のところはなんでもいいらしい

class Index {
  public static void main(String[] args) {

    // String name = "ryoma";
    // int age = 24;
    // double height = 1.2;
    // double weight = 55;
    // double bmi = weight / height / height;

    // System.out.println("名前は" + name + "です");
    // System.out.println("年齢は" + age + "歳です");
    // System.out.println("身長は" + height + "mです");
    // System.out.println("体重は" + weight + "kgです");
    // System.out.println("BMIは" + bmi + "です");

    // switch (age % 5) {
    // case 0:
    //   System.out.println(age + "周年です");
    //   break;
    // case 3:
    //   System.out.println("再来年" + (age + 2));
    //   break;
    // case 4:
    //   System.out.println("来年" + (age + 1));
    //   break;
    // default:
    //   System.out.println("その他");
    //   break;
    // }

    // // while,stop
    // int i = 1;
    // while (i < 10) {
    //   if (i % 5 == 0) {
    //     break;
    //   }
    //   System.out.println(i);
    //   i++;
    // }

    // // for,skip
    // for (int j = 1; j < 10; j++) {
    //   if (j % 3 == 0) {
    //     continue;
    //   }
    //   System.out.println(j);
    // }

    // int numbers[] = { 1, 4, 6, 9, 13, 16 };
    // int oddSum = 0;
    // int evenSum = 0;

    // // 配列numbersの偶数の和と奇数の和
    // for (int number : numbers) {
    //   if (number % 2 == 0) {
    //     evenSum = evenSum + number;
    //   } else {
    //     oddSum = oddSum + number;
    //   }
    // }

    // System.out.println("奇数の和は" + oddSum + "です");
    // System.out.println("偶数の和は" + evenSum + "です");



    // 練習問題
    // for(int i = 1; i <= 20; i++){
    //   if (i%3 == 0 && i%5 == 0){
    //     System.out.println("FizzBuzz");
    //   }else if(i%3 == 0) {
    //     System.out.println("Fizz");
    //   }else if (i%5 == 0){
    //     System.out.println("Buzz");
    //   }else{
    //     System.out.println(i);
    //   }
    // }

// for ifの組み合わせ
    // for(int i = 1; i <= 3; i++){
    //   for(int j = 3; j >= 1; j--){
    //     if(i != j){
    //         // 文字列と文字列を足そうとしているからできない
    //       System.out.println("("+i,j+")+("+i,j+")");
    //     }
    //   }
    //   System.out.println();
    // }


// 奇数飲みの合計値の出し方
    // int sum = 0;

    // for (int i = 1; i < 20; i++) {
    //     if (i % 2 != 0){
    //         System.out.println(i);
    //         sum += i;
    //     }
    // }

    // System.out.println("合計値 = " +  sum);



// ピラミッド
//     for(int i=0; i<5; i++){
//       for(int j=0; j<5-(i+1); j++){
//         System.out.print(" ");
//       }
//       for(int g=0; g<(i+1)*2-1; g++){
//         System.out.print("*");
//       }
//       System.out.println("");
//     }

// // 逆ピラミッド

    // for(int i=0; i<5; i++){
    //     // iは繰り返すほど大きくなるがjは常に0スターとでiより小さい間繰り返すので回数を繰り返すだけスペースが増えていく
    //   for(int j=0; j<i; j++){
    //     System.out.println(" ");
    //   }
    //   for(int a=0; a<(5-i)*2-1; a++){
    //     System.out.print("*");
    //   }
    //   System.out.print("/n");
    // }


// 表示について
    // System.out.print("アイウエオ");
    // System.out.print("アイウエオ");
    // System.out.print("アイウエオ");

    // System.out.println("アイウエオ");
    // System.out.println("アイウエオ");
    // System.out.print("/n");
    // System.out.println("アイウエオ");

// intとstrの両方を文字列として出力する
    // int num = 5;
    // String str = "Java printメソッド";
    // System.out.printf("【%d分でわかる】%sで文字列を出力する方法", num, str);

    // 書式指定子
    // %d = 10進数の整数
    // %s = 文字列


  }
}
