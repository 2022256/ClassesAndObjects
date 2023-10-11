package Shapes;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 4istik
 */
public class Rectangle extends Shape{
    private boolean isFilled;
    protected String color;
    private double height;
    private double width;

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }
    
    @Override
    public double getArea() {
        return width*height;
    }
    
    @Override
    public void setColor(String color){
        this.color = color;
    }
}
