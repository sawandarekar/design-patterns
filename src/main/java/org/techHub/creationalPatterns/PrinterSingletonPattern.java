package org.techHub.creationalPatterns;

import java.util.ArrayList;
import java.util.List;

/**
 * Singleton Pattern. --Ensures that there is only one instance of class is created. provide global point of access to
 * object.
 *
 * @author darekar
 */
public class PrinterSingletonPattern {

    private static PrinterSingletonPattern singletonPattern;
    private final List<String> printQueue = new ArrayList<String>();

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
