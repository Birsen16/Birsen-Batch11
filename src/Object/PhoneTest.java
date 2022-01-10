package Object;

public class PhoneTest {
    public static void main(String[] args) {
        Phone phone = new Phone();
        //Phone brand = "I-phone";
        //phone.call(12468080);

        System.out.println("*********" + phone.color);

        Phone phone1 =new Phone("PINK");
        Phone phone2 = new Phone();

        System.out.println(phone1.color);
        System.out.println(phone2.color);

        Phone phone3 =new Phone("Black","Samsung");


    }

}
