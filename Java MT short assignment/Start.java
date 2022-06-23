import java.lang.*;

public class Start {
    public static void main(String[] args) {

        System.out.println("---------------------------------------------------------");
        
        StoryBook sb1 = new StoryBook();
        StoryBook sb2 = new StoryBook("101",
                            "Learn Java",
                            "Adam",
                            500.50,
                            10,
                            "Beginner");

        TextBook tb1 = new TextBook();
        TextBook tb2 = new TextBook("201",
                                    "Learn C++",
                                    "Jennie",
                                    250,
                                    8,
                                    5);

        sb2.setCategory("Pro");
        tb2.setStandard(7);

        sb2.showDetails();
        tb2.showDetails();


    }
}
