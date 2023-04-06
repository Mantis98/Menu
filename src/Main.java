import programs.file.musicfile.MP3MusicFile;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        MP3MusicFile musicFile = new MP3MusicFile("file.mp3", 2000, "The beatles",
                "Yellow submarine", 10);

        String file = musicFile.toString();
        System.out.println(file);

        System.out.println();


        Function f = new Function();
        f.program();

    }

}
