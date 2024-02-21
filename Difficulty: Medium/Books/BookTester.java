/*
 * For this activity, you are going to refactor the Book superclass and the Dictionary and Fiction subclasses.

 * Right now, the Book class is empty and the Dictionary and Fiction classes have instance variables and getter and setter methods. 
 * Your task is to move common attributes and methods to the Book superclass and remove them from the subclasses.

 * Note: You do not need a constructor in any class.

 * 
 */

public class BookTester 
{
    public static void main(String[] args)
    {
        Fiction hungerGames = new Fiction();
        
        hungerGames.setPages(374);
        hungerGames.setName("The Hunger Games");
        hungerGames.setAuthor("Suzanne Collins");
        
        Dict websters = new Dict();
        websters.setPages(720);
        websters.setName("Webster's Dictionary");
        websters.setWords(171476);
        
        System.out.println(hungerGames.getName());
        System.out.println(websters.getName());
    }
}
