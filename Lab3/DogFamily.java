
/**
 * Write a description of class DogFamily here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DogFamily implements Animal, Community
{
    public void MemberDog(String papa, String mama, String pup){
        System.out.println("Family Member: " +papa);
        System.out.println("Family Member: " +mama);
        System.out.println("Family Member: " +pup);
    }
}
