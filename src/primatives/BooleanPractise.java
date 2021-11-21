package primatives;

public class BooleanPractise {
    public static void main(String[] args) {

        boolean isHungry = true;
        System.out.println(isHungry);

        boolean isLightOn= false;
        System.out.println(isLightOn);

        System.out.println(true);

        System.out.println(isHungry == isLightOn); //true ==false
         isLightOn = isHungry; //false=true
         isLightOn= false;
        System.out.println("Last version for is Hungry >>"  + isHungry);//true
        System.out.println(isLightOn);//false
    }
}
