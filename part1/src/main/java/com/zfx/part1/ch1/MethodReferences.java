package com.zfx.part1.ch1;

import java.io.File;
import java.io.FileFilter;
import java.util.Arrays;

public class MethodReferences {

    public static void main(String[] args) {
        // filter the hidden files

        // old-style
        File[] hiddenFiles = new File(".").listFiles(new FileFilter() {
            @Override
            public boolean accept(File file) {
                return file.isHidden();
            }
        });
        System.out.println(Arrays.toString(hiddenFiles));

        // new-style, so easy
        hiddenFiles = new File(".").listFiles(File::isHidden);
        System.out.println(Arrays.toString(hiddenFiles));
    }

}
