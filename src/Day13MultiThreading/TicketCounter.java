package Day13MultiThreading;

class TicketCounter {
    private int ticketsAvailable = 5;
    private int currentTicketNumber = 1;

    public synchronized void sellTicket(String threadName) {
        if (ticketsAvailable > 0) {
            System.out.println(threadName + " successfully booked Ticket #" + currentTicketNumber);
            currentTicketNumber++;
            ticketsAvailable--;
        } else {
            System.out.println(threadName + " checked: Sold out!");
        }
    }

    public synchronized int getTicketsAvailable() {
        return ticketsAvailable;
    }
}

class MovieBookingSystem {
    public static void main(String[] args) {
        TicketCounter counter = new TicketCounter();
        Thread producer = new Thread(() -> {
            for (int i = 0; i < 6; i++) {
                counter.sellTicket("Producer System");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        });

        Thread consumer = new Thread(() -> {
            for (int i = 0; i < 6; i++) {
                counter.sellTicket("Customer");
                try {
                    Thread.sleep(120);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        });

        producer.start();
        consumer.start();
    }
}

