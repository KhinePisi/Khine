class Person {
    String name;
    Person(){};
    Person(String n){
      name = n;
    };
    void greeting(){
      System.out.println("Greeting");
    }
    public static void main(String[] args) {    
      Person p = new Person();
      p.greeting();
    }
}
