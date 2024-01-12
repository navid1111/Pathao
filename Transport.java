public class Transport extends Services {
    public String destination;

    public Transport(String location, Integer ID, Integer cost,String destination) {
        super(location, ID, cost);
        this.destination=destination;
    }
}
