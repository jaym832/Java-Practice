public class main {
    public static void main(String[] args) {


    }


//    public static void getDurationString(int mins,int secs){
//        int hours=0;
//        if(mins>=0&&secs>=0){
//            if(secs<=59){
//
//                if(mins>=60){
//                     hours=mins/60;
//                     mins=mins%60;
//                    System.out.println(hours+" h "+mins+" m "+secs+" s ");
//                }else{
//                    System.out.println(hours+" h "+mins+" m "+secs+" s ");
//                }
//
//
//            }else{
//                System.out.println("Invalid value");
//            }
//        }
//    }


//    public static void getDurationString(int secs){
//        int mins=0;
//        if(secs>=0){
//            if(secs>=60){
//                mins=secs/60;
//                secs=secs%60;
//                getDurationString(mins,secs);
//            }
//            else{
//                getDurationString(mins,secs);
//            }
//        }
//        else{
//            System.out.println("Invalid value");
//        }
//    }

//    public static double area(double radius){
//        if(radius<0){
//            return -1.0;
//        }
//        else{
//            double pi=Math.PI;
//            double area=pi*(Math.pow(radius,2));
//            return area;
//        }
//
//
//    }
//
//
//    public static double area(double num1,double num2){
//        if(num1<0||num2<0){
//            return -1.0;
//
//        }else {
//            return num1 * num2;
//        }
//    }


    public static void printYearsAndDays(long mins){
        if(mins>=60){
            long hours= mins/60;
            if(hours>=24){
                long days=hours/24;

                if(days>=365){
                    long years= days/365;
                }
            }
        }
    }

}
