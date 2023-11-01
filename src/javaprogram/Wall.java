package javaprogram;

public class Wall {
    double width;
    double height;

    public Wall() {  //no arguement constructor
        this.height = 0;
        this.width = 0;
    }

    public Wall(double width, double height) {
        this.width = (width < 0) ? 0 : width;
        this.height = (height < 0) ? 0 : height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        this.width = (width < 0) ? 0 : width;
    }

    public void
    setHeight(double height) {
        this.height = (height < 0) ? 0 : height;

    }

    public double getArea() {
        return width * height;
    }

    public static void main(String[] args) {
        Wall wall = new Wall(5, 4);
        System.out.println("area= " + wall.getArea());
        wall.setHeight(-1.5);
        System.out.println("width= " + wall.getWidth());
        System.out.println("height= " + wall.getHeight());
        System.out.println("area= " + wall.getArea());
    }
}