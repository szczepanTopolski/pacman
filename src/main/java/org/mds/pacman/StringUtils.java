package org.mds.pacman;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringUtils {

    public static String reduceStrings(Stream<String> inputStream){
        return inputStream.reduce(String::concat).orElseThrow();
    }

    public static String joinStrings(Stream<String> inputStream){
        return inputStream.collect(Collectors.joining("\n"));
    }
}
