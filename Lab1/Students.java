
/**
 * Write a description of class Students here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Students extends Name
{
    private String gender;
    private String phone;
    
    public Students(){
        gender = "M";
        phone = "000-000-000";
    }
    public void Display(){
        super.Display();
        System.out.println(gender);
        System.out.println(phone);
    }
}
