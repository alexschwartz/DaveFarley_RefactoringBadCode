package com.cd.bad.code;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.io.SAXReader;

import java.net.URL;

public class MyUtil
{
    public Document getDocument(URL url) {
        try {
            SAXReader reader = new SAXReader();
            return reader.read(url);
        } catch (DocumentException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}
