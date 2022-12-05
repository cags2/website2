import java.util.*;
public class Algebra {
    int yes = 0;
    public Algebra(){
        yes = 1;
    }
    public void addingorsubtractingVariables(){
        //5 + x = 17
        //need choice
        Random rand = new Random();
        int answer = 0;
        int number1 = rand.nextInt(99) + 1;
        int number2 = rand.nextInt(100) + 1;
        if(number1 > number2){
            System.out.println("Question: " + number1 + " - x = "  + number2);
            answer = number1 - number2;
        }
        else if(number2 > number1){
            System.out.println("Question: " + number1 + " + x = "  + number2);
            answer = number2 - number1;
        }
        String question = number1 + " + x " + number2;
        int choice1 = answer + 6;
        int choice2 = answer / 2;
        int choice3 = number1 - answer;
        String choice1string = Integer.toString(choice1);
        String choice2string = Integer.toString(choice2);       
        String choice3string = Integer.toString(choice3);
        String answerstring = Integer.toString(answer);
        String[] whole = {question, choice1string, choice2string, choice3string, answerstring};
        for(int i = 0; i < whole.length; i++){
            System.out.println(whole[i]);
        }
    }
    public void multiplyingVariables(){
        //8x + 3 = 27
        //need choice
        Random rand = new Random();
        int answer = 0;
        int num1 = rand.nextInt(11) + 2;
        int num3 = rand.nextInt(101) + 11;
        //int num1 = 5;
        //int num3 = 11;
        int yes = (num3 / num1);
        int yes1 = yes * num1;
        int num2 = num3 - yes1;
        answer = (num3 - num2) / num1;
        int divisible = num3 - num2;
        while(divisible % answer != 0){
            num1 = num1 + 1;
        }
        answer = (num3 - num2) / num1;
        System.out.println("Question: " + num1  + "x + " + num2 + " = " + num3);
        System.out.println(answer);
        int choice1 = num1 + 1;
        int choice2 = num3 - num2 - num1;
        if(num2 == 0){
            int choice3 = yes + num2 + 2;
        }
        int choice3 = yes + num2;
        String question = ("Question: " + num1  + "x + " + num2 + " = " + num3);
        String choice1string = Integer.toString(choice1);
        String choice2string = Integer.toString(choice2);       
        String choice3string = Integer.toString(choice3);
        String answerstring = Integer.toString(answer);
        String[] whole = {question, choice1string, choice2string, choice3string, answerstring};
    }
    public void givenVariables(){
        Random rand = new Random();
        //7j + 5 -8k when j = 0.5 and k = 0.25
        int num1 = rand.nextInt(11) + 1;
        int x = rand.nextInt(11) + 2;
        int num2 = rand.nextInt(31) + 1;
        int num3 = rand.nextInt(11) + 1;
        int j = rand.nextInt(11) + 1;
        int answer = (num1 * x) + num2 + (num3 * j);
        System.out.println("Question: " + num1 + "x + " + num2 + " + " + num3 + "j =");
        System.out.println("Find the answer while x = " + x + " and j = " + j);
        System.out.println(answer);
        String answerstring = Integer.toString(answer);
        String question = ("Question: " + num1 + "x + " + num2 + " + " + num3 + "j =");
        int choice1 = num1 + num2 + num3;
        int choice2 = (num1 + x) + num2 + (num3 + j);
        int choice3 = (num1 / x) + num2 + (num3/j);
        String choice1string = Integer.toString(choice1);
        String choice2string = Integer.toString(choice2);
        String choice3string = Integer.toString(choice3);
        String[] whole = {question, choice1string, choice2string, choice3string, answerstring};
        for(int i = 0; i < whole.length; i++){
            System.out.println(whole[i]);
        }
    }
        public void combininglikeTerms(){
            //8a + 2b + 3c + 9a + 3b + 9c = 17a + 5b + 12c
            //need choice
            Random rand = new Random();
            int format = rand.nextInt(3) + 1;
            int num1 = rand.nextInt(11) + 1;
            int num2 = rand.nextInt(11) + 1;
            int num3 = rand.nextInt(11) + 1;
            int num4 = rand.nextInt(11) + 1;
            int num5 = rand.nextInt(11) + 1;
            int num6 = rand.nextInt(11) + 1;
            String answer = "yes";
            if(format == 1){
                System.out.println("Question: " + num1 + "a + " + num2 + "b + " + num3 + " + " + num4 + "a + " + num5 + "b + " + num6);
                int a = num1+num4;
                int b = num2 + num5;
                int none = num3 + num6;
                answer = a + "a + " + b + "b + " + none;
                System.out.println(answer);
            }
            else if(format == 2){
                System.out.println("Question: " + num1 + "b + " + num2 + "a + " + num3 + " + " + num4 + "a + " + num6 + " + " + num5 + "b ");
                int a = num2 + num4;
                int b = num1 + num5;
                int none = num3 + num6;
                answer = a + "a + " + b + "b + " + none;
                System.out.println(answer);
            }
            else if(format == 3){
                System.out.println("Question: " + num1 + " + " + num2 + "b + " + num3 + " + " + num4 + "a + " + num5 + "b + " + num6 + "a");
                int a = num4 + num6;
                int b = num2 + num5;
                int none = num1 + num3;
                answer = a + "a + " + b + "b + " + none;
                System.out.println(answer);
                
            }
        }
        public void findingvariablefrombothSides(){
            //3y + 3 = y + 3 y=0
            //need choice
            Random rand = new Random();
            int variable = rand.nextInt(5) + 1;
            int num1 = rand.nextInt(10) + 1;
            int num2 = rand.nextInt(20) + 1;
            int num3 = rand.nextInt(10) + 1;
            int minus = (num1 * variable) + num2;
            int num4 = minus - (num3 * variable);
            String question = num1 + "y + " + num2 + " = " + num3 + "y + " + num4; 
            int answer = variable;
            System.out.println(question);
            System.out.println(answer);
        }
        public void equationswithParenthesis(){
            //2(2x + 4) = 8x x = 2
            //need choice
            Random rand = new Random();
            int num1 = rand.nextInt(10) + 1;
            int num2 = rand.nextInt(10) + 1;
            int x = rand.nextInt(5) + 1;
            int num3 = rand.nextInt(10) + 1;
            int multiplied = num2 * x;
            int total = (num1 * multiplied) + (num1 * num3);
            int num4 = total / x;
            String question = num1 + "(" + num2 + "x + "+ num3 + ") = " + num4 + "x: Find the X";
            int answer = x;
            System.out.println(question);
            System.out.println(answer);
        }
        public void linearequationswithunknowncoefficients(){
            //ax + 3x = bx + 5  x = 5/a+3-b
            //need choices
            Random rand = new Random();
            int different = rand.nextInt(3) + 1;
            int num1 = rand.nextInt(10) + 1;
            int num2 = rand.nextInt(10) + 1;
            int guranteed = 3;
            String question = "yes";
            String answer = "yes";
            if(different == 1){
                question = num1 + "x +  bx = ax + " + num2 + " Find the x";
                answer = "x =      " + num2 + "\n      -------- \n     " + num1 + " + b - a";
            }
            else if(different  == 2){
                question = "b(" + num1 + " + x) = ax + " + num2 + " Find the x";
                answer = "x =   " + num2 + " - " + num1 + "b\n      -------- \n      b - a"; 
            }
            else if(different == 3){
                    question = "-ax + " + num1 + " = b(x + " + num2 + ") Find the x and do not factor";
                   answer = "x =    " + num2 + "b - " + num1 + "\n    - --------\n       a + b";
            }
            System.out.println(different);
            System.out.println(question);
            System.out.println(answer);
        }
        public void inequalitiesonbothsides(){
            //x + 4 < 7;
            Random rand = new Random();
            int num1 = rand.nextInt(50) + 1; //6
            int num2 = rand.nextInt(50) + 1; //1
            int num3 = rand.nextInt(10) + 1; //9x
            int different = 3;
            String question = "yes";
            String answer = "yes";
            if(different == 1){
                question = "x + " + num1 + " < " + num2;
                num2 = num2 - num1;
                answer = "x < " + num2;
            }
            else if(different == 2){
                num2 = num2 - num1;
                while(num2 % num3 != 0){
                    num2++;
                }
                int yes = num2/ num3; 
                int total = num2 + num1;
                question = num3 + "x + " + num1 + " < " + total;
                answer = "x < " + yes;
            }
            else if(different == 3){
                num1 = num1 - num2;
                while(num1 % num3 != 0){
                    num1++;
                }
                int yes = num1/num3;
                int total = num1 - num2;
                question = total + " < -" + num2 + " + " + num3 + "x";
                answer = "x > " + yes;
            }
            System.out.println(question);
            System.out.println(answer);
        }
        public void inequalitiesonbothsides2(){
            //4x + 5 < 2x + 7
            Random rand = new Random();
            int num1 = rand.nextInt(10) + 1;
            int num2 = rand.nextInt(10) + 1;
            int num3 = rand.nextInt(10) + 1;
            int num4 = rand.nextInt(10) + 1;
            int different = 1;
            String answer = "yes";
            String question = "yes";
            if(different == 1){
                question = num1 + "x + " + num2 + " < " + num3 + "x + " + num4;
                if(num1 > num3){
                    num1 = num1 - num3;
                    if(num2 > num4){
                        num2 = num2 - num4;
                        if(num2%num4 < 0){
                            answer = "x < " + num2 + "\n      ------ " + num4;
                        }
                        else{
                            num2 = num2 / num4;
                            answer = "x < " + num2;
                        }
                    }
                    else if(num4 > num2){
                        num4 = num4 - num2;
                        if(num4%num2 != 0){
                            answer = "x < " + num4 + "\n ----" + num2; 
                        }
                        else{
                            num4 = num4 / num2;
                            answer = "x < " + num4;
                        }
                    }

                }
                else if(num3 > num1){
                    num3 = num3 - num1;
                    num2 = num2 - num4;
                    num2 = num2 / num3;
                    answer = "x < " + num2;
                }
            }
            System.out.println(question);
            System.out.println(answer);
        }
        public void inequalitiesOr(){
            //5z + 7 < 27 or 3z  + 9 < 18
            Random rand = new Random();
            int num1 = rand.nextInt(10) + 1;
            int num2 = rand.nextInt(10) + 1;
            int num3 = rand.nextInt(50) + 10;
            int num4 = rand.nextInt(10) + 1;
            int num5 = rand.nextInt(10) + 1;
            int num6 = rand.nextInt(50) + 10;
            System.out.println(num1);
            System.out.println(num2);
            System.out.println(num3);
            System.out.println(num4);
            System.out.println(num5);
            System.out.println(num6);
            String question = "yes";
            String answer = "yes";
            while(num3 % num1 !=0){
                num3++;
            }
            while(num6 % num4 != 0){
                num6++;
            }
            int total1 = num3 + num2;
            int total2 = num6 + num5;
            int yes1 = num3 / num1;
            int yes2 = num6 / num4;
            question = num1 + "x + " + num2 + " < " + total1 + " or " + num4 + "x + " + num5 + " < " + total2;  
            answer = "x < " + yes1 + " or x < " + yes2;
            System.out.println(question); 
            System.out.println(answer);
            
        }
}
