
/**
 * Write a description of class Run here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Run
{
    public static void main(String[] args){
        Students s = new Students();
        Class c = new Class();
        Lecture l = new Lecture();
        
        System.out.println("Case1");
        System.out.println("----------------------------------------");
        s.Display();
        
        System.out.println("Case2");
        System.out.println("----------------------------------------");
        c.Display();
        
        System.out.println("Case3");
        System.out.println("----------------------------------------");
        l.Display();
    }
}
