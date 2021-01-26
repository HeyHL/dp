package io.hel.base.principle.ocp.improved;

/**
 * author: hel
 * date: 2020/12/27 19:54
 * description: 开闭原则
 */
public class OCP {
    public static void main(String[] args) {
        GraphicEditor graphicEditor = new GraphicEditor();
        graphicEditor.draw(new Rectangle());
        graphicEditor.draw(new Circle());
        graphicEditor.draw(new Triangle());
    }
}
// 对修改关闭，使用者
class GraphicEditor {
    public void draw(Shape shape) {
        shape.draw();
    }
}
abstract class Shape {
    public abstract void draw();
}
class Rectangle extends Shape {
    @Override
    public void draw() {
        System.out.println("draw rectangle");
    }
}
class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("draw circle");
    }
}
// 对扩展开放，提供者
class Triangle extends Shape {
    @Override
    public void draw() {
        System.out.println("draw triangle");
    }
}