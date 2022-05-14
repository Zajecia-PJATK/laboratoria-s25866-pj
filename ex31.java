class Account {

    private String Id;
    private String Name;
    private int Balance = 0;
    private int Amount;

    public Account(String Id,String Name){
        this.Id=Id;
        this.Name=Name;
    }
    public Account(String Id,String Name,int Balance){
        this.Id=Id;
        this.Name=Name;
        this.Balance=Balance;
    }

    public String getID() {
        return Id;
    }
    public String getName(){
        return Name;
    }

    public int getBalance() {
        return Balance;
    }
    public int credit(int Amount){
        Balance=Balance+Amount;
        return Balance;
    }
    public int debit(int Amount){
        if (this.Amount<=this.Balance){
            Balance=Balance-Amount;
            return Balance;
        }
        return Balance;
    }
    public String toString(){
        return "Account[id=" + getID() +",name="+ getName() +",balance="+ getBalance() + "]";

    }
}