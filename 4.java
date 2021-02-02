class Paint3D {
    double x, y, z;
    Paint3D(){
      x = 0.0;
      y = 0.0;
      z = 0.0;
    }
    Paint3D(double a, double b, double c){
      x = a;
      y = b;
      z = c;
    }

    void SetXYZ(double a, double b, double c){
      x = a;
      y = b;
      z = c;
    }
    // double GetXYZ(){}
    double GetDistance(){
      return Math.sqrt(x*x+y*y+z*z);
    }
    public static void main(String[] args) {    
      Paint3D obj = new Paint3D();
      obj.SetXYZ(1, 1, 1);
      System.out.println(Double.toString(obj.x) + Double.toString(obj.y) + Double.toString(obj.z));
    }
}
