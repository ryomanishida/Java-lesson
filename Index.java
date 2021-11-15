class Index {
  public static void main(String[] args) {

    String name = "ryoma";
    int age = 24;
    double height = 1.2;
    double weight = 55;
    double bmi = weight / height / height;


    System.out.println("名前は" + name + "です");
    System.out.println("年齢は" + age + "歳です");
    System.out.println("身長は" + height + "mです" );
    System.out.println("体重は" + weight + "kgです");
    System.out.println("BMIは" + bmi + "です");





    switch (age % 5){
      case 0:
        System.out.println(age + "周年です");
        break;
      case 3:
        System.out.println("再来年" + (age + 2));
        break;
      case 4:
        System.out.println("来年" + (age + 1));
        break;
    }
  }
}