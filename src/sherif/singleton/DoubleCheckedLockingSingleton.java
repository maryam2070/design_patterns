package sherif.singleton;


//with multiple threads

public class DoubleCheckedLockingSingleton {

    // visible from all other threads
    volatile static DoubleCheckedLockingSingleton doubleCheckedLockingSingleton;

    private DoubleCheckedLockingSingleton(){
        System.out.println("Double Checked Locking Singleton");
    }

    public static DoubleCheckedLockingSingleton getInstance(){

        if(doubleCheckedLockingSingleton==null){ //check with no lock on thread
            synchronized (DoubleCheckedLockingSingleton.class){
                if(doubleCheckedLockingSingleton==null)//check with lock to ensure only one thread can make instantiation
                    doubleCheckedLockingSingleton = new DoubleCheckedLockingSingleton();
            }
        }
        return doubleCheckedLockingSingleton;
    }
}
