package org.techHub.patterns.creational;

import java.util.ArrayList;
import java.util.List;

/**
 * Singleton Pattern. --Ensures that there is only one instance of class is created. provide global point of access to object.
 * https://www.javacodegeeks.com/2014/05/java-singleton-design-pattern.html?utm_content=buffera4ea7&utm_medium=social&utm_source=facebook.com&utm_campaign=buffer
 *
 * @author darekar
 */
public class PrinterSingletonPattern {

    private static PrinterSingletonPattern singletonPattern;
    private final List<String> printQueue = new ArrayList<>();

    private PrinterSingletonPattern() {

    }

    private static synchronized PrinterSingletonPattern getInstance() {
        if (singletonPattern == null) {
            singletonPattern = new PrinterSingletonPattern();
        }
        return singletonPattern;
    }

    public void addPrint(final String data) {
        // add print data to queue.
    }

}
