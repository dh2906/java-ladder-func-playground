package util;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Parser {

    public static List<String> parseStringToList(String str) {
        return Arrays.stream(str.split(","))
            .map(String::trim)
            .collect(Collectors.toList());
    }
}
