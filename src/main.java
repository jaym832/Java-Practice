public class main {
    public static void main (String[] args){


       double num1= 20.00;
       double num2=80.00;

       double sumOfNumsAndMultiply=(num1+num2)*100;

        System.out.println("My Values total "+sumOfNumsAndMultiply);

       double remainderOfNums=sumOfNumsAndMultiply%40.00;

        System.out.println("remainder "+remainderOfNums);

        boolean isNoRemainder=(remainderOfNums==0)?true:false;

        System.out.println(isNoRemainder);

        if(!isNoRemainder){
            System.out.println("Got some remainder");
        }








}




}
