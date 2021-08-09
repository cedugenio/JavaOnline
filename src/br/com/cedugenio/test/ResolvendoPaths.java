package br.com.cedugenio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ResolvendoPaths {
    public static void main(String[] args) {
        Path dir = Paths.get("home\\carlao");
        Path arquivo = Paths.get("\\dev\\carlao.txt");
        Path result = dir.resolve(arquivo);

    }
}
