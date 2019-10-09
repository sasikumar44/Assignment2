import java.time.Duration; // to cyeck time intervel
import java.time.Instant; // to cyeck time intervel

class Datediff{
    public static void main(String[] args) {
        Instant start = Instant.now();
        String date1 = "2016/07/27";
        String date2 = "2016/05/07";
        String[] t1 = date1.split("/");
        String[] t2 = date2.split("/");
        int y1= Integer.parseInt(t1[0]);
        int m1= Integer.parseInt(t1[1]);
        int d1= Integer.parseInt(t1[2]);
        int y2= Integer.parseInt(t2[0]);
        int m2= Integer.parseInt(t2[1]);
        int d2= Integer.parseInt(t2[2]);
        int y = 0;
        int m = 0;
        int d = 0;
        boolean d1big = false;
        if(y1>y2){
            d1big =true;
        }
        else if(y1==y2 && m1>m2){
            d1big =true;
        }
        else if(y1==y2 && m1==m2 && d1>=d2){
            d1big =true;
        }

        if(d1big){
            if(d1>=d2){
                d = d1-d2;
            }
            else{
                if(m1 == 1 || m1 == 3 || m1 == 5 || m1 == 7 || m1 == 8 || m1 == 10 || m1 == 12 ){
                    d = 31 + d1-d2;
                    m1 = m1-1;
                }
                else if(m1 == 2){
                    d = 28 + d1-d2;
                    m1 = m1-1;
                }
                else{
                    d = 30 + d1-d2;
                    m1 = m1-1;
                }
            }
            if(m1>=m2){
                m = m1-m2;   
            }
            else{
                m = 12 + m1 - m2;
                y1 = y1-1;
            }
            y = y1-y2;
        }
        else{
            if(d2>=d1){
                d = d2-d1;
            }
            else{
                if(m2 == 1 || m2 == 3 || m2 == 5 || m2 == 7 || m2 == 8 || m2 == 10 || m2 == 12 ){
                    d = 31 + d1-d2;
                    m2 = m2-1;
                }
                else if(m2 == 2){
                    d = 28 + d1-d2;
                    m2 = m2-1;
                }
                else{
                    d = 30 + d1-d2;
                    m2 = m2-1;
                }
            }
            if(m2>=m1){
                m = m2-m1;   
            }
            else{
                m = 12 + m2 - m1;
                y2 = y2-1;
            }
            y = y2-y1;
        }
        
        System.out.println(y + "/"+ m+"/"+d);

        Instant end = Instant.now();
		Duration timeElapsed = Duration.between(start, end);
		System.out.println("Time taken: "+ timeElapsed.toMillis() +" milliseconds");

    }
}