package AssignmentPragra.Assignment4OOPS.ProblemStatement2;

public interface Problem2 {


    public interface NotificationSender {
        void sendNotification(String message);
    }

    public interface EmailNotification extends NotificationSender {
        public void settingrecipients(String recipients);


    }

    public interface SMSNotification extends NotificationSender {
        void phonenumber(String phonenumber);

    }

    public interface PushNotification extends NotificationSender {
        void pushnotifications();
    }

    public static class emailnotificationchannel implements EmailNotification, NotificationSender {


        public void sendNotification(String message) {
            System.out.println("Sending EmailMessage" + message);

        }


        public void settingrecipients(String recipients) {
            System.out.println("sending recipients " + recipients);

        }
    }

    public static class SMSNotificationchannel implements SMSNotification, NotificationSender {


        public void sendNotification(String message) {
            System.out.println("Sending SMS Message" + message);

        }


        public void phonenumber(String phonenumber) {
            System.out.println("Setting phonenuber" + phonenumber);

        }
    }

    public static class pushnotificationchannel implements PushNotification, NotificationSender {


        public void sendNotification(String message) {
            System.out.println("Sending pushnotification" + message);
        }


        public void pushnotifications() {
            System.out.println(" New pushNotification");

        }
    }


}




