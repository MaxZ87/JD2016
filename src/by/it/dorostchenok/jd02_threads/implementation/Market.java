package by.it.dorostchenok.jd02_threads.implementation;

import java.util.concurrent.ConcurrentLinkedQueue;

public class Market {
    public final static int customersToServe = 100;
    private static int customerServed = 0;
    private static int cashDeskcount = 0;
    private static final ConcurrentLinkedQueue<Customer> customerLine = new ConcurrentLinkedQueue();

    private static int revenue = 0;

    public static synchronized int getRevenue() {
        return revenue;
    }

    public static synchronized void addRevenue(int amount) {
        revenue += amount;
    }

    public static synchronized void incrementCashDeskcount(){
        cashDeskcount++;
    }

    public static synchronized void decrementCashDeskcount(){
        cashDeskcount--;
    }

    public static synchronized int getCashDeskcount(){
        return cashDeskcount;
    }


    public static boolean closeTheMarket(){
        if (getCustomerServed() >= customersToServe){
            System.out.println("\nMarket is closed! Total revenue: " + Market.getRevenue());
            return true;
        } else {
            return false;
        }
    }

    public static synchronized void incrementServedCustomers(){
        customerServed++;
    }

    private static synchronized int getCustomerServed(){
        return customerServed;
    }

    public static void addCustomerToLine(Customer customer){
        customerLine.add(customer);
        System.out.println("Q size " + customerLine.size());
    }

    public static Customer getCustomerFromLine(){
        if (customerLine.isEmpty()){
            return null;
        } else {
            return customerLine.poll();
        }
    }

    public static boolean isEmpty(){
        return customerLine.isEmpty();
    }

    public static int getCustomerLineSize(){
        return customerLine.size();
    }
}
