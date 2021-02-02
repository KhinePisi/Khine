class Rectangle {
    double width;
    double height;

    Rectangle(){
      width = 0.0;
      height = 0.0;
    }
    Rectangle(double w, double h){
      width = w;
      height = h;
    }
    void Set_width(){
      width = 0.0;
    }
    void Set_height(){
      height = 0.0;
    }
    void Get_height(){
      System.out.println(height);
    }
    void Get_width(){
      System.out.println(width);
    }
    void Get_area(){
      System.out.println(width * height);
    }
}
