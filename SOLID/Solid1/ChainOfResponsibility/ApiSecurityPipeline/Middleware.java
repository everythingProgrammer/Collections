package ChainOfResponsibility.ApiSecurityPipeline;

public abstract class Middleware {


    private Middleware next;

    public Middleware setNext( Middleware nextMiddleware){
        next= nextMiddleware;
        return next;
    }


    public boolean checkRequest(String request){
        if(!request.isEmpty()){
            if( next != null)
               return next.checkRequest(request);
            return true;
        }
        return false;
    }


}
