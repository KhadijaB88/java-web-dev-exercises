package technology;

public class AbstractEntity {
    private static int uniqueID = 1;
    private final int ID;

    public AbstractEntity() {
        this.ID = uniqueID;
        uniqueID++;
    }

    public int getUniqueID() {
        return ID;
    }

}

