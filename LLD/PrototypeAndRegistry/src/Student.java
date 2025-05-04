public class Student implements  Prototype<Student> {


    private String name;

    private String batch;

    private double psp;

    private double averageBatchPsp;

    private int age;



    @Override
    public Student clone() {

        Student copy = new Student();
        copy.setName(this.name);
        copy.setBatch(this.batch);
        copy.setPsp(this.psp);
        copy.setAverageBatchPsp(this.averageBatchPsp);
        copy.setAge(this.age);

        return copy;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public double getPsp() {
        return psp;
    }

    public void setPsp(double psp) {
        this.psp = psp;
    }

    public double getAverageBatchPsp() {
        return averageBatchPsp;
    }

    public void setAverageBatchPsp(double averageBatchPsp) {
        this.averageBatchPsp = averageBatchPsp;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
