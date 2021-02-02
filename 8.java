class Person {
  String name;
  Person(){};
  Person(String n){
    name = n;
  };
  void greeting(){
    System.out.println("Greeting");
  }
}

class Japanese extends Person {
  Japanese(){super();}
  Japanese(String name){super(name);}
  void greeting(){
    System.out.print("Konnichiwa");
  }
}

class American extends Person {
  American(){super();}
  American(String name){super(name);}
  void greeting(){
    System.out.print("Hello");
  }
}

class Main 
{ 
    public static void main(String[] args) 
    { 
      Japanese j = new Japanese();
      American a = new American();
      j.greeting(); System.out.println();
      a.greeting();
    } 
} 