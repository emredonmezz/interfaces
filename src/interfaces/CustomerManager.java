package interfaces;

public class CustomerManager {
    private Logger[] loggers;

    public CustomerManager(Logger[] loggers) {
        this.loggers = loggers;
    }

    public void add(Customer customer) {
        System.out.println("Müşteri Eklendi : " + customer.getFirstName());

        Utils.runLoggers(loggers, customer.getFirstName());
    }
    public void delele(Customer customer){
        System.out.println("Müşteri Silindi : " + customer.getFirstName());
        Utils.runLoggers(loggers, customer.getFirstName());
    }
}
