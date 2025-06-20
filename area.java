class Shape{
    public double getarea(){
        return 0;
    }
}
class triangle extends Shape{
    private double base;
    private double height;
    public triangle(double base,double height){
this.base = base;
this.height =height;
    }
    public double getarea(){
        return 0.5*base*height;
    }
}
class square extends Shape{
    private double side;
    public square (double side){
        this.side = side;
    }
        public double getarea(){
         return side * side;
        }
    }
class area{
    public static void main(String[] args) {
        Shape[] shape = new Shape[2];
        shape[0] = new square(5);
        shape[1] = new triangle(2,2) ;
    }
}


