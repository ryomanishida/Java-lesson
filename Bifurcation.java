import java.io.*;
class Bifurcation {
  public static void main( String[] args) throws IOException {
    BufferedReader br = new BufferedReader(
                                new InputStreamReader( System.in ) );
    // int x = Integer.parseInt(br.readLine());
    // int y = Integer.parseInt(br.readLine());

    // 2,２つの整数値を入力し、大きい方（小さくない方）の数を表示するプログラムを作成しなさい。
    // if (x > y) {
    //   System.out.println(x);
    // }
    // else {
    //   System.out.println(y);
    // }
    

    // 4,int 型の変数 x、y にそれぞれ数値を入力し、x が ｙ より大きい場合には“xはyより大きい”、x が y より小さい場合には“xはyより小さい”、x と y が等しい場合には“xとyは等しい”と表示するプログラムを作成しなさい。
    // if ( x > y) {
    //   System.out.println("xはyより大きい");
    // } else if (x < y) {
    //   System.out.println("yはxより大きい");
    // } else {
    //   System.out.println("等しい");
    // }


    // 6,“正の偶数”、“正の奇数”、“負の偶数”、“負の奇数”
    // if ( x >= 0) {
    //   if ( x % 2 == 0) {
    //     System.out.println("正の偶数です");
    //   }else{
    //     System.out.println("正の奇数です");
    //   }
    // } else {
    //   if ( x % 2 == 0) {
    //     System.out.println("負の偶数です");
    //   }else{
    //     System.out.println("負の奇数です");
    //   }
    // }


    // 7,試験の点数を入力し、対応する成績を表示するプログラムを３種類作成しなさい。
    // ケース3
    //     80 点以上：“優”
    //     70 点以上、80 点未満：“良”
    //     60 点以上、70 点未満：“可”
    //     60 点未満：“不可”
    
    // if( x >= 80) {
    //   System.out.println("優");
    // }else if( x >=70 && x < 80) {
    //   System.out.println("良");
    // }else if ( x >= 60 && x < 70) {
    //   System.out.println("可");
    // }else{
    //   System.out.println("不可");
    // }
    

    // 8,中間試験と、期末試験の点数（それぞれ 0 ～ 100 点）を入力し、次の条件に従って合格、不合格を判定するプログラムを作成しなさい。

    // 両方とも 60 点以上の場合、合格
    // 合計が 130 点以上の場合、合格
    // 合計が 100 点以上で、どちらかの試験が 90 点以上であれば合格
    // 上記以外は不合格

    // if( x >= 60 && y >= 60 )
    //   System.out.println( "合格" );
    // else if( ( x + y ) >= 130 )
    //     System.out.println( "合格" );
    // else if(x + y >= 100 && x >= 90 || y >= 90)
    //     System.out.println( "合格" );
    // else
    //     System.out.println( "不合格" );
    // if文の処理が1行の場合{}を省略できるが可読性、保守性に欠けるので基本省略しない


    // 9,曜日と、午前、午後、夜間の区別を入力し、病院が開いているか、休診であるかを表示するプログラムを作成しなさい。
    // System.out.println("0=日曜、1=月曜、2=火曜、3=水曜、4=木曜、5=金曜、6=土曜");
    // int w = Integer.parseInt(br.readLine());
    // System.out.println("0=午前、1=午後、2=夜間");
    // int h = Integer.parseInt(br.readLine());

    // if(w == 0){
    //   System.out.println("休診"); //sun
    // }else if(w == 1){
    //   System.out.println("受診"); //mon
    // }else if(w == 2) {
    //   if(h == 0) {
    //     System.out.println("休診"); //tue
    //   }else {
    //     System.out.println("受診");
    //   }
    // }else if(w == 3){
    //   if(h == 2) {
    //     System.out.println("休診");
    //   }else{
    //     System.out.println("受診"); //wed
    //   }
    // }else if(w == 4) {
    //   System.out.println("受診"); //thu
    // }else if(w == 5) {
    //   if(h == 0) {
    //     System.out.println("休診"); //fri
    //   }else {
    //     System.out.println("受診");
    //   }
    // }else if(w == 6) {
    //   if(h == 0) {
    //     System.out.println("受診"); //sat
    //   }else {
    //     System.out.println("休診");
    //   }
    // }

    // 解答
    // System.out.println( "曜日を選択してください" );
    // System.out.print( "0=日曜、1=月曜、2=火曜、3=水曜、4=木曜、5=金曜、6=土曜" );
    // int day = Integer.parseInt( br.readLine() );

    // System.out.println( "時間帯を選択してください" );
    // System.out.print( "0=午前、1=午後、2=夜間" );
    // int zone = Integer.parseInt( br.readLine() );

    // boolean bopen = true;

    // if( day == 0 )
    //     bopen = false;
    // else if( zone == 0 && ( day == 2 || day == 5 ) )
    //     bopen = false;
    // else if( zone == 1 && day == 6 )
    //     bopen = false;
    // else if( zone == 2 && ( day == 3 || day == 6 ) )
    //     bopen = false;

    // if( bopen )
    //     System.out.println( "診療しています。" );
    // else
    //     System.out.println( "休診です。" );

    // 11,月を表す数値を入力し、その月の初めから年末までにある祝日を表示するプログラムを作成しなさい。*switchを使う
    // １月：元日、成人の日
    // ２月：建国記念の日
    // ３月：春分の日
    // ４月：昭和の日
    // ５月：憲法記念日、みどりの日、こどもの日
    // ７月：海の日
    // ９月：敬老の日、秋分の日
    // １０月：体育の日
    // １１月：文化の日、勤労感謝の日
    // １２月：天皇誕生日

    // System.out.println("入力した月の祝日がでます");
    // int month = Integer.parseInt(br.readLine());
    // switch(month) {
    //     case 1:
    //         System.out.println("元日" );
    //         System.out.println("成人の日");
    //         break;
    //     case 2:
    //         System.out.println("建国記念の日");
    //         break;
    //     case 3:
    //         System.out.println("春分の日");
    //         break;
    //     case 4:
    //         System.out.println("昭和の日");
    //         break;
    //     case 5:
    //         System.out.println("憲法記念日");
    //         System.out.println("みどりの日");
    //         System.out.println("こどもの日");
    //         break;
    //     case 6:
    //     case 7:
    //         System.out.println("海の日");
    //         break;
    //     case 8:
    //     case 9:
    //         System.out.println("敬老の日");
    //         System.out.println("秋分の日");
    //         break;
    //     case 10:
    //         System.out.println("体育の日");
    //         break;
    //     case 11:
    //         System.out.println("文化の日" );
    //         System.out.println("勤労感謝の日");
    //         break;
    //     case 12:
    //         System.out.println("天皇誕生日");
    //         break;
    // }


    // 12,好きな鮨（すし）を選択させ、それに対応したメッセージを表示する、鮨占いプログラムを作成しなさい。*switchを使う


    // 13,月を表す数値を入力し、その月の日数を表示するプログラムを作成しなさい。2 月は 28 日とします。
    // また、1 ～ 12 以外の数値が入力された場合に、“入力が間違っています”と表示しなさい。*switchを使う
  }
}
// System.out.println