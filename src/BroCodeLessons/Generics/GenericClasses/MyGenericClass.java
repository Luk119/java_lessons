package BroCodeLessons.Generics.GenericClasses;

public class MyGenericClass <Thing> {

    Thing x;

    MyGenericClass(Thing x){
        this.x = x;
    }

    public Thing getValue(){
        return x;
    }
}
