package oop.src.com.dinesh.accessControl;

public class SubClass extends A{
    public SubClass(int num, String name, int marks) {
        super(num, name, marks);
    }

    public static void main(String[] args) {
        A obj  = new A(10, "Dinesh", 98);
        String accessDefaultInsideSubClassSamePackage = obj.name;
        int accessDefaultInsideSubClassSamePackagemarks = obj.marks;
        System.out.println(accessDefaultInsideSubClassSamePackage); // can access DefaultInsideSubClassSamePackage
        System.out.println(accessDefaultInsideSubClassSamePackagemarks); // can access protected with in same package
    }
}
