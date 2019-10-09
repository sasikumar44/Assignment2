import java.util.Scanner;

class Leave {    
    int month;
    Leave(String date){
        String[] da = date.split("/");
        this.month = Integer.parseInt(da[1]);
    }

    int calDays(){
        if(1<=month && month <=3) return 10;
        else if(4<=month && month <=6) return 7;
        else if(7<=month && month <=9) return 3;
        else return 0;
    }

}

class myLeave{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Joining Date (yyyy/mm/dd)");
        Leave lev = new Leave(sc.next());

        int days = lev.calDays();
        System.out.println("you can take "+days+" Dayes Leave" );
        sc.close();
    }
}