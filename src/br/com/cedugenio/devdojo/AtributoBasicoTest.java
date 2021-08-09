package br.com.cedugenio.devdojo;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class AtributoBasicoTest {
    public static void main(String[] args) throws IOException {
        Date primeiroDeDezembro  = new GregorianCalendar(2021, Calendar.DECEMBER, 1).getTime();
        File file = new File("natal//arquivo.txt");
        file.createNewFile();
        file.setLastModified(primeiroDeDezembro.getTime());
        System.out.println(file.lastModified());
        file.delete();


    }
}
