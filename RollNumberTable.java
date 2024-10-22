package lab_3;

class RollNumberTable extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            String rollNumber = String.format("2019-SE-%03d", i);
            System.out.println("Roll Number: " + rollNumber);
            try {
                Thread.sleep(1000); // Simulate some processing time
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

