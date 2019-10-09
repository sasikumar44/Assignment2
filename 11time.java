import java.time.Duration; // to check time intervel
import java.time.Instant; // to check time intervel

class time{
    public static void main(String[] args) {
        Instant start = Instant.now();
        String time1 = "09:29:60";
        String time2 = "09:49:58";
        String[] t1 = time1.split(":");
        String[] t2 = time2.split(":");
        int h1= Integer.parseInt(t1[0]);
        int m1= Integer.parseInt(t1[1]);
        int s1= Integer.parseInt(t1[2]);
        int h2= Integer.parseInt(t2[0]);
        int m2= Integer.parseInt(t2[1]);
        int s2= Integer.parseInt(t2[2]);
        int s = 0;
        int m =0;
        int h=0;
        boolean t1big = false;
        if(h1>h2){
            t1big =true;
        }
        else if(h1==h2 && m1>m2){
            t1big =true;
        }
        else if(h1==h2 && m1==m2 && s1>=s2){
            t1big =true;
        }

        if(t1big){
            if(s1>=s2){
                s = s1-s2;
            }
            else{
                s = 60 + s1-s2;
                m1 = m1-1;
            }
            if(m1>=m2){
                m = m1-m2;   
            }
            else{
                m = 60 + m1 - m2;
                h1 = h1-1;
            }
            h = h1-h2;
        }
        else{
            if(s2>=s1){
                s = s2-s1;
            }
            else{
                s = 60 + s2-s1;
                m2 = m2-1;
            }
            if(m2>=m1){
                m = m2-m1;   
            }
            else{
                m = 60 + m2 - m1;
                h2 = h2-1;
            }
            h = h2-h1;
        }
        
        System.out.println(h + ":"+ m+":"+s);

        Instant end = Instant.now();
		Duration timeElapsed = Duration.between(start, end);
		System.out.println("Time taken: "+ timeElapsed.toMillis() +" milliseconds");

    }
}