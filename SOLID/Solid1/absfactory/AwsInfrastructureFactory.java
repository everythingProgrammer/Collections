package absfactory;

// Its a cloudFactory
public class AwsInfrastructureFactory implements CloudFactory{
    public ComputeService createComputeService(){
        return new AwsComputeService();
    }
    public StorageService createStorageService(){
        return new AwsStorageService();
    }

}
