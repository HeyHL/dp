package io.hel.base.principle.ocp;

/**
 * author: hel
 * date: 2020/12/27 19:47
 * description:
 */
public class OCP {
    public static void main(String[] args) {
        GraphicEditor graphicEditor = new GraphicEditor();
        graphicEditor.draw(new Rectangle());
        graphicEditor.draw(new Circle());
        graphicEditor.draw(new Triangle());
    }
}
class GraphicEditor {
    public void draw(Shape s) {
        if (s.type == 1)
            drawRectangle();
        else if (s.type == 2)
            drawCircle();
        else if (s.type == 3) {
            // 新增绘制三角形的处理分支
            drawTriangle();
        }
    }

    private void drawRectangle() {
        System.out.println("draw rectangle");
    }
    private void drawCircle() {
        System.out.println("draw circle");
    }
    // 新增绘制三角形的方法
    private void drawTriangle() {
        System.out.println("draw triangle");
    }
}
class Shape {
    int type;
}
class Rectangle extends Shape {
    public Rectangle() {
        super.type = 1;
    }
}
class Circle extends Shape {
    public Circle() {
        super.type = 2;
    }
}
// 新增三角形
class Triangle extends Shape {
    public Triangle() {
        super.type = 3;
    }
}