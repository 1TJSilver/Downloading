import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class Main {
    static StringBuilder tempTxt = new StringBuilder();
    static LocalDateTime localDateTime = LocalDateTime.now();
    public static void main(String[] args) {
        File src, res, savegames, temp, main, test, drawables, icons, vectors, Main, Utils, temp_txt;
        src = new File("Games//src");
        res = new File("Games//res");
        savegames = new File("Games//savegames");
        temp = new File("Games//temp");
        main = new File("Games//src//main");
        test = new File("Games//src//test");
        drawables = new File("res//drawables");
        icons = new File("res//icons");
        vectors = new File("res//vectors");
        Main = new File("Games//src//main//Main.java");
        Utils = new File("Games//src//main//Utils.java");
        temp_txt = new File("Games//temp//temp.txt");
        createDirectory(src);
        createDirectory(res);
        createDirectory(savegames);
        createDirectory(temp);
        createDirectory(main);
        createDirectory(test);
        createDirectory(drawables);
        createDirectory(icons);
        createDirectory(vectors);
        createFile(Main);
        createFile(Utils);
        createFile(temp_txt);
        try (FileWriter writer = new FileWriter(temp_txt)){
            String text = tempTxt.toString();
            writer.write(text);
        } catch (IOException exception){
            System.out.println(exception.getMessage());
        }
    }
    public static void createDirectory (File file){
        if (file.mkdir()){
            System.out.println("Directory was created");
            tempTxt.append(file.getName() + " was created in " + localDateTime + "\n");
        }
    }
    public static void createFile (File file) {
        try {
            if (file.createNewFile()){
                System.out.println("File was created");
                tempTxt.append(file.getName() + " was created in " + localDateTime + "\n");
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
