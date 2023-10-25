public abstract class Shape {
    String name;
    public abstract double getArea();
    public abstract double getPerimeter();

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
}