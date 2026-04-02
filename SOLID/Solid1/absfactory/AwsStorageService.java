package absfactory;

public class AwsStorageService implements StorageService{

    public void storeFile(String name) {
        System.out.println("Storing file "+name);
    }
}
