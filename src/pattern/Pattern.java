/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pattern;

/**
 *
 * @author HOODAA
 */
public class Pattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         ShapeFactory shapeFactory = new ShapeFactory();
       
        Shape shape1 = shapeFactory.getShape("CIRCLE");
       
        shape1.draw();
        
        Shape shape2 = shapeFactory.getShape("RECTANGLE");

        shape2.draw();

        Shape shape3 = shapeFactory.getShape("circle");
        shape3.draw();

    }
    
}
