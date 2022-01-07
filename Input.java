import java.io.*;

class Input {
    public static void main( String[] args ) throws IOException {
        BufferedReader br = new BufferedReader(
                                new InputStreamReader( System.in ) );

        // 2,int 型の変数 x に数値を入力し、x の値を表示するプログラムを作成しなさい。
        // String  s = br.readLine();
        // int x = Integer.parseInt(s);
        // System.out.println(x);

        // 3,int 型の変数 x に数値を入力し、x を 1 乗、2 乗、3 乗した結果を表示するプログラムを作成しなさい。
        int x = Integer.parseInt(br.readLine());
        System.out.println(x);
        System.out.println(x * x);

    }
}

// 例外が生じた時は throws されたところで例外処理をする
// System.out.println(x);