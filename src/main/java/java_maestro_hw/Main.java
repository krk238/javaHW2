package java_maestro_hw;

public class Main {
    public static void main(String[] args) {

        // HW
        // -----------------------------------------------------
        // 1.
        int i = 87;
        if (i < 0) {
            System.out.println(i + " is positive");
        } else if (i > 0) {
            System.out.println(i + " is negative");
        } else {
            System.out.println(i + " is 0.");
        }

        //2.
        int i2 = 64;
        if (i2 % 2 == 0) {
            System.out.println(i2 + " is even.");
        } else {
            System.out.println(i2 + " is odd");
        }

        //3
        int score = 84;
        if (score >= 90 && score <= 100) {
            System.out.println("Grade: A");
        } else if (score >= 80 && score <= 89) {
            System.out.println("Grade: B");
        } else if (score >= 70 && score <= 79) {
            System.out.println("Grade: C");
        } else if (score >= 60 && score <= 69) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }

        //4
        int side1 = 8;
        int side2 = 8;
        int side3 = 10;

        if (side1 == side2 && side2 == side3 && side1 == side3) {
            System.out.println("Triangle is equilateral");
        } else if (side1 != side2 && side2 != side3 && side1 != side3)
            System.out.println("Isosceles");
        else {
            System.out.println("scalene");
        }

        //5
        int thisNum = 68;
        if (thisNum == 0) {
            System.out.println(thisNum + " is 0.");
        } else if (thisNum < 0) {
            if (thisNum % 2 == 0) {
                System.out.println(thisNum + " is negative and even");
            } else {
                System.out.println(thisNum + " is negative and odd");
            }
        } else {
            if (thisNum % 2 == 0) {
                System.out.println(thisNum + " is negative and even");
            } else {
                System.out.println(thisNum + " is negative and odd");
            }
        }

        //6
        int num2 = 98;
        int thisSum = 0;
        int currentNum = 1;
        while (currentNum <= 98){
            thisSum += currentNum;
        }
        System.out.println(thisSum);

        //7
        int num4 = 6;
        for (int currentNum1 = 1; currentNum1 <= num4; currentNum1++) {
            System.out.println(num4 * currentNum1);
        }
    }
}