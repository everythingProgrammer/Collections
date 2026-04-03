package builder;

public class ApiErrorResponse {

    private final int  statusCode;
    private final String message;

    private final String errorCode;
    private final String path ;

    private ApiErrorResponse(Builder builder){
        this.statusCode = builder.statusCode;
        this.message = builder.message;
        this.errorCode = builder.errorCode;
        this.path = builder.path;
    }

    public static class Builder{


        // compulsory
        private  int statusCode;
        private  String message;

        // optional set to defaults
        private  String errorCode="";
        private  String path ="";

        public Builder(int statusCode , String message){
            this.statusCode = statusCode;
            this.message = message;
        }

        // setters
        public Builder errorCode(String errorCode){
            this.errorCode = errorCode;
            return this;
        }
        public Builder path (String path){
            this.path = path;
            return this;
        }

        public ApiErrorResponse build(){
            return new ApiErrorResponse(this);
        }
    }
}

/*

builder.ApiErrorResponse apierrorresponse = new builder.ApiErrorResponse.Builder(12,"Error due to something ")
        .errorCode("112")
        .path("/user/abhinav/Bank.class line 21")
        .build();

 */