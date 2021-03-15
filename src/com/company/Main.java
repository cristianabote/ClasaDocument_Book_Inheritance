package com.company;

class Document{
    private String authors[];
    private  String dataDoc;

    public Document(){
        this.authors=null;
        this.dataDoc=null;
    }
    public Document( int nrOfAuthors, String dataDoc){
        this.authors=new String[nrOfAuthors];
        this.dataDoc=dataDoc;
    }
    public String[] getAuthors(){
        for(int i=0;i<this.authors.length;i++)
            if(this.authors[i]!=null)
                System.out.println("Autorul "+i+" se numeste "+this.authors[i]);
            else{
                break;}
        return this.authors;
    }
    public void addAuthor(String author){
        for(int i=0; i<this.authors.length;i++)
        {
            if(this.authors[i]!=null){
                continue;}
            else {
                    this.authors[i]=author;
                    System.out.println("A fost adaugat autorul "+this.authors[i]);
                    break;
                }
        }
    }
    public String getDataDoc(){
        return this.dataDoc;
    }
    public void setDataDoc(String dataDoc){
        this.dataDoc=dataDoc;
    }
}

class Book extends Document{     //Mostenire prin keywordul extends
    private String title;
    private int nrPages;

    public Book(){
        this.title=null;
        this.nrPages=0;
    }
    public Book(int nrOfAuthors, String dataDoc, String title, int nrPages){
        super(nrOfAuthors,dataDoc);    // folosirea mostenirii prin keywordul super
        this.title=title;
        this.nrPages=nrPages;
       // super.getDataDoc();  //"super" din clasa careia se face mostenirea
    }
    public void setTitle(String title){
        this.title=title;
    }
    public void setNrPages(int nrPages){
        this.nrPages=nrPages;
    }
    public String getTitle(){
        return this.title;
    }
    public int getNrPages(){
        return nrPages;
    }
}


public class Main {

    public static void main(String[] args) {
	// se creaza clasa Document(clasa parinte) si clasa Book(clasa copil), unde se definesc constructori, getter si setter
    //si anumite metode. Apoi se face relatia de Inheritance (Mostenire), dupa care se apeleaza metode definite in clasa Document
        Book bookJava=new Book(3, "Oct 2020", "JAVA BOOK", 220);
        System.out.println(bookJava.getNrPages());
        System.out.println(bookJava.getTitle());

        //apelarea metodelor definite in clasa Document
        System.out.println(bookJava.getDataDoc());
        bookJava.addAuthor("Mihaela");
        bookJava.addAuthor("Andrei");
        bookJava.addAuthor("Ionut");
        bookJava.getAuthors();
    }
}
