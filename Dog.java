class Dog{
    private String Name;
    private int Age;

    public void SetName( String nm ){
        Name = nm;
    }

    public void SetAge( int age ){
      Age = age;
    }

    public void ShowProfile(){
        System.out.println( "名前は、" + Name + "。歳は" + Age );
    }
}