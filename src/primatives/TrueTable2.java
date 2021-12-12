package primatives;

public class TrueTable2 {
    public static void main(String[] args) {
        // there is an event for kids
        //if the age of child is 6 or less OR if the height of child is 48 inches or less
        //the event is free for that child


        int reqAge = 6;
        double reqHeight= 48;

        int childAge = 5;
        double childHeight = 60;

        boolean isFree = childAge <= reqAge || childHeight <= reqHeight;
        System.out.println("Can this poor kid can go to this even free? " + isFree);



        //find out if a student can pass the class
        // there are 3 tests taken average of those tests has to be more than 70---> 60,100,85
        //attendance rate of the student has to be 80% or more.

        int reqScore = 70;
        int reqAttendanceRate = 80;

        int test1 = 60; int test2 = 100; int test3 = 85;
        int studentScore = (test1 + test2 + test3) / 3;
        int studentAttendance = 70;

        boolean canPass = studentAttendance >= 80 && studentScore > reqScore;
        System.out.println("Can this hardworking student pass this exam? " + canPass) ;




    }
}
