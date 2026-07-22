public class classvar {
    int x; 

    public classvar(int x) {
        this.x = x;
    }

    public void display() {
        System.out.println("Value of x: " + this.x);
    }

    public static void main(String[] args) {
        classvar obj = new classvar(10);
        obj.display(); 
    }
}