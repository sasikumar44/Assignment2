class quadratic{
    public static void main(String[] args) {
        String eq = " 5 x2 + 2 x + 52 = 0" ;
        eq = eq.trim();
        System.out.println(eq);
        int neg = eq.indexOf('-');
        int one,two,three,four = 0;
        int a1,b1,c1 = 0;
        if(neg == 0) eq = eq.substring(1);
        int begin = eq.indexOf('x');
        if(neg>0){
            a1 = Integer.parseInt(eq.substring(0,begin).trim());
            one = eq.substring(begin+1).indexOf('-');
        }else{
            a1 = Integer.parseInt(eq.substring(0,begin).trim());
            one = eq.substring(begin+1).indexOf('+');
        }
        
        two = eq.substring(begin+1).indexOf('x');
        b1 = Integer.parseInt(eq.substring(begin+1).substring(one+1,two).trim());
        three = eq.substring(two+1).indexOf('+');
        four  = eq.substring(two+1).indexOf('=');
        c1 = Integer.parseInt(eq.substring(two+1).substring(three+1,four-1).trim());

        double a = Double.valueOf(a1);
        double b = Double.valueOf(b1);
        double c = Double.valueOf(c1);
        System.out.println(a+" "+b+" "+c);

        double lam = b*b - 4*a*c; 

        if(lam > 0){
            double root1 = (-b + Math.sqrt(lam))/(2*a);
            double root2 = (-b - Math.sqrt(lam))/(2*a);
            System.out.println(eq+" has 2 real roots: "+root1+ ", "+root2 );
        }
        else if(lam == 0){
            double root1 = (-b)/(2*a);
            System.out.println(eq+" has 2 equal real roots: "+root1);
        }
        else{
            lam = -1* lam;
            double root1 = (-b)/(2*a) ;
            System.out.println(eq+" the roots are complex and different: "+root1+ "+"+Math.sqrt(lam)+"i , "+root1+ "-"+Math.sqrt(lam)+"i");
        }


    }
}