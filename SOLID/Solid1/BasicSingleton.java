


// Lazy Initialization

public class BasicSingleton {


    private static BasicSingleton instance;




    // Private Constructor , prevents instantiation from other classes
    private BasicSingleton(){}

    // Global Access point
    public static BasicSingleton getInstance(){
        synchronized(BasicSingleton.class){
            if(instance==null){
                instance = new BasicSingleton(); // DangerZone in multithreading
            }
            return instance;
        }
    }

    /*
The Interviewer's Trap: They will ask, "What happens if two threads call getInstance() at the exact same millisecond?"
Your Answer: Both threads might evaluate if (instance == null) to true simultaneously,
resulting in two separate objects being created in memory. This breaks the Singleton contract.
     */



}
