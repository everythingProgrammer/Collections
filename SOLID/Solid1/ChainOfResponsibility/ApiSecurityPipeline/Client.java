package ChainOfResponsibility.ApiSecurityPipeline;

public class Client {


    public static void main(String args[]){


        String request  = "token_user_request";
        String request2  = "spam_admin_request";

        AuthenticationMiddleware auth = new AuthenticationMiddleware();
        AuthorizationMiddleware auth2 = new AuthorizationMiddleware();
        RateLimitMiddleware rml = new RateLimitMiddleware();

//        rml.setNext(auth);
//        auth.setNext(auth2);

        rml.setNext(auth).setNext(auth2);

        System.out.println(rml.checkRequest(request2));

    }
}
