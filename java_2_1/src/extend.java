class Book {
    String title;
    void printbook(){
        System.out.println(title);
    }
}

class Novel extends Book{
    String writer;
    void printnovel(){
        printbook();
        System.out.println(writer);
    }
}

class Magazine extends Book{
    int day;
    void printmag(){
        printbook();
        System.out.println(day);
    }
}
public class extend {
    public static void main(String[] args){
        Novel nov = new Novel();
        nov.title = "È«±æµ¿Àü";
        nov.writer = "Çã±Õ";
        nov.printnovel();

        Magazine mag = new Magazine();
        mag.title = "¸Æ½É";
        mag.day = 5;
        mag.printmag();
    }
}
