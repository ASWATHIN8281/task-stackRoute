package com.company;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileIO {
    public static void main(String[] args) throws IOException {
//     String fname="abc.txt";
//        Stream<String>stream= Files.lines(Paths.get(fname));
//        stream.forEach(s -> System.out.println(s));
//
//        String data="aswathi";
//        Path path=Paths.get("abc.txt");
//        Files.write(path,data.getBytes());
         //listing files
          Stream<Path> dfiles=Files.list(Paths.get("myFolder"));
          dfiles.forEach(s-> System.out.println(s));

          //create directories

        String d="myFl=older/demo";
        Files.createDirectories(Paths.get(d));
        //create file
//        String dfile="myFl=older/demo.txt";
//        Files.createFile(Paths.get(dfile));

        // file info
        System.out.println(Files.size(Paths.get("abc.txt")));


    }
}
