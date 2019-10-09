import java.util.*; 

class HR extends User{
    //view work folow
    //create leaveConfiguration
    //View All leave Configuration
    //Modify leave Configuration
    //Remove a leave configuration
}
class Director extends HR{
    //view work folow
    //create leaveConfiguration
}
class Manager extends HR{
    //view work folow
    //create leaveConfiguration
}
class Staff extends HR{
    //view work folow
    //create leaveConfiguration
}
class LeaveConfiguration{
    private String startDate;
    private String endDate;
    private String reason;
    /**
     * @param endDate the endDate to set
     */
    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }
    /**
     * @param startDate the startDate to set
     */
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }
    /**
     * @param reason the reason to set
     */
    public void setReason(String reason) {
        this.reason = reason;
    }
    /**
     * @return the endDate
     */
    public String getEndDate() {
        return endDate;
    }
    /**
     * @return the reason
     */
    public String getReason() {
        return reason;
    }
    /**
     * @return the startDate
     */
    public String getStartDate() {
        return startDate;
    }
}


class User{
    private LinkedList<LeaveConfiguration> lc = new LinkedList<LeaveConfiguration>();
    //private LeaveConfiguration[] tr = new LeaveConfiguration[10];
    //private int count = 0;
    
    public void createLeaveConfiguration(String sDate, String eDate, String reason){
        LeaveConfiguration leave = new LeaveConfiguration();
        leave.setStartDate(sDate);
        leave.setEndDate(eDate);
        leave.setReason(reason);
        lc.add(leave);
    }
    protected void editLeaveConfiguration(int id ,String sDate, String eDate, String reason){
        LeaveConfiguration leave = lc.get(id);
        leave.setStartDate(sDate);
        leave.setEndDate(eDate);
        leave.setReason(reason);
        lc.set(id,leave);
    }
    protected void editLeaveConfiguration(int id ,String reason){
        LeaveConfiguration leave = lc.get(id);
        leave.setReason(reason);
        lc.set(id,leave);
    }
    protected void editLeaveConfiguration(int id ,String sDate, String eDate){
        LeaveConfiguration leave = lc.get(id);
        leave.setStartDate(sDate);
        leave.setEndDate(eDate);
        lc.set(id,leave);
    }
    
    protected void deleteLeaveConfiguration(int id){
        lc.remove(id);
        System.out.println("id num "+ id + " task has been deleted");
    }
    protected void viewLeaveConfiguration(){
        int len = lc.size();
        for (int i = 0; i < len; i++) {
            LeaveConfiguration levCon = lc.get(i);
            System.out.println(levCon.getStartDate()+" to "+levCon.getEndDate()+ " leave, Reason : "+levCon.getReason()); 
        }
    }

}

class newMain{
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        Director d = new Director();
        Manager m = new Manager();
        Staff s = new Staff();
        HR h = new HR();
        do{
        System.out.print("Enter your Roll D/H/M/S : ");
        String c = sc.next();
        
        switch(c){
            case "h": case "H":
            do{ 
                h.createLeaveConfiguration("12/12/2010","14/12/2010","feaver" );
                h.createLeaveConfiguration("12/12/2010","14/12/2010","feaver" );
                System.out.println("Create Leave : c \t & Delete Leave : d \t & Edit Leave : e \t & View Leave v");
                String x = sc.next();
                switch(x){
                    case "v":
                        h.viewLeaveConfiguration();
                        m.viewLeaveConfiguration();
                        s.viewLeaveConfiguration();
                        d.viewLeaveConfiguration();
                        break;
                    case "c":
                        System.out.println("Start Date , End Date , Reason ");
                        h.createLeaveConfiguration(sc.next(),sc.next(),sc.next());
                        
                        break;
                    case "d":
                        System.out.println("Delete Leave Number : ");
                        System.out.println("Are you sure ? y ");
                        if(sc.next().equals("y"))
                        h.deleteLeaveConfiguration(sc.nextInt()-1);
                    case "e":
                        System.out.println("what you going to edit Reason : r \t startDate&endDate : se \t for all enter any");
                        String v = sc.next();
                        switch(v){
                            case "r":
                                System.out.print("enter leave Number & Reason");
                                h.editLeaveConfiguration(sc.nextInt()-1,sc.next());
                                break;
                            case "se":
                                System.out.print("enter leave Number & StartDate & EndDate");
                                h.editLeaveConfiguration(sc.nextInt()-1,sc.next(),sc.next());
                                break;
                            default:
                                System.out.println("enter leave Number & StartDate & EndDate & Reason");
                                h.editLeaveConfiguration(sc.nextInt()-1,sc.next(),sc.next(),sc.next());
                                break;
                        }
                    break;                        
                }
                System.out.println("y to do another task");
            } while(sc.next().equals("y"));
                break;
            case "d":
            do {
                
                System.out.println("Start Date , End Date , Reason ");
                d.createLeaveConfiguration(sc.next(),sc.next(),sc.next());
                System.out.println("y to enter Leave");
            } while(sc.next().equals("y"));
                break;
            case "m":
            do { 
               
                System.out.println("Start Date , End Date , Reason ");
                m.createLeaveConfiguration(sc.next(),sc.next(),sc.next());
                System.out.println("y to enter Leave");
            } while(sc.next().equals("y"));
                break;
            case "s":
            do {
                
                System.out.println("Start Date , End Date , Reason ");
                s.createLeaveConfiguration(sc.next(),sc.next(),sc.next());
                System.out.println("y to enter Leave");
            } while(sc.next().equals("y"));
                break;
            default:
                System.out.println("check your roll");
                break;

        }
        System.out.println("enter c to Change your Roll");
        }while(sc.next().equals("c"));
    }
    
}