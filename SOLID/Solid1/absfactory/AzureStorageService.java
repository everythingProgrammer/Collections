package absfactory;

public class AzureStorageService implements StorageService{
    public void storeFile(String filename){
        System.out.println(" Uploading File  "+filename);
    }
}
