/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.*;
import java.awt.geom.*;
import java.awt.event.WindowEvent;  
import java.awt.event.WindowAdapter; 
/**
 *
 * @author PERALTA_ROSS_208
 */
public class Activity6_208 extends Frame{
    public void paint (Graphics g){
        Graphics2D gr2d = (Graphics2D) g;
        BasicStroke bstrk = new BasicStroke(10.0f);//thickness
        gr2d.setStroke (bstrk);
        gr2d.setFont(new Font ("Comic Sans", Font.ITALIC, 20));
        gr2d.setColor(Color.WHITE);
        //Start of Image 1 (T)
        GeneralPath gp2 = new GeneralPath();
        gp2.moveTo(100,250);
        gp2.lineTo(150,250);
        gp2.lineTo(150,200);
        gp2.lineTo(200,200);
        gp2.lineTo(200,500);
        gp2.lineTo(400,500);
        gp2.lineTo(400,200);
        gp2.lineTo(450,200);
        gp2.lineTo(450,250);
        gp2.lineTo(500,250);
        gp2.lineTo(500,150);
        gp2.lineTo(450,100);
        gp2.lineTo(150,100);
        gp2.lineTo(100,150);
        gp2.closePath();
        gr2d.fill(gp2);
        //END OF IMAGE 1
        //Start of Image 2 (Boat)
        GeneralPath gp3 = new GeneralPath();
        gp3.moveTo(100,350);
        gp3.lineTo(150,450);
        gp3.lineTo(450,450);
        gp3.lineTo(500,350);
        gp3.lineTo(305,350);
        gp3.lineTo(100,350);
        gp3.lineTo(295,350);
        gp3.lineTo(295,150);
        gp3.lineTo(305,150);
        gp3.lineTo(305,200);
        gp3.lineTo(405,200);
        gp3.lineTo(305,150);
        gp3.lineTo(305,200);
        gp3.lineTo(305,350);
        gp3.closePath();
        gr2d.fill(gp3);
        //END OF IMAGE 2
        //Start of Image 3 (Cross)
        GeneralPath gp = new GeneralPath();
        gp.moveTo(250, 280);
        gp.lineTo(250,180);
        gp.quadTo(250,140,290,140);
        gp.lineTo(310,140);
        gp.quadTo(350,140,350,180);
        gp.lineTo(350,280);
        //
        gp.lineTo(450,280);
        gp.quadTo(490,280,490,320);
        gp.lineTo(490,340);
        gp.quadTo(490,380,450,380);
        gp.lineTo(350,380);
        //
        gp.lineTo(350,480);
        gp.quadTo(350,520,310,520);
        gp.lineTo(290,520);
        gp.quadTo(250,520,250,480);
        gp.lineTo(250,380);
        //
        gp.lineTo(150,380);
        gp.quadTo(110,380,110,340);
        gp.lineTo(110,320);
        gp.quadTo(110,280,150,280);
        gp.lineTo(250,280);
        //
        gp.closePath();
        gr2d.fill(gp);
        //END OF IMAGE 3
        
        
        Area a = new Area(gp2);//T
        Area b = new Area(gp3);//boat
        Area c = new Area(gp);//cross
        
        /*//Number 1(T union Cross)
        a.add(c);
        gr2d.setPaint(Color.PINK);
        gr2d.fill(a);
        
        //Number 2(Boat union Cross)
        b.add(c);
        gr2d.setPaint(Color.YELLOW);
        gr2d.fill(b);
        
        //Number 3(T intersect Cross)
        a.intersect(c);
        gr2d.setPaint(Color.GREEN);
        gr2d.fill(a);
        
        //Number 4(Area of Boat without Cross)
        b.subtract(c);
        gr2d.setPaint(Color.BLUE);
        gr2d.fill(b);
        
        //Number 5(Area of Cross without T)
        c.subtract(a);
        gr2d.setPaint(Color.RED);
        gr2d.fill(c);
        
        //Number 6(Symm. Diff. of Boat and T)
        b.exclusiveOr(a);
        gr2d.setPaint(Color.ORANGE);
        gr2d.fill(b);
        */
        //Number 7(Symm. Diff. of (Boat without Cross) and T)
        b.subtract(c);
        b.exclusiveOr(a);
        gr2d.setPaint(Color.BLACK);
        gr2d.fill(b);
        
    }
    public static void main (String[] args){
        Activity6_208 ac6 = new Activity6_208();
        ac6.setTitle("Activity 6");
        ac6.setBackground(Color.WHITE);
        ac6.setSize(700,700);
        ac6.setForeground(Color.cyan);
        ac6.setVisible(true);
        ac6.addWindowListener(new WindowAdapter() {
        public void windowClosing(WindowEvent we) {
            System.exit(0);
         }
        });
    
     }
    
}
