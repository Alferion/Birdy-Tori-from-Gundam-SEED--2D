/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphicsproj;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.geom.*;
/**
 *
 * @author Ross2909
 */
public class GraphicsProjTori extends Frame{
    private static Color beakcolor = new Color(179,152,103);
    private static Color head1color = new Color(251,245,153);
    private static Color head2color = new Color(73,196,48);
    private static Color eyecolor = new Color(221,61,72);
    private static Color collarcolor = new Color(169,188,202);
    private static Color mejblack = new Color(22,12,17);
    private static Color bg = new Color(54,120,36);
    private static Color feetcolor = new Color(181,198,207);
    
    public void paint (Graphics g){
        Graphics2D gr2d = (Graphics2D) g;
        BasicStroke bstrk = new BasicStroke(1.5f);//thickness
        BasicStroke bstrk2 = new BasicStroke(1.0f);
        gr2d.setColor(Color.black);
        
        GeneralPath bk = new GeneralPath(GeneralPath.WIND_NON_ZERO);//beak
        GeneralPath hd1 = new GeneralPath(GeneralPath.WIND_NON_ZERO);//head 1
        GeneralPath hd2 = new GeneralPath(GeneralPath.WIND_NON_ZERO);//head 2
        GeneralPath hd3 = new GeneralPath(GeneralPath.WIND_NON_ZERO);//head 3
        //GeneralPath eye = new GeneralPath(GeneralPath.WIND_NON_ZERO);//eye
        GeneralPath cl = new GeneralPath(GeneralPath.WIND_NON_ZERO);//collar
        GeneralPath ch = new GeneralPath(GeneralPath.WIND_NON_ZERO);//chest
        GeneralPath mb = new GeneralPath(GeneralPath.WIND_NON_ZERO);//Main Body
        GeneralPath mb2 = new GeneralPath(GeneralPath.WIND_NON_ZERO);//Main Body 2
        GeneralPath wn = new GeneralPath(GeneralPath.WIND_NON_ZERO);//Wings 1
        GeneralPath wn2 = new GeneralPath(GeneralPath.WIND_NON_ZERO);//Wings 2
        GeneralPath wn3 = new GeneralPath(GeneralPath.WIND_NON_ZERO);//Wings 3
        GeneralPath ft = new GeneralPath(GeneralPath.WIND_NON_ZERO);//Feet
        GeneralPath ft2 = new GeneralPath(GeneralPath.WIND_NON_ZERO);//Feet 2
        GeneralPath tl = new GeneralPath(GeneralPath.WIND_NON_ZERO);//Tail
        GeneralPath tl2 = new GeneralPath(GeneralPath.WIND_NON_ZERO);//Tail 2 
        
        gr2d.setStroke(bstrk2);
        gr2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        
        bk.moveTo(50,148);
        bk.lineTo(68,139);
        bk.quadTo(72,140,71,145);
        bk.lineTo(50,148);
        bk.closePath();
        gr2d.setColor(beakcolor);
        gr2d.fill(bk);
        gr2d.setColor(mejblack);
        gr2d.draw(bk);
        
        hd1.moveTo(72,128);
        hd1.lineTo(73,121);
        hd1.quadTo(92,103,117,86);
        hd1.lineTo(109,96);
        hd1.lineTo(93,110);
        hd1.lineTo(87,116);
        hd1.quadTo(83,118,79,120);
        hd1.quadTo(75,124,72,128);
        hd1.closePath();
        gr2d.setColor(head1color);
        gr2d.fill(hd1);
        gr2d.setColor(mejblack);
        gr2d.draw(hd1);
        
        hd2.moveTo(68,133);
        hd2.lineTo(75,133);
        hd2.quadTo(84,128,99,126);
        hd2.quadTo(103,122,109,121);
        hd2.quadTo(84,105,68,133);
        hd2.closePath();
        gr2d.setColor(head2color);
        gr2d.fill(hd2);
        gr2d.setColor(mejblack);
        gr2d.draw(hd2);
        
        hd3.moveTo(68,133);
        hd3.lineTo(75,133);
        hd3.quadTo(84,128,99,126);
        hd3.quadTo(103,122,109,121);
        hd3.quadTo(106,138,93,149);
        hd3.lineTo(78,149);
        hd3.quadTo(74,148,71,145);
        hd3.quadTo(72,140,68,139);
        hd3.quadTo(68,136,68,133);
        hd3.closePath();
        gr2d.setColor(head1color);
        gr2d.fill(hd3);
        gr2d.setColor(mejblack);
        gr2d.draw(hd3);
        
        Ellipse2D.Double eyes = new Ellipse2D.Double(80,131,7,7);
        gr2d.setPaint(eyecolor);
        gr2d.fill(eyes);
        gr2d.setColor(mejblack);
        gr2d.draw(eyes);
        
        Ellipse2D.Double iris = new Ellipse2D.Double(81,132,4,4);
        gr2d.setPaint(Color.BLACK);
        gr2d.fill(iris);
        
        Line2D.Double eyeline = new Line2D.Double(96,130,87,133);
        gr2d.setPaint(Color.BLACK);
        gr2d.setStroke(bstrk2);
        gr2d.draw(eyeline);
        
        
        
        cl.moveTo(93,149);
        cl.lineTo(100,151);
        cl.quadTo(105,148,113,136);
        cl.quadTo(117,131,122,129);
        cl.quadTo(112,119,109,121);
        cl.quadTo(109,134,93,149);
        cl.closePath();
        gr2d.setColor(collarcolor);
        gr2d.fill(cl);
        gr2d.setColor(mejblack);
        gr2d.draw(cl);
        
        Line2D.Double clline = new Line2D.Double(113,136,106,131);
        gr2d.setPaint(Color.BLACK);
        gr2d.setStroke(bstrk2);
        gr2d.draw(clline);
        
        mb2.moveTo(93,149);
        mb2.lineTo(90,149);
        mb2.quadTo(117,194,150,214);
        mb2.lineTo(151,214);
        mb2.lineTo(156,217);
        mb2.lineTo(161,214);
        mb2.lineTo(167,220);
        mb2.lineTo(175,215);
        mb2.closePath();
        gr2d.setColor(head2color);
        gr2d.fill(mb2);
        gr2d.setColor(mejblack);
        gr2d.draw(mb2);
        
        mb2.moveTo(175,215);
        mb2.quadTo(167,218,163,214);
        mb2.quadTo(155,208,153,201);
        mb2.quadTo(158,204,162,206);
        mb2.lineTo(175,215);
        mb2.closePath();
        gr2d.setColor(head2color);
        gr2d.fill(mb2);
        gr2d.setColor(mejblack);
        gr2d.draw(mb2);
        
        mb2.moveTo(163,214);
        mb2.quadTo(154,214,149,211);
        mb2.quadTo(144,205,145,199);
        mb2.quadTo(147,204,153,204);
        mb2.lineTo(163,214);
        mb2.closePath();
        gr2d.setColor(head2color);
        gr2d.fill(mb2);
        gr2d.setColor(mejblack);
        gr2d.draw(mb2);
        
        mb2.moveTo(149,211);
        mb2.lineTo(150,214);
        mb2.quadTo(140,209,134,204);
        mb2.quadTo(141,207,146,208);
        mb2.quadTo(148,210,149,211);
        mb2.closePath();
        gr2d.setColor(head2color);
        gr2d.fill(mb2);
        gr2d.setColor(mejblack);
        gr2d.draw(mb2);
        
        mb2.moveTo(144,204);
        mb2.quadTo(124,199,122,189);
        mb2.quadTo(126,194,137,195);
        mb2.quadTo(137,197,147,202);
        mb2.quadTo(143,201,144,204);
        mb2.closePath();
        gr2d.setColor(head2color);
        gr2d.fill(mb2);
        gr2d.setColor(mejblack);
        gr2d.draw(mb2);
        
        mb2.moveTo(134,195);
        mb2.quadTo(125,194,120,189);
        mb2.quadTo(115,180,110,168);
        mb2.quadTo(118,185,136,195);
        mb2.closePath();
        gr2d.setColor(head2color);
        gr2d.fill(mb2);
        gr2d.setColor(mejblack);
        gr2d.draw(mb2);
        
        mb.moveTo(122,128);
        mb.quadTo(117,131,113,136);
        mb.quadTo(114,188,93,149);
        mb.quadTo(112,182,153,204);
        mb.lineTo(151,201);
        mb.lineTo(159,204);
        mb.quadTo(135,181,127,153);
        mb.quadTo(121,145,124,137);
        mb.lineTo(124,134);
        mb.quadTo(123,130,126,129);
        mb.lineTo(122,128);
        //mb.lineTo(90,149);
        mb.closePath();
        gr2d.setColor(head2color);
        gr2d.fill(mb);
        gr2d.setColor(mejblack);
        gr2d.draw(mb);
        
        ch.moveTo(93,149);
        ch.quadTo(98,151,112,139);
        ch.quadTo(114,188,93,149);
        ch.closePath();
        gr2d.setColor(head1color);
        gr2d.fill(ch);
        gr2d.setColor(mejblack);
        gr2d.draw(ch);
        
        wn2.moveTo(126,153);
        wn2.quadTo(119,145,125,138);
        wn2.closePath();
        gr2d.setColor(head2color);
        gr2d.fill(wn2);
        gr2d.setColor(mejblack);
        gr2d.draw(wn2);
        
        wn2.moveTo(125,134);
        wn2.quadTo(120,130,126,129);
        wn2.closePath();
        gr2d.setColor(head2color);
        gr2d.fill(wn2);
        gr2d.setColor(mejblack);
        gr2d.draw(wn2);
        
        
        
        wn.moveTo(194,227);
        wn.quadTo(174,206,165,190);
        wn.quadTo(159,169,155,155);
        wn.quadTo(144,136,126,129);
        wn.quadTo(116,180,194,227);
        wn.closePath();
        gr2d.setColor(head2color);
        gr2d.fill(wn);
        gr2d.setColor(mejblack);
        gr2d.draw(wn);
        
        wn2.moveTo(126,131);
        wn2.quadTo(135,140,128,129);
        wn2.closePath();
        gr2d.setColor(head2color);
        gr2d.fill(wn2);
        gr2d.setColor(mejblack);
        gr2d.draw(wn2);
        
        tl.moveTo(260,152);
        tl.lineTo(270,152);
        tl.quadTo(273,158,273,160);
        tl.lineTo(198,201);
        tl.lineTo(187,208);
        tl.quadTo(188,204,183,200);
        tl.lineTo(253,155);
        tl.quadTo(258,152,260,152);
        tl.closePath();
        gr2d.setColor(head2color);
        gr2d.fill(tl);
        gr2d.setColor(mejblack);
        gr2d.draw(tl);
        
        tl2.moveTo(234,168);
        tl2.quadTo(239,168,243,170);
        tl2.lineTo(248,173);
        tl2.lineTo(272,160);
        tl2.quadTo(273,158,270,152);
        tl2.lineTo(260,152);
        tl2.quadTo(258,152,253,155);
        tl2.lineTo(253,155);
        tl2.closePath();
        gr2d.setColor(head1color);
        gr2d.fill(tl2);
        gr2d.setColor(mejblack);
        gr2d.draw(tl2);
        
        Line2D.Double tline = new Line2D.Double(270,153,183,203);
        gr2d.setPaint(Color.BLACK);
        gr2d.setStroke(bstrk2);
        gr2d.draw(tline);
        
        Line2D.Double tline2 = new Line2D.Double(271,155,187,204);
        gr2d.setPaint(Color.BLACK);
        gr2d.setStroke(bstrk2);
        gr2d.draw(tline2);
        
        Line2D.Double tline3 = new Line2D.Double(272,157,188,205);
        gr2d.setPaint(Color.BLACK);
        gr2d.setStroke(bstrk2);
        gr2d.draw(tline3);
        
        Line2D.Double tline4 = new Line2D.Double(273,160,188,205);
        gr2d.setPaint(Color.BLACK);
        gr2d.setStroke(bstrk2);
        gr2d.draw(tline4);
        
        
        wn3.moveTo(194,227);
        wn3.quadTo(185,187,147,143);
        wn3.quadTo(158,168,163,187);
        wn3.quadTo(175,208,194,227);
        wn3.closePath();
        gr2d.setColor(head1color);
        gr2d.fill(wn3);
        gr2d.setColor(mejblack);
        gr2d.draw(wn3);
        
        ft.moveTo(149,214);
        ft.lineTo(117,240);
        ft.quadTo(97,242,89,244);
        ft.quadTo(91,250,96,253);
        ft.lineTo(100,249);
        ft.quadTo(119,245,128,245);
        ft.lineTo(134,242);
        ft.lineTo(121,242);
        ft.lineTo(153,216);
        ft.lineTo(149,214);
        ft.closePath();
        gr2d.setColor(feetcolor);
        gr2d.fill(ft);
        gr2d.setColor(mejblack);
        gr2d.draw(ft);
        
        ft.moveTo(117,240);
        ft.quadTo(117,243,121,242);
        ft.closePath();
        gr2d.setColor(feetcolor);
        gr2d.fill(ft);
        gr2d.setColor(mejblack);
        gr2d.draw(ft);
        
        QuadCurve2D.Double ftc1 = new QuadCurve2D.Double(111,244,100,244,91,248);
        gr2d.setPaint(Color.BLACK);
        gr2d.setStroke(bstrk2);
        gr2d.draw(ftc1);
        
        QuadCurve2D.Double ftc2 = new QuadCurve2D.Double(111,245,100,246,92,250);
        gr2d.setPaint(Color.BLACK);
        gr2d.setStroke(bstrk2);
        gr2d.draw(ftc2);
        
        ft2.moveTo(162,216);
        ft2.lineTo(129,247);
        ft2.quadTo(117,250,99,257);
        ft2.quadTo(103,262,115,265);
        ft2.quadTo(123,257,132,254);
        ft2.lineTo(134,252);
        ft2.quadTo(140,252,147,254);
        ft2.lineTo(150,250);
        ft2.lineTo(135,249);
        ft2.lineTo(164,219);
        ft2.lineTo(162,216);
        ft2.closePath();
        gr2d.setColor(feetcolor);
        gr2d.fill(ft2);
        gr2d.setColor(mejblack);
        gr2d.draw(ft2);
        
        ft2.moveTo(129,247);
        ft2.quadTo(127,250,135,249);
        ft2.closePath();
        gr2d.setColor(feetcolor);
        gr2d.fill(ft2);
        gr2d.setColor(mejblack);
        gr2d.draw(ft2);
        
        QuadCurve2D.Double ftc3 = new QuadCurve2D.Double(123,251,111,254,103,260);
        gr2d.setPaint(Color.BLACK);
        gr2d.setStroke(bstrk);
        gr2d.draw(ftc3);
        
        QuadCurve2D.Double ftc4 = new QuadCurve2D.Double(126,252,117,256,109,262);
        gr2d.setPaint(Color.BLACK);
        gr2d.setStroke(bstrk);
        gr2d.draw(ftc4);
        
        
    }
    
    public static void main (String[] args){
        GraphicsProjTori grpt = new GraphicsProjTori();
        grpt.setTitle("Birdy");
        grpt.setBackground(bg);
        grpt.setSize(400,400);
        //grp.setForeground(Color.cyan);
        grpt.setVisible(true);
        grpt.addWindowListener(new WindowAdapter() {
        public void windowClosing(WindowEvent we) {
            System.exit(0);
         }
        });
    }
}

