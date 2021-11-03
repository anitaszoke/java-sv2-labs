package stringmethods.filename;

import java.util.Locale;

public class FileNameManipulator {

    public char findLastCharacter(String str) {
        String text = str.trim();
        int index = text.length();
        char result = text.charAt(index-1);
        return result;
    }

    public String findFileExtension(String fileName) {
        String file = fileName.trim();
        int index = file.indexOf(".");
        String result = file.substring(index+1);
        return result;
    }

    public boolean identifyFilesByExtension(String ext, String filename) {
        String extension = findFileExtension(filename);
        ext = ext.trim();
        if (ext.equals(extension)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean compareFilesByName(String searchedFileName, String actualFileName) {
        if (searchedFileName.trim().equalsIgnoreCase(actualFileName.trim())) {
            return true;
        } else {
            return false;
        }
    }

    public String changeExtensionToLower(String fileName) {
        String extension = findFileExtension(fileName);
        String result = extension.toLowerCase();
        String name = fileName.substring(0,fileName.lastIndexOf("."));
        result = name +"."+result;
        return result;

    }

    public String replaceStringPart(String fileName, String present, String target) {
        String newFileName = fileName.trim().replace(present,target);
        return newFileName;

    }

    public static void main(String[] args) {
        FileNameManipulator fileName = new FileNameManipulator();

        System.out.println(fileName.findFileExtension(" filename.exe "));
        System.out.println(fileName.findFileExtension("filename.exe"));

        System.out.println(fileName.findLastCharacter(" filename.exe "));
        System.out.println(fileName.identifyFilesByExtension(" exe ","filename.exe "));

        System.out.println(fileName.compareFilesByName("fileName","Filename"));
        System.out.println(fileName.changeExtensionToLower("FileName.EXE"));
        System.out.println(fileName.replaceStringPart("FileName.exe","Name","Text"));
    }
}
