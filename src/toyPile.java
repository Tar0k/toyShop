public class toyPile {

    private int id;
    private String name;
    private int dropRate;


    public toyPile(int id, String name, int dropRate)
    {
        this.id = id;
        this.name = name;
        this.dropRate = dropRate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDropRate() {
        return dropRate;
    }

    public void setDropRate(int dropRate) {
        this.dropRate = dropRate;
    }
}
