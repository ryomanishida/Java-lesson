class Dog{
    private String Name;
    private int Age;
    private String Type;

    public void SetName( String nm ){
        Name = nm;
    }

    public void SetAge( int age ){
      Age = age;
    }

    public void SetType( String tp ){
        Type = tp;
    }

    public void ShowProfile(){
        System.out.println( "名前：" + Name + "歳：" + Age + "犬種" + Type );
    }
}