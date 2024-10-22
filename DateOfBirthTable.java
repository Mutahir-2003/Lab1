package lab_3;

class DateOfBirthTable extends Thread {
    @Override
    public void run() {
        String[] birthDates = {
            "01-January",
            "02-February",
            "03-March",
            "04-April",
            "05-May",
            "06-June",
            "07-July",
            "08-August",
            "09-September",
            "10-October"
        };

        for (String date : birthDates) {
            System.out.println("Date of Birth: " + date);
            try {
                Thread.sleep(1000); // Simulate some processing time
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

