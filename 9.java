class Person_2 {
  String name;
  Person_2(){};
  Person_2(String n){
    name = n;
  };
  void greeting(){
    System.out.println("Greeting");
  }
}

class Japanese_2 extends Person {
  Japanese_2(){super();}
  Japanese_2(String name){super(name);}
  void doGreeting(){
    System.out.print(name + " says Konnichiwa");
  }
}

class American_2 extends Person {
  American_2(){super();}
  American_2(String name){super(name);}
  void doGreeting(){
    System.out.print(name + " says Hello");
  }
}

class Main_2
{ 
    public static void main(String[] args) 
    { 
      Japanese_2 j = new Japanese_2("Hideaki");
      American_2 a = new American_2("Emma");
      j.doGreeting(); System.out.println();
      a.doGreeting();
    } 
} 