package ChainOfResponsibility.ApiSecurityPipeline;

public class    AuthenticationMiddleware extends Middleware{



    public boolean checkRequest(String request){

        if(!request.contains("token")){
            return false;
        }
        return super.checkRequest(request);
    }


}
