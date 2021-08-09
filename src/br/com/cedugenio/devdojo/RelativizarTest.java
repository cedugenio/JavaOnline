package br.com.cedugenio.devdojo;

import java.nio.file.Path;
import java.nio.file.Paths;

public class RelativizarTest {
    public static void main(String[] args) {
        Path dir  = Paths.get("/home/tec_ceugenio");
        Path file = Paths.get("/home/tec_ceugenio/java/teste.java");
        Path pathToClass = dir.relativize(file);
        System.out.println(pathToClass);
    }
}
