import java.util.*;
import greenfoot.*;
import java.util.ArrayList;
import java.io.*;
// (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.lang.reflect.Constructor;

/**
 * Write a description of class Classroom here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Classroom extends World
{
    private ArrayList<Object> listo = new ArrayList<Object>();
    /**
     * Constructor for objects of class Classroom.
     *
     */
    public Classroom()
    {
        // Create a new world with 10x6 cells with a cell size of 130x130 pixels.
        super(10, 6, 130);
        
        setPeriod(2);
    }
    
    public void setPeriod(int currentPeriod) {
     removeObjects(getObjects(null)); //remove all objects previously in world
     
     TogglePeriodBtn bluebutton = new TogglePeriodBtn();
     addObject(bluebutton, 1, 1); //adds the toggle button at 1, 1
     
     if (currentPeriod == 2) { //if current period is 2 then add all period 2 students
        JoshuaChon joshuachon = new JoshuaChon("Joshua", "Chon", 1, 2);
        addObject(joshuachon, 1, 2);
        joshuachon.sitDown();

        DerekXu derekxu = new DerekXu("Derek", "Xu", 1, 3);
        addObject(derekxu, 1, 3);
        derekxu.sitDown();

        KaifJeelani kaifjeelani = new KaifJeelani("Kaif", "Jeelani", 1, 4);
        addObject(kaifjeelani, 1, 4);
        kaifjeelani.sitDown();
    }
     else if (currentPeriod == 3) { //if current period is 3 then add all period 3 students
        JennyWang jennywang = new JennyWang("Jenny", "Wang", 2, 2);
        addObject(jennywang, 2, 2);
        jennywang.sitDown();
        
        ChelseaLee chelsealee = new ChelseaLee("Chelsea", "Lee", 2, 3);
        addObject(chelsealee, 2, 3);
        chelsealee.sitDown();
        
        EeshanWalia eeshanwalia = new EeshanWalia("Eeshan", "Walia", 2, 4);
        addObject(eeshanwalia, 2, 4);
        eeshanwalia.sitDown();
    }
    }
    
    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */

    public void prepare()
    {
        // Add three lines to this doc with your class constructor and your row and seat number
        // Make sure to match your first and last name to the class file you created.
        
        // File file = new File("period2.txt");
        // try{
        // BufferedReader br = new BufferedReader(new FileReader(file));
        // String st;
        // int i = 1;
        // int j = 1;
        // while ((st = br.readLine()) != null){
        //     String[] params = st.split("[,]", 0);
        //     Class<?> clazz = Class.forName(params[0]);
        //     Constructor<?> ctor = clazz.getConstructor(String.class, String.class, int.class, int.class);
        //     Student object = (Student) ctor.newInstance(new Object[] {params[1], params[2], i++, j++ });
        //     addObject(object, i++, j++);
        // }}
        // catch (Exception e){
        //     System.out.println("File not found");
        // }

        

        JoshuaChon joshuachon = new JoshuaChon("Joshua", "Chon", 1, 2);
        addObject(joshuachon, 1, 2);
        joshuachon.sitDown();

        DerekXu derekxu = new DerekXu("Derek", "Xu", 1, 3);
        addObject(derekxu, 1, 3);
        derekxu.sitDown();

        KaifJeelani kaifjeelani = new KaifJeelani("Kaif", "Jeelani", 1, 4);
        addObject(kaifjeelani, 1, 4);
        kaifjeelani.sitDown();
         
        EricZheng ericzheng = new EricZheng("Eric", "Zheng", 6, 1);
        addObject(ericzheng, 6, 1);
        ericzheng.sitDown();

        ArvindKumar arvindkumar = new ArvindKumar("Arvind", "Kumar", 3, 3);
        addObject(arvindkumar, 3, 3);
        arvindkumar.sitDown();
         
        RidhiTamirasa rtk = new RidhiTamirasa("Ridhi", "Tamirasa", 2, 3);
        addObject(rtk, 2, 3);
        rtk.sitDown();

        AkashDarbha akashdarbha = new AkashDarbha("Akash", "Darbha", 3, 4);
        addObject(akashdarbha, 3, 4);
        akashdarbha.sitDown();  

        SharvinM SharvinManjrekar = new SharvinM("Sharvin", "Manjrekar", 4, 4);
        addObject(SharvinManjrekar, 4, 4);
        SharvinManjrekar.sitDown();
  
        KeenanKalra keenankalra = new KeenanKalra("Keenan", "Kalra", 2, 2);
        addObject(keenankalra, 2, 2);
        keenankalra.sitDown();

        AnirudhNagasamudra anirudhnagasamudra = new AnirudhNagasamudra("Anirudh", "Nagasamudra", 5, 4);
        addObject(anirudhnagasamudra, 5, 4);
        anirudhnagasamudra.sitDown();
        
        TinhphongN tinhphongnguyen = new TinhphongN("Tinhphong", "Nguyen", 1, 2);
        addObject(tinhphongnguyen, 1, 2);
        tinhphongnguyen.sitDown();
       
        ChelseaLee chelsealee = new ChelseaLee("Chelsea", "Lee", 4, 2);
        addObject(chelsealee, 4, 2);
        chelsealee.sitDown();
        
        TanishB tanishbaranwal = new TanishB("Tanish", "Baranwal", 4, 1);
        addObject(tanishbaranwal, 4, 1);
        tanishbaranwal.sitDown();  
        
        JennyWang jennywang = new JennyWang("Jenny", "Wang", 2, 2);
        addObject(jennywang, 2, 2);
        jennywang.sitDown();
        
        ChelseaLee chelsealee = new ChelseaLee("Chelsea", "Lee", 2, 3);
        addObject(chelsealee, 2, 3);
        chelsealee.sitDown();
        
        EeshanWalia eeshanwalia = new EeshanWalia("Eeshan", "Walia", 2, 4);
        addObject(eeshanwalia, 2, 4);
        eeshanwalia.sitDown();
        
        OmerAhmer omerahmer = new OmerAhmer("Omer", "Ahmer", 2, 5);
        addObject(omerahmer, 2, 5);
        omerahmer.sitDown();
    }
}

