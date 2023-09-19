package src.com.dinesh.Intro;

public class NumbersRecursionExample {
    public static void main(String[] args) {
        print(1);
    }
    // call itself
    static void print (int n ){
        // why is this base condition added
        // why this check is added

        // if there is not this condition it will keep going , we are not stopping this case
        // inorder to stop we need base condition =? condition where recursion will make stop if calls
        if(n==5){
            return;
        }
        System.out.println(n);

    // the generalized form
        // this is last function call is called tail recursion

    print(n+1);
    }
}

/*
every function call is taking separate memory
// no base condition means function call will keep happening
// stack will be filled again and again and taking memory
// one time will comes when memory of computer exceeds the limit => this is going to give  stack overflow
 */