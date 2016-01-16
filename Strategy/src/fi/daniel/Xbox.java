package fi.daniel;

public class Xbox {

    private final Storage mStorage;

    public Xbox(Storage mStorage) {
        this.mStorage = mStorage;
    }

    public void saveData(){
        mStorage.save("data");
    }
}
