package proxy;

public class RealDocumentService implements DocumentService{


    @Override
    public void downloadDocument(String documentId) {
        System.out.println("downloading document "+documentId);
    }
}
