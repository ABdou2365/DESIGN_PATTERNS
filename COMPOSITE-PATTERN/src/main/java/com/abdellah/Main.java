package com.abdellah;

import com.abdellah.composite.Component;
import com.abdellah.composite.File;
import com.abdellah.composite.Folder;

public class Main {
    public static void main(String[] args) {
        Folder root = new Folder("root");
        root.addChild(new File("pom.xml"));
        Folder src = (Folder) root.addChild(new Folder("src"));
        src.addChild(new File("Main.java"));
        Folder test = (Folder) src.addChild(new Folder("test"));
        test.addChild(new File("Test.java"));
        root.print();
    }
}