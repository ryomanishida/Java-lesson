import java.io.*;

class Input {
    public static void main( String[] args ) throws IOException {
        // BufferedReader br = new BufferedReader(
        //                         new InputStreamReader( System.in ) );

        // 2,int 型の変数 x に数値を入力し、x の値を表示するプログラムを作成しなさい。
        // String  s = br.readLine();
        // int x = Integer.parseInt(s);
        // System.out.println(x);

        // 3,int 型の変数 x に数値を入力し、x を 1 乗、2 乗、3 乗した結果を表示するプログラムを作成しなさい。
        // int x = Integer.parseInt(br.readLine());
        // System.out.println(x);
        // System.out.println(x * x);

        // 4,int 型の変数 x、y にそれぞれ数値を入力し、x と y の和、差（x－y）、積、商と余り(x÷y)、を表示するプログラムを作成しなさい。
        // int x = Integer.parseInt(br.readLine());
        // int y = Integer.parseInt(br.readLine());
        // System.out.println(x - y);
        // System.out.println(x / y);
        // System.out.println((x + y) / 2);


        // 6,年齢を訊ね、生まれてから現在までの、おおよその日数を表示するプログラムを作成しなさい。
        // ※ 	日数の計算は閏年等を考慮せず、年齢×365とする。
        // System.out.println("何歳ですか？");
        // int a = Integer.parseInt(br.readLine());
        // System.out.println(a * 365);

    }
}

// 例外が生じた時は throws されたところで例外処理をする

// *BufferedReaderとScannerの違い*
// BufferedReaderは文字列しか受け取れないが、Scannerは数値も直接受け取れる
// BufferedReaderはチェック例外の対処が必要（IOException）だが、Scannerは不要
// BufferedReaderの方がScannerよりパフォーマンスが優れている
    // ＞＞＞Bufferの方が速くてメモリを食わない