package oop.src.com.dinesh.Interface.Interfaces;

public class NiceCar
{
    private Engine engine;
    private Media player = new CDPlayer();


    // default constructor - When a new NiceCar object is created without any arguments, this constructor initializes its engine to be a PowerEngine.
    public NiceCar(){
        engine =  new PowerEngine();
    }

    // it allows you to initialize a NiceCar object with a specific engine of your choice.
    public NiceCar(Engine engine){
        this.engine =  engine;
    }

    public  void start(){
        engine.start();
    }

    public void stops(){
        engine.start();
    }

    public  void startMusic(){
        player.start();
    }

    public void  stopMusic(){
        player.stop();
    }

    public  void upgradeEngine(){
        this.engine = engine;
    }

}
