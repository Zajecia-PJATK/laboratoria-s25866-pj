class Author {
    private String Name;
    private String email;
    private char gender;


    public Author(String Name,String email,char gender){
        this.Name=Name;
        this.email=email;
        this.gender=gender;
    }
    public String getName(){
        return Name;
    }
    public String getEmail(){
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGender() {
        return gender;
    }
    public String toString() {
        return "Author[name=" + Name +",email=" + email + ",gender=" + gender +']';
    }


}


class Book{
    private Author author;
    private double price;
    private int qty=0;
    private String Name;

    public Book(String Name,double price,Author author){
        this.Name=Name;
        this.price=price;
        this.author=author;
    }
    public Book(String Name, double price, Author author, int qty){
        this.Name=Name;
        this.price=price;
        this.author=author;
        this.qty=qty;
    }

    public Author getAuthor() {
        return author;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price=price;
    }
    public String getName(){
        return Name;
    }
    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
    public String toString() {
        return "Book[name="+this.Name+",author="+author.toString()+",price="+this.price+",qty="+this.qty+"]";
    }
}
