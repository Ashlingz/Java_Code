
/**
 * Write a description of class Lecture here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Lecture extends Name
{
    private String lecture;
    
    public Lecture(){
        lecture = "Java";
    }
    
    public void Display(){
        super.Display();
        System.out.println(lecture);
        
    }
}
