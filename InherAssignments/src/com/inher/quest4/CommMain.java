package com.inher.quest4;

import java.util.Scanner;

public class CommMain {

	public static void main(String[] args) {
		
		Communication communication = null;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Type M of Mail, P for Phone, S for SMS, W for Whatapp");
		
		switch (scanner.next().toLowerCase()) {
		case "m": {
			communication = new MailCommunication();
			communication.sendMessage();
			
			MailCommunication mail = (MailCommunication)communication;
			
			String[] mailTypes = mail.showTypes();
			for (String mailType : mailTypes) {
				System.out.println(mailType);
			}
			break;
		}
		case "p":
			communication = new PhoneCommunication();
			communication.sendMessage();
			
			PhoneCommunication phone = (PhoneCommunication)communication;
			phone.callService();
			break;
		case "s":
			communication = new SMSCommunication();
			communication.sendMessage();
			
			SMSCommunication sms = new SMSCommunication();
			sms.messageLength();
			break;
		case "w":
			communication = new WhatsppCommunication();
			communication.sendMessage();
			
			WhatsppCommunication whatsApp = new WhatsppCommunication();
			whatsApp.otherFeatures();
			break;
		default:
			System.out.println("Invalid Input");
			System.out.println("Type M of Mail, P for Phone, S for SMS, W for Whatapp");
			break;
		}
		scanner.close();
	}
}
