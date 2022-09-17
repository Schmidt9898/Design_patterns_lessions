package compositeEx1;

public class File implements entry{
    private final String name;

    public File(String name) {
        this.name = name;
    }

    public void ls() {
        ls(0);
    }

    public void ls(int depth) {
        System.out.println(new String(new char[3*depth]).replace('\0', ' ') + name);
    }
}