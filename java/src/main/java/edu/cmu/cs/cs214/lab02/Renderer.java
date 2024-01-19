package edu.cmu.cs.cs214.lab02;

import edu.cmu.cs.cs214.lab02.shapes.*;

public class Renderer {
    private Shape anyShape;
    
    public Renderer(Shape newShape) {
        this.anyShape = newShape;
    }

    public void draw() {
        double area = anyShape.getArea();

        // assume implementation

        System.out.println("Shape printed\n" + "Its area is " + area);
    }
}
