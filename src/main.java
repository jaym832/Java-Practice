public class main {
    public static void main(String[] args) {

    getDurationString(65,45);

    getDurationString(40);

    }


    public static void getDurationString(int mins,int secs){
        int hours=0;
        if(mins>=0&&secs>=0){
            if(secs<=59){

                if(mins>=60){
                     hours=mins/60;
                     mins=mins%60;
                    System.out.println(hours+" h "+mins+" m "+secs+" s ");
                }else{
                    System.out.println(hours+" h "+mins+" m "+secs+" s ");
                }


            }else{
                System.out.println("Invalid value");
            }
        }
    }


    public static void getDurationString(int secs){
        int mins=0;
        if(secs>=0){
            if(secs>=60){
                mins=secs/60;
                secs=secs%60;
                getDurationString(mins,secs);
            }
            else{
                getDurationString(mins,secs);
            }
        }
        else{
            System.out.println("Invalid value");
        }
    }

}
