package ChainOfResponsibility.ApiSecurityPipeline;

public class AuthorizationMiddleware extends Middleware{


    public boolean checkRequest(String request){

        if(request.contains("admin")){
            System.out.println("Authorization Failure");
            return false;

        }
        return super.checkRequest(request);
    }
}
