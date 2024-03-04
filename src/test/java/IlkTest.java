public class IlkTest {
    public static void main(String[] args) {

        String expectedData="Salam";
        String actualData="Salam";

        if (expectedData.equals((actualData))){
            System.out.println("Test PASSED");
        }else {
            System.out.println("Test FAILED");
        }

        int expectedNumber = 5;
        int actualNumber = 5;

        if (expectedNumber == actualNumber){
            System.out.println("Test PASSED");
        }else {
            System.out.println("Test FAILED");
        }

        System.out.println("------Test03-------");

        if (expectedNumber > actualNumber){
            System.out.println("Test PASSED");
        }else {
            System.out.println("Test FAILED");
        }
    }
}
