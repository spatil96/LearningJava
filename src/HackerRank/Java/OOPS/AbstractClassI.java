package HackerRank.Java.OOPS;
abstract class Book{
    String title;
    abstract void setTitle(String s);
    String getTitle(){
        return title;
    }

}

//Write MyBook class here
class MyBook extends Book {


    void setTitle(String s) {
        title =s;
    }
    //MyBook b = new MyBook.getTitle();
}
public class AbstractClassI {
    public static void main(String []args){
        //Book new_novel=new Book(); This line prHMain.java:25: error: Book is abstract; cannot be instantiated
        //Scanner sc=new Scanner(System.in);
        //String title=sc.nextLine();
        String title="A tale of two cities";
        MyBook new_novel=new MyBook();
        new_novel.setTitle(title);
        System.out.println("The title is: "+new_novel.getTitle());
        //sc.close();

    }
}
