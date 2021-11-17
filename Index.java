class Index {
  public static void main(String[] args) {

    String name = "ryoma";
    int age = 24;
    double height = 1.2;
    double weight = 55;
    double bmi = weight / height / height;

    System.out.println("名前は" + name + "です");
    System.out.println("年齢は" + age + "歳です");
    System.out.println("身長は" + height + "mです");
    System.out.println("体重は" + weight + "kgです");
    System.out.println("BMIは" + bmi + "です");

    switch (age % 5) {
    case 0:
      System.out.println(age + "周年です");
      break;
    case 3:
      System.out.println("再来年" + (age + 2));
      break;
    case 4:
      System.out.println("来年" + (age + 1));
      break;
    default:
      System.out.println("その他");
      break;
    }

    // while,stop
    int i = 1;
    while (i < 10) {
      if (i % 5 == 0) {
        break;
      }
      System.out.println(i);
      i++;
    }

    // for,skip
    for (int j = 1; j < 10; j++) {
      if (j % 3 == 0) {
        continue;
      }
      System.out.println(j);
    }

    int numbers[] = { 1, 4, 6, 9, 13, 16 };
    int oddSum = 0;
    int evenSum = 0;

    // 配列numbersの偶数の和と奇数の和
    for (int number : numbers) {
      if (number % 2 == 0) {
        evenSum = evenSum + number;
      } else {
        oddSum = oddSum + number;
      }
    }

    System.out.println("奇数の和は" + oddSum + "です");
    System.out.println("偶数の和は" + evenSum + "です");

  }
}
// 実行javac Index.java コンパイルを行う
// java Index