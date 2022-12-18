package task_Image;

public class ProxyImage implements MyImage{
    private String path;

    public ProxyImage(String path){
        this.path = path;
    }

    @Override
    public void display() {
        new RealImage(path).display();
    }
}
