package absfactory;


// abstract Factories
public interface CloudFactory {
    ComputeService createComputeService();
    StorageService createStorageService();
}
