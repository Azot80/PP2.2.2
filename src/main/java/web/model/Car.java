package web.model;

public class Car {
    private long id;
    private String producer;
    private String model;

    public Car(long id, String producer, String model) {
        this.id = id;
        this.producer = producer;
        this.model = model;
    }

    public long getId() {
        return id;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
