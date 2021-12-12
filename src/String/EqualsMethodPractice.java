package String;public class EqualsMethodPractice {

    public static void main(String[] args) {
        String name1 = "David";
        String name2 = "David";
        String name3 = new String("David");
        String name4 = new String("David");
        String name5 = name3;
        String name8 = name1;
        String name6 = "Jenny";
        String name7 = "Jenny";
        System.out.println(name1 == name2);//true
        System.out.println(name1.equals(name2));//true
        System.out.println(name1 == name3);//false because they are stored in different places
        System.out.println(name1.equals(name3));//true because equals method compares values so it compares David
        System.out.println(name3.equals(name4));//true because we are comparing them with equals method
        System.out.println(name3 == name5);// true because it is comparing same object.they are looking for same object in the bucket
        System.out.println(name3.equals(name5));//true because values are the same
        System.out.println(name8 == name2);//true
        System.out.println(name8.equals(name5));//true
        System.out.println(name8 == name4);//false

    }
}
