class Circle5 {
    static final double PI = 3.1415;
    private double radius;
   
    Circle5(double rad) { 
        radius = rad; 
    }
    
    double getArea() {
    	return radius * radius * PI;
    }
    
    void showPerimeter() {
        double peri = (radius * 2) * PI;
        System.out.println("둘레: " + peri);
    }
    
    void showArea() {
        double area = (radius * radius) * PI;
        System.out.println("넓이: " + area);
    }
}
