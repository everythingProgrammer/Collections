package proxy;

public class DocumentServiceProxy implements DocumentService {

    /*
        Always use abstraction instead of absolute concrete layer
     */
    private final DocumentService realDocumentService;

    /*

     */
    private final String userRole;

    public DocumentServiceProxy(RealDocumentService realDocumentService, String userRole) {
        this.realDocumentService = realDocumentService;
        this.userRole = userRole;
    }


    @Override
    public void downloadDocument(String documentId) {

        /*
            Explicit Allow List >>> Deny List ,
            for example here if user Role comes CEO then it will allow , but that's not mentioned in original requirement.
            Also throw exception when you want to show denied behaviour .
            Also Null safety needs to checked here what if userRole comes null ...
         */
        if(this.userRole.equalsIgnoreCase("EMPLOYEE") ){
            System.out.println(" Denied");
        }else{
            realDocumentService.downloadDocument(documentId);
        }
    }
}
