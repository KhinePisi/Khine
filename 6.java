class Circle {
  protected double r; // radius
  Circle() { this.r = 0.0; }
  Circle(double r) { this.r = r; }
  double getArea() {
    return this.r*this.r*3.14;
  }
  double getCircumference() {
    return 2.0*this.r*3.14;
  }
}

class Fan extends Circle {
    double theta;
    Fan(){
      super();
      theta = 0.0;
    }
    Fan(double r, double t){
      super(r);
      theta = t;
    }
    public static void main(String[] args) {    
      Fan f = new Fan(3.0, 3.0);
      System.out.println(Double.toString(f.getArea()));
    }
}
