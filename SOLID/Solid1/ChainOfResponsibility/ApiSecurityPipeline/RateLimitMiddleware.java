package ChainOfResponsibility.ApiSecurityPipeline;

public class RateLimitMiddleware extends Middleware {

    public boolean checkRequest(String request){
        if(  request.contains("spam")){
            return false;
        }
        return super.checkRequest(request);
    }

}
