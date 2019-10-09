class Account{
    private String id;
    private Transection[] tr = new Transection[10];
    private int count = 0;

    Account(String id){
        this.id = id;
    }
    
    void deposit(double amount, String date){
        Transection trn = new Transection();
        trn.setAmount(amount);
        trn.setDate(date);
        trn.setType('D');
        tr[count]=trn;
        count++;
    }
    void withdrawl(double amount, String date){
        Transection trn = new Transection();
        trn.setAmount((-1)*amount);
        trn.setDate(date);
        trn.setType('W');
        tr[count]=trn;
        count++;
    }
    double calAmount(){
        
        double total = 0;
        for (int i = 0; i < count; i++) {
            Transection trns = tr[i];           // trns === tr [i] location datas
            total += trns.getAmount();
        }
       return total; 
    }
    void myTransections(){
        System.out.println("your id " + id);
        for (int i = 0; i < count; i++) {
            Transection trns = tr[i];
            System.out.print("Date : "+ trns.getAmount() + ",   Transectio Type : ") ;
            String type = trns.getTrType() == 'D' ? "Deposit": "Withdrawl"; 
            System.out.println(type + ",   amount : "+trns.getAmount()); 
        }
    }
}
class Transection{          // just a data set with setters & getters
    private double amount;
    private String date;
    private char tranType;

    void setAmount(double amount){
        this.amount = amount;
    }

    void setDate(String date){
        this.date = date;
    }

    void setType(char trType){
        this.tranType = trType;
    }

    double getAmount(){
        return this.amount;
    }
    String getDate(){
        return this.date;
    }
    char getTrType(){
        return this.tranType;
    }
}

class myMain{
    public static void main(String[] args) {
        Account a1 = new Account("S9024");
        a1.deposit(2000,"12/14");
        a1.deposit(2000,"12/14");
        a1.deposit(2000,"12/14");
        a1.withdrawl(2000,"12/14");
        a1.myTransections();
        System.out.println(a1.calAmount());
    }

}
