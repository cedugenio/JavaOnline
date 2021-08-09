package br.com.cedugenio.test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class CriandoPathTest {
    public static void main(String[] args) {
        //C:\Users\cedugenio\IdeaProjects\JavaOnline\src
        Path file1 = Paths.get("C:\\Users\\cedugenio\\IdeaProjects\\JavaOnline\\src\\Arquivo.txt");
        //System.out.println(p1.toAbsolutePath());
        File file = file1.toFile();
        Path path = file.toPath();

        Path path1 = Paths.get("pascoa");
        Path path2 = Paths.get("natal\\2021");
        Path arquivo = Paths.get("natal\\2021\\feliz_natal.txt");
        if (Files.notExists(path2)) {
            try {
                Files.createDirectories(path2);
                Files.createFile(arquivo);
            } catch (IOException e) {
                e.printStackTrace();
            } finally {

            }
        }

        Path source = Paths.get("natal\\2021\\feliz_natal.txt");
        Path target = Paths.get(path2.toString() + "\\feliz_natal_2021.txt");

        try {
            Files.copy(source,target, StandardCopyOption.REPLACE_EXISTING);
            Files.deleteIfExists(source);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}