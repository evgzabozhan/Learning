package com.zeoblocks.learning.exceptions;

import com.zeoblocks.learning.exceptions.newException.ReadingFileNotFoundException;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA. 06.12.2020
 *
 * @author Evgeniy Zabozhan (evgzabozhan@gmail.com)
 * @version $
 * @since 1.0
 */
public class ThrowEx {
    public static void main(String[] args) {
        File file = new File("src/main/resources/learning/exceptionTest/ExTest.html");
        ThrowEx ex = new ThrowEx();
        try {
            ex.readFile(file);
        } catch (final ReadingFileNotFoundException exception) {
            System.out.println(exception);
        }
    }

    private void readFile(File file) throws ReadingFileNotFoundException {
        try (FileReader fileReader = new FileReader(file)) {
            while (fileReader.ready()) {
                System.out.print((char) fileReader.read());
            }
        } catch (final IOException ex) {
            throw new ReadingFileNotFoundException
                (
                    String.format("Reading file %s in path %s not found",
                        file.getName(), file.getAbsolutePath()),
                    ex
                );
        }
    }
}
