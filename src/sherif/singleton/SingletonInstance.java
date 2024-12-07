package sherif.singleton;

public class SingletonInstance {

    static SingletonInstance singletonInstance;

    private SingletonInstance(){
        System.out.println("Singleton Instance");
    }


    public static SingletonInstance getInstance(){
        if(singletonInstance ==null)
            return new SingletonInstance();
        else
            return singletonInstance;
    }
}
