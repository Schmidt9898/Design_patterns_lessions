package compositeEx1;

import java.util.ArrayList;

public class Directory implements entry{
    private final String name;
    private final ArrayList<entry> includedFiles = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    public void add(entry obj) {
        includedFiles.add(obj);
    }

    public void ls() {
        ls(0);
    }
    public void ls(int depth) {
        System.out.println(new String(new char[3*depth]).replace('\0', ' ') + name);
        depth += 1;
        for (entry obj : includedFiles) {
            obj.ls(depth);
        }
    }
}