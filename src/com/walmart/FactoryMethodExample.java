package com.walmart;

//Document Interface
interface Document{
    void open ();
    void save ();
}
//Concrete TestDocument Class
class TextDocument implements Document{

    @Override
    public void open() {
        System.out.println("Text Document is Open");
    }

    @Override
    public void save() {
        System.out.println("Text Document is closed.");
    }
}

//Concrete class
class SpreadSheetDocument implements Document{

    @Override
    public void open() {
        System.out.println("SpreadSheet Document is Open");
    }

    @Override
    public void save() {
        System.out.println("SpreadSheet Document is Saved.");
    }
}

//Document Factory Interface
interface DocumentFactory {
    Document createDocument ();
}
//Concrete textDocumentFactory class
class TextDocumentFactory implements DocumentFactory{

    @Override
    public Document createDocument() {
        return new TextDocument();
    }
}
// Concrete SpreadsheetDocumentFactory class
class SpreadsheetDocumentFactory implements DocumentFactory {
    @Override
    public Document createDocument() {
        return new SpreadSheetDocument();
    }
}
public class FactoryMethodExample {
    public static void main(String[] args) {
        // Using TextDocumentFactory to create a TextDocument
        DocumentFactory textDocumentFactory = new TextDocumentFactory();
        Document textDocument = textDocumentFactory.createDocument();
        textDocument.open();
        textDocument.save();

        // Using SpreadsheetDocumentFactory to create a SpreadsheetDocument
        DocumentFactory spreadsheetDocumentFactory = new SpreadsheetDocumentFactory();
        Document spreadsheetDocument = spreadsheetDocumentFactory.createDocument();
        spreadsheetDocument.open();
        spreadsheetDocument.save();
    }
}
