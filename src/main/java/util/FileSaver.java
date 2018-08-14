package util;

import exception.SaveFileExeption;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

/**
 * Created Vladimir Shekhavtsov.
 * Simple class for save text.
 * File path: src/main/resources/..
 */
public class FileSaver {
    private String path = "src/main/resources/";

    public void saveTxt(String nameFile, String title, String text) {
        PrintWriter writer = null;
        try {
            writer = new PrintWriter(path + nameFile + ".txt", "UTF-8");
        } catch (FileNotFoundException e) {
            throw new SaveFileExeption("****ERROR****** Problems with save file. Check path. ");
        } catch (UnsupportedEncodingException e) {
            throw new SaveFileExeption("****ERROR****** Problems with save file. Check encoding. ");
        }
        writer.println(title + "\n");
        writer.println(text);
        writer.close();
    }
}

