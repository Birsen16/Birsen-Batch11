package primatives;

public class TrueTable1 {
    public static void main(String[] args) {

        boolean visa = true;
        boolean ticket = true;

        boolean myVisa = false;
        boolean myTicket = true;

        boolean  canTravel =  visa== myVisa && ticket == myTicket; //false && true = false
        System.out.println(canTravel); //false
        //ask question
        boolean online = true;
        boolean campus = true;

        boolean student = true;// if this would be false then it would print as false.
        // if online and campus both false then it would show uo as false

       boolean askQuestion = student == online || student == campus;
        System.out.println("Can I asl a question ?  " + askQuestion);

        // 90% and more attendance and score of 80 or more to pass this class

        int reqAttendance=90;
        int reqScore = 80;

        int yourAttendance = 91;
        int yourScore =81;

        boolean pass = yourAttendance >= reqAttendance && yourScore >= reqScore;

        System.out.println("Can I pass the course? " + pass);




    }
}
