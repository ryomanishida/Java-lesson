// https://kitako.tokyo/lib/JavaExercise.aspx?id=1

class Cal {
  public static void main(String[] args) {
    int x = 13;
    int y = 17;
    System.out.println("x=" + x + ",y=" + y);

    // 4,int 型の変数 x に数値 13 と 17 の和を代入し、x の値を表示するプログラムを作成しなさい。
    x = x + y;
    System.out.println(x);

    // 5,数値 13 と 17 の積を表示するプログラムを作成しなさい。ただし、変数を使用しないこと。
    System.out.println(13 * 17);

    // 6,次のプログラムを作成しなさい。
    // int 型の変数 x に数値 7 を代入する。
    // 変数 x の値を 3 倍にする。
    // 変数 x の値を表示する。
    // 変数 x の値を半分（1/2）にする。
    // 変数 x の値を表示する。
    x = 7;
    x *= 3;
    System.out.println(x);
    x /= 2;
    System.out.println(x);

    // 7,int 型の変数 x、y に任意の数値を代入し、x の値を y に、y の値を x に入れ替えて x と y の値を表示するプログラムを作成しなさい。
    int a,b,c;
    a = 3;
    b = 7;
    c = a;
    a = b;
    b = c;
    System.out.println("a=" + a + ",b=" + b);

    // 10,int 型の変数 x に任意の数値を代入し、x を 1 乗、2 乗、3 乗した結果を表示するプログラムを作成しなさい。
    x = 3;
    System.out.println(x);
    System.out.println(x * x);
    System.out.println(x * x * x);

    // 11,int 型の変数 x に任意の数値を代入し、x を x より小さい任意の数値で割った商と余りを表示するプログラムを作成しなさい。
    System.out.println((x / 2) + "・・・" + (x % 2));

    // 12,int 型の変数 x に任意の数値を代入し、インクリメント演算子、デクリメント演算子を適用して結果を表示することにより演算子の効果を確認するプログラムを作成しなさい。
    // インクリメント演算とは、変数の値に1を加算するもの
    x ++;
    System.out.println(x);
    x --;
    x --;
    System.out.println(x);

  }
}



// ラッパークラスとは、オブジェクト指向プログラミング言語で、他のクラスやプログラム中でオブジェクトとして扱いたい対象を、
// クラスとして定義したもの。 “wrapper” とは包装、包み紙という意味で、対象を包み込んで覆い隠すという意味合いがある。

// parse = 解析
