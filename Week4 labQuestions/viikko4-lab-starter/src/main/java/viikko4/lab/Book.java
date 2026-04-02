package viikko4.lab;

public class Book {
    private String title, author;
    private Integer year;

    public Book(String t, String a, Integer y) {
        if(t != null ){
            this.title = t;
        }else{
            throw new IllegalArgumentException("Väärä arvo! title Book");
        }
        if( a != null ){
            this.author = a;    
        }else{
            throw new IllegalArgumentException("Väärä arvo!author Book");
        }
        if(y != null && y>0){  
            this.year = y;
        }else{
            throw new IllegalArgumentException("Väärä arvo!year Book");
        }

    }

    public String label() {
        return author+": "+title+" ("+year+")";
    }
}