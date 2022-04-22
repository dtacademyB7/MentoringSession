package april22;

public class Super {

    private int num;
    private String name;
    private long id;

   public Super(){}  // add this to prevent subclass compiler issues

    public Super(int num, String name, long id) {
        this.num = num;
        this.name = name;
        this.id = id;

    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return
                "num=" + num +
                ", name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
