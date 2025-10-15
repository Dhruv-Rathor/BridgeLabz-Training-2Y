class Model implements Cloneable {
    int id = 1;
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
public class ObjectCloneDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        Model m1 = new Model();
        Model m2 = (Model) m1.clone();
        System.out.println("Clone created with id: " + m2.id);
    }
}
