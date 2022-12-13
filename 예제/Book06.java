public class Book06 {
    String title;
    String author;

    void show(){
        System.out.println(title + " " + author);
    }

    public Book06(){
        this("", "");
        System.out.println("생성자 호출됨");
    }

    public Book06(String title){
        this(title, "작자미상");
    }

    public Book06(String title, String author){
        this.title = title;
        this.author = author;
    }

    public static void main(String[] args) {
        //Book06 littlePrince = new Book06("어린왕자", "생텍쥐페리");
        Book06 loveStory = new Book06("춘향전");
        //Book06 empthBook = new Book06();
        loveStory.show();
    }
}




