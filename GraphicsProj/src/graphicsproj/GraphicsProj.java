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
public class GraphicsProj extends Frame{
    private static Color a_Gray = new Color(106,119,127);
    private static Color a_Gray2 = new Color(115,115,114);
    private static Color a_Gray3 = new Color(117,122,120);
    private static Color a_Gray4 = new Color(76,77,79);
    private static Color a_Gray5 = new Color(38,42,45);
    
    public void paint (Graphics g){
        Graphics2D gr2d = (Graphics2D) g;
        BasicStroke bstrk = new BasicStroke(5.0f);//thickness
        BasicStroke bstrk2 = new BasicStroke(1.0f);
        gr2d.setColor(Color.black);
        gr2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        
        GeneralPath mb1 = new GeneralPath(GeneralPath.WIND_NON_ZERO);//main body
        GeneralPath ck1 = new GeneralPath(GeneralPath.WIND_NON_ZERO);//cockpit
        GeneralPath wn1 = new GeneralPath(GeneralPath.WIND_NON_ZERO);//wings 1
        GeneralPath wn2 = new GeneralPath(GeneralPath.WIND_NON_ZERO);//wings 2
        GeneralPath ms1 = new GeneralPath(GeneralPath.WIND_NON_ZERO);//Missile 1
        GeneralPath ms2 = new GeneralPath(GeneralPath.WIND_NON_ZERO);//Missile 2
        GeneralPath ms3 = new GeneralPath(GeneralPath.WIND_NON_ZERO);//Missile 3
        GeneralPath sp1 = new GeneralPath(GeneralPath.WIND_NON_ZERO);//Special 1
        GeneralPath sp2 = new GeneralPath(GeneralPath.WIND_NON_ZERO);//Special 2
        
        mb1.moveTo(182,379);
        mb1.lineTo(231,372);
        mb1.lineTo(270,355);
        mb1.quadTo(275,350,371,334);
        mb1.lineTo(392,326);
        mb1.lineTo(425,309);
        mb1.quadTo(475,280,518,304);
        mb1.lineTo(598,319);
        mb1.lineTo(659,329);
        mb1.lineTo(846,348);
        mb1.lineTo(897,333);
        mb1.lineTo(1042,211);
        mb1.lineTo(1076,224);
        mb1.lineTo(1071,266);
        mb1.lineTo(1072,268);
        mb1.lineTo(1075,271);
        mb1.lineTo(1071,340);
        mb1.lineTo(1062,343);
        mb1.lineTo(1070,376);
        mb1.lineTo(1182,389);
        mb1.lineTo(1069,388);
        mb1.lineTo(1092,397);
        mb1.lineTo(1066,397);
        mb1.lineTo(1065,413);
        mb1.quadTo(1063,416,1062,419);
        mb1.lineTo(1010,425);
        mb1.quadTo(1008,423,994,425);
        mb1.quadTo(987,422,986,422);
        mb1.quadTo(980,422,979,425);
        mb1.lineTo(619,433);
        mb1.quadTo(609,433,538,386);
        mb1.lineTo(447,391);
        mb1.lineTo(316,392);
        mb1.lineTo(279,392);
        mb1.lineTo(231,381);
        mb1.lineTo(182,379);
        mb1.closePath();
        gr2d.setColor(a_Gray5);
        gr2d.fill(mb1);
        
        ck1.moveTo(392,326);
        ck1.quadTo(428,323,430,321);
        ck1.lineTo(429,306);
        ck1.lineTo(392,326);
        ck1.closePath();
        gr2d.setColor(Color.GRAY);
        gr2d.fill(ck1);
        
        ck1.moveTo(437,319);
        ck1.quadTo(467,314,517,316);
        ck1.lineTo(518,304);
        ck1.quadTo(464,281,434,305);
        ck1.lineTo(437,319);
        ck1.closePath();
        gr2d.setColor(Color.GRAY);
        gr2d.fill(ck1);
        
        wn1.moveTo(659,365);
        wn1.quadTo(781,360,903,365);
        wn1.lineTo(911,369);
        wn1.lineTo(941,369);
        wn1.lineTo(976,378);
        wn1.lineTo(659,365);
        wn1.closePath();
        gr2d.setColor(a_Gray4);
        gr2d.fill(wn1);
        
        wn2.moveTo(989,381);
        wn2.lineTo(1052,376);
        wn2.lineTo(1183,389);
        wn2.quadTo(1043,389,989,381);
        wn2.closePath();
        gr2d.setColor(Color.GRAY);
        gr2d.fill(wn2);
        
        sp1.moveTo(986,422);
        sp1.lineTo(989,381);
        sp1.lineTo(1003,383);
        sp1.lineTo(1069,388);
        sp1.lineTo(1065,413);
        sp1.quadTo(1063,416,1062,419);
        sp1.lineTo(1010,425);
        sp1.quadTo(1008,423,994,425);
        sp1.quadTo(987,422,986,422);
        sp1.quadTo(980,422,979,425);
        sp1.closePath();
        gr2d.setColor(Color.BLACK);
        gr2d.fill(sp1);
        
        sp2.moveTo(823,351);
        sp2.lineTo(664,350);
        sp2.lineTo(544,345);
        sp2.quadTo(476,355,408,373);
        sp2.lineTo(658,366);
        sp2.quadTo(678,376,836,364);
        sp2.lineTo(823,351);
        sp2.closePath();
        gr2d.setColor(a_Gray4);
        gr2d.fill(sp2);
        
        ms3.moveTo(609,399);
        ms3.lineTo(624,393);
        ms3.lineTo(643,393);
        ms3.lineTo(644,392);
        ms3.lineTo(660,393);
        ms3.lineTo(664,394);
        ms3.lineTo(848,401);
        ms3.lineTo(848,420);
        ms3.lineTo(822,421);
        ms3.lineTo(788,410);
        ms3.lineTo(663,408);
        ms3.lineTo(661,410);
        ms3.lineTo(643,410);
        ms3.lineTo(641,407);
        ms3.lineTo(622,407);
        ms3.lineTo(608,400);
        ms3.closePath();
        gr2d.setColor(a_Gray3);
        gr2d.fill(ms3);
        
        ms1.moveTo(743,386);
        ms1.quadTo(748,377,754,379);
        ms1.lineTo(767,378);
        ms1.quadTo(770,371,773,368);
        ms1.lineTo(800,369);
        ms1.quadTo(802,376,804,379);
        ms1.lineTo(824,380);
        ms1.lineTo(827,374);
        ms1.lineTo(844,375);
        ms1.lineTo(846,380);
        ms1.lineTo(884,380);
        ms1.quadTo(886,383,888,382);
        ms1.lineTo(899,383);
        ms1.quadTo(905,389,901,390);
        ms1.lineTo(877,392);
        ms1.quadTo(876,393,875,394);
        ms1.lineTo(761,391);
        ms1.lineTo(761,389);
        ms1.lineTo(743,386);
        ms1.closePath();
        gr2d.setColor(a_Gray);
        gr2d.fill(ms1);
        
        ms2.moveTo(699,395);
        ms2.lineTo(706,390);
        ms2.lineTo(711,391);
        ms2.lineTo(714,390);
        ms2.lineTo(719,390);
        ms2.lineTo(722,391);
        ms2.lineTo(735,385);
        ms2.lineTo(735,391);
        ms2.lineTo(824,394);
        ms2.lineTo(829,386);
        ms2.lineTo(864,386);
        ms2.lineTo(873,389);
        ms2.lineTo(873,396);
        ms2.lineTo(876,396);
        ms2.lineTo(876,403);
        ms2.lineTo(871,403);
        ms2.lineTo(872,407);
        ms2.lineTo(831,410);
        ms2.lineTo(824,401);
        ms2.lineTo(735,402);
        ms2.lineTo(735,405);
        ms2.lineTo(722,401);
        ms2.lineTo(720,401);
        ms2.lineTo(721,402);
        ms2.lineTo(712,401);
        ms2.lineTo(711,401);
        ms2.lineTo(708,401);
        ms2.lineTo(700,395);
        ms2.closePath();
        gr2d.setColor(a_Gray2);
        gr2d.fill(ms2);
        
    }
    public static void main (String[] args){
        GraphicsProj grp = new GraphicsProj();
        grp.setTitle("Vehicle");
        grp.setBackground(Color.WHITE);
        grp.setSize(1366,780);
        //grp.setForeground(Color.cyan);
        grp.setVisible(true);
        grp.addWindowListener(new WindowAdapter() {
        public void windowClosing(WindowEvent we) {
            System.exit(0);
         }
        });
    }
    
}
