package AssignmentPragra.Assignment4OOPS.ProblemStatement2;

public class Main {
    public static void main(String[] args) {
        Problem2.emailnotificationchannel email = new Problem2.emailnotificationchannel();
        Problem2.SMSNotificationchannel SMS = new Problem2.SMSNotificationchannel();
        Problem2.pushnotificationchannel push = new Problem2.pushnotificationchannel();


        email.sendNotification("Hello Welcome");
        email.settingrecipients("Pragra@gmail.com ");

        SMS.sendNotification("Hi I am sending you a Message through SMS");
        SMS.phonenumber("1234567890");

        push.pushnotifications();
        push.sendNotification("Sending you a message through push notification");

    }

}


