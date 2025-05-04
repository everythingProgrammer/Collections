public class IntellegentStudent extends Student{
    private int iq;


    @Override
    public IntellegentStudent clone(){
        IntellegentStudent copy = new IntellegentStudent();
        copy.setName(this.getName());
        copy.setBatch(this.getBatch());
        copy.setPsp(this.getPsp());
        copy.setAverageBatchPsp(this.getAverageBatchPsp());
        copy.setAge(this.getAge());

        copy.setIq(this.iq);


        return copy  ;
    }


    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }
}
