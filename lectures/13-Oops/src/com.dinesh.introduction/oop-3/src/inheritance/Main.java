package inheritance;

public class Main {
    public static void main(String[] args) {
//        Box box = new Box(4.6,7.9,9.9);
//        Box box1 =  new Box(box);
//        System.out.println(box.l + " " + box.h  + " " + box.w);
//
//        BoxWeight box3 = new BoxWeight();
//        BoxWeight box4 = new BoxWeight(2,3,4,5);
//        System.out.println(box3.h + " " + box3.w + " "+ box3.l);
//        System.out.println(box4.h + " " + box4.w + " "+ box4.l + " "+ box4.weight);
//
//
//        // reference of box type referencing to object of boxWeight
//        // reference of parent to child
//        // box5 in stack memory and boxWeight in heap
//      Box box5 = new BoxWeight(2,3,4, 5);


        // there are many variables in both parent and child classes
        // you are given access to variables that are in the ref type i.e. BoxWeight
        // hence, you should have access to weight variable
        // this also means, that the ones you are trying to access should be initialised
        // but here, when the obj itself is of type parent class, how will you call the constructor of child class
        // parent cannot access property of child class
        // this is why error
//        BoxWeight box6 = new Box(2, 3, 4);
//        System.out.println(box6)


BoxPrice box =  new BoxPrice();
BoxPrice box2 =  new BoxPrice(5,6,8);



    }
}


// child can access parent class but parent cannot child
