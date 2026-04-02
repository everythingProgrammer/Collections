package absfactory;

public class AwsComputeService implements ComputeService{

    public void startInstance() {
        System.out.println("Starting AWS EC2 instance");
    }
}
