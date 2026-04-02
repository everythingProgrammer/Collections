package absfactory;

public class AzureInfrastrcutureFactory implements CloudFactory{


    public ComputeService createComputeService() {
        return new AzureComputeService();
    }

    public StorageService createStorageService() {
        return new AzureStorageService();
    }
}
