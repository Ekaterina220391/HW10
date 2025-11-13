import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Задача 1.1");
        int[] inputArray1 = {250, 1000, 2500, 3000, 150};
        int sum = 0;
        for (int element : inputArray1) {
            sum = sum + element;
        }
        System.out.println(sum);

        System.out.println("Задача 1.2");
        int maxInputArray1 = -1;
        for (int i = 0; i < inputArray1.length; i++) {
            if (inputArray1[i] > maxInputArray1) {
                maxInputArray1 = inputArray1[i];
            }
        }
        System.out.println(maxInputArray1);

        System.out.println("Задача 1.3");
        int minInputArray1 = 0;
        for (int current : inputArray1) {
            minInputArray1 = 3000;
            if (current < minInputArray1) {
                minInputArray1 = current;
            }
        }
        System.out.println(minInputArray1);

        System.out.println("Задача 1.4");
        int avarageInputArray1 = sum / inputArray1.length;
        System.out.println(avarageInputArray1);


        System.out.println("Задача 1.5");
        int[] outputArray1 = new int[4];
        outputArray1[0] = sum;
        outputArray1[1] = maxInputArray1;
        outputArray1[2] = minInputArray1;
        outputArray1[3] = avarageInputArray1;
        System.out.println(Arrays.toString(outputArray1));

        System.out.println("Задача 2");
        int [] inputArray2= {15700, 20000, 35000,18500,41000};
        float [] outputArray2= new float [5];
        int index =0;
        for (int salary : inputArray2) {
            float tax = salary*0.13f;
            outputArray2 [index]= tax;
            index++;
        }
        System.out.println(Arrays.toString(outputArray2));
        System.out.println(Arrays.toString(inputArray2));


        System.out.println("Задача 3");
        int [] inputArray3= {20000, 35000,2000,7000,3500};
        boolean [] outputArray3= new boolean[5];
        int k=0;
        for  (int element : inputArray3) {
            if (element>=5000){
                outputArray3 [k]=true;

            }

            else {
                outputArray3 [k]=false;
            }
            k++;

        }
        System.out.println(Arrays.toString(inputArray3));
        System.out.println(Arrays.toString(outputArray3));

        System.out.println("Задача 4");
        int [] inputArray4= {45000, 0, -20, 2500,300};
        boolean [] outputArray4= new boolean[5];
        int m=0;
        for  (int balans : inputArray4) {
            if (balans>0) {

                outputArray4[m] = true;
                m++;
            }
            else {
                outputArray4[m] = false;
                break;
            }

        }
        System.out.println(Arrays.toString(inputArray4));
        System.out.println(Arrays.toString(outputArray4));

        System.out.println("Задача 5");
        int [] inputArray5= {45000, 0, 200000, 0,300};
        boolean [] outputArray5= new boolean [5];
        int n=0;
        for  (int profit : inputArray5) {

            if (profit>0){
                n++;
                outputArray5[n] = true;

            }
            else {
                outputArray5[n] = true;
            }
        }
        System.out.println(Arrays.toString(outputArray5));



    }


    }
