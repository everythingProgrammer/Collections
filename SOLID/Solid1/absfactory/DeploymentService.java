package absfactory;

import java.util.concurrent.Callable;

public class DeploymentService {

    private final CloudFactory factory;
    public DeploymentService(CloudFactory factory){
        this.factory = factory;
    }
    public void deploy(){
        ComputeService computeService = factory.createComputeService();
        StorageService storageService = factory.createStorageService();

        computeService.startInstance();
        storageService.storeFile("Something file name ");


    }

}
