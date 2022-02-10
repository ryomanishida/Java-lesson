// public class Exercise{
//   public static void main( String[] args ){
//       Dog DogA = new Dog();
//       DogA.SetName( "きなこ" );
//       DogA.SetAge(15);
//       DogA.SetType("ハスキー");

//       Dog DogB = new Dog();
//       DogB.SetName( "ゼット" );
//       DogB.SetAge(654);

//       DogB.ShowProfile();
//       DogA.ShowProfile();
//   }
// }

import java.io.*;
public class Exercise{
    public static void main( String[] args ) throws IOException{
        BufferedReader br = new BufferedReader(
                                new InputStreamReader( System.in ) );
        CoinCase MyCase = new CoinCase();

        for( int i = 0 ; i < 5 ; i++ ){
            System.out.print( "硬貨の種類は?" );
            int kind = Integer.parseInt( br.readLine() );
            System.out.print( "硬貨の枚数は?" );
            int count = Integer.parseInt( br.readLine() );

            MyCase.AddCoins( kind, count );
        }

        System.out.println( "500円は" + MyCase.GetCount( 500 ) + "枚" );
        System.out.println( "100円は" + MyCase.GetCount( 100 ) + "枚" );
        System.out.println( "50円は" + MyCase.GetCount( 50 ) + "枚" );
        System.out.println( "10円は" + MyCase.GetCount( 10 ) + "枚" );
        System.out.println( "5円は" + MyCase.GetCount( 5 ) + "枚" );
        System.out.println( "1円は" + MyCase.GetCount( 1 ) + "枚" );
        System.out.println( "総額は" + MyCase.GetAmount() + "円" );
    }
}
