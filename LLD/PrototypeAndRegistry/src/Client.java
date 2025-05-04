public class Client {

    public static void fillRegistry(StudentRegistry registry){
        Student aprBatch = new Student();
        aprBatch.setBatch("APR 22");
        aprBatch.setAverageBatchPsp(88.3);

        registry.registerStudent("april21Batch", aprBatch);

        IntellegentStudent is = new IntellegentStudent();
        is.setBatch("APR 21");
        is.setAverageBatchPsp(88.0);
        is.setIq(180);


        registry.registerStudent("april21IntelligentBatch", is);
    }

    public static void main(String[] args) {
        StudentRegistry studentRegistry = new StudentRegistry();
        fillRegistry(studentRegistry);

        // Registry is returning a prototypeObject , so use clone to get a cloned object
        // because we don't want to touch the prototype.
        Student vignesh = studentRegistry.get("april21Batch").clone();
        vignesh.setName("Vignesh");
        vignesh.setAge(21);
        vignesh.setPsp(9.0);


        Student sabhual = studentRegistry.get("apr21IntegelligentBatch").clone();
        sabhual.setName("Sabhual");
        sabhual.setAge(22);
        sabhual.setPsp(9.5);
        ((IntellegentStudent) sabhual).setIq(200);


        System.out.println("DEBUG ");


    }

}
