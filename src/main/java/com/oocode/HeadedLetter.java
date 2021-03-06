package com.oocode;

import java.io.PrintStream;

@SuppressWarnings({"unused", "WeakerAccess"})
public class HeadedLetter {
    private final boolean isImportant;

    public HeadedLetter(boolean isImportant) {
        this.isImportant = isImportant;
    }

    public void print(PrintStream stream) {
        stream.println("ACME Ltd");
        stream.println("123 High St");
        stream.println("London");
        stream.println("SW12 1AA");
        //...
    }

    public boolean isImportant() {
        return isImportant;
    }

    public void sendByCourier() {
        //...
    }

    public void sendByStandardMail() {
        //...
    }
}
