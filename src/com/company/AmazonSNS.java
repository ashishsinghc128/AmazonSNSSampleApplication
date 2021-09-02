package com.company;

import Amazonsns.java.AmazonSNSClient;

/**
 * Created by ashish singh chauhan
 */
public class AmazonSNS
        {
    public static void main(String[] args) {
        // Your Credentials
        String ACCESS_KEY = "import com.amazonaws.auth.BasicAWSCredentials;\n" +
                "import com.amazonaws.services.sns.AmazonSNSClient;\n" +
                "import com.amazonaws.services.sns.model.PublishRequest;\n" +
                "import com.amazonaws.services.sns.model.PublishResult;\n" +
                "/**\n" +
                " * Created by anuragdhunna\n" +
                " */\n" +
                "public class AmazonSNS {\n" +
                "    public static void main(String[] args) {\n" +
                "        // Your Credentials\n" +
                "        String ACCESS_KEY = \"YOUR_API_KEY\";\n" +
                "        String SECRET_KEY = \"YOUR_SECRET_KEY\";\n" +
                "        AmazonSNSClient snsClient = new AmazonSNSClient(new  BasicAWSCredentials(ACCESS_KEY, SECRET_KEY));\n" +
                "        String message = \"YOUR MESSAGE\";\n" +
                "        String phoneNumber = \"PHONE_NUMBER\";  // Ex: +91XXX4374XX\n" +
                "        sendSMSMessage(snsClient, message, phoneNumber);\n" +
                "    }\n" +
                "    // Send SMS to a Phone Number\n" +
                "    public static void sendSMSMessage(AmazonSNSClient snsClient,\n" +
                "                          String message, String phoneNumber) {\n" +
                "    PublishResult result = snsClient.publish(new PublishRequest()\n" +
                "                .withMessage(message)\n" +
                "                .withPhoneNumber(phoneNumber));\n" +
                "        System.out.println(result); // Prints the message ID.\n" +
                "    }\n" +
                "}";
        String SECRET_KEY = "import com.amazonaws.auth.BasicAWSCredentials;\n" +
                "import com.amazonaws.services.sns.AmazonSNSClient;\n" +
                "import com.amazonaws.services.sns.model.PublishRequest;\n" +
                "import com.amazonaws.services.sns.model.PublishResult;\n" +
                "/**\n" +
                " * Created by anuragdhunna\n" +
                " */\n" +
                "public class AmazonSNS {\n" +
                "    public static void main(String[] args) {\n" +
                "        // Your Credentials\n" +
                "        String ACCESS_KEY = \"YOUR_API_KEY\";\n" +
                "        String SECRET_KEY = \"YOUR_SECRET_KEY\";\n" +
                "        AmazonSNSClient snsClient = new AmazonSNSClient(new  BasicAWSCredentials(ACCESS_KEY, SECRET_KEY));\n" +
                "        String message = \"YOUR MESSAGE\";\n" +
                "        String phoneNumber = \"PHONE_NUMBER\";  // Ex: +91XXX4374XX\n" +
                "        sendSMSMessage(snsClient, message, phoneNumber);\n" +
                "    }\n" +
                "    // Send SMS to a Phone Number\n" +
                "    public static void sendSMSMessage(AmazonSNSClient snsClient,\n" +
                "                          String message, String phoneNumber) {\n" +
                "    PublishResult result = snsClient.publish(new PublishRequest()\n" +
                "                .withMessage(message)\n" +
                "                .withPhoneNumber(phoneNumber));\n" +
                "        System.out.println(result); // Prints the message ID.\n" +
                "    }\n" +
                "}";
        AmazonSNSClient snsClient = new AmazonSNSClient(new  BasicAWSCredentials(ACCESS_KEY, SECRET_KEY));
        String message = "hello, this is ashish singh chauhan";
        String phoneNumber = "6321231231";  // Ex: +91XXX4374XX
        sendSMSMessage(snsClient, message, phoneNumber);
    }
    // Send SMS to a Phone Number
    public static void sendSMSMessage(AmazonSNSClient snsClient,
                                      String message, String phoneNumber) {
        PublishResult result = snsClient.publish(new PublishRequest()
                .withMessage(message)
                .withPhoneNumber(phoneNumber));
        System.out.println(result); // Prints the message ID.
    }
}