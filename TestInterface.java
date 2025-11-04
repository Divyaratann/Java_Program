#java Program to create one interface that can be implementing than more one classes

interface Area {
    final static float pi=3.14f;
    float compute();
}
class Rectangle implements Area{
    float l,b;
    Rectangle(float x,float y){
        l=x;
        b=y;
    }
    public float compute(){
        return(l*b);

    }
}
class circle implements Area{
    float r ;
    public circle(float r){
        this.r=r;
    }
    public float compute(){
        return (pi * r * r);
    }
}
class TestInterface{
    public static void main(String args[]) {
        Rectangle R =new Rectangle(4.0f,5.0f);
        circle C=new circle(4.7f);
        float Rarea=R.compute();
        float Carea=C.compute();
        System.out.println("Area Of Rectangle="+Rarea);
        System.out.println("Area of Circle="+Carea);
    }

}
