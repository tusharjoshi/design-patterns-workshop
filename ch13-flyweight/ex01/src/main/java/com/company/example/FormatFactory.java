package com.company.example;

import java.util.Map;
import java.util.HashMap;

// tag::source[]
public class FormatFactory {
    private Map<String, Format> formatMap = new HashMap<>();

    private String getKey(String color, int fontSize) {
        return color + fontSize;
    }

    public int getCount() {
        return formatMap.size();
    }

    public Format getFormat(String color, int fontSize) {
        String key = getKey(color, fontSize);
        Format format = formatMap.get(key);
        if( format == null ) {
            format = new Format(color, fontSize);
            formatMap.put(key, format);
        }
        return format;
    }
}
// end::source[]