import java.util.*;

class Message {
    private final String content;
    private final String sender;
    private final String recipient;

    public Message(String content, String sender, String recipient) {
        this.content = content;
        this.sender = sender;
        this.recipient = recipient;
    }

    // Getters for message properties
    public String getContent() {
        return content;
    }

    public String getSender() {
        return sender;
    }

    public String getRecipient() {
        return recipient;
    }

    public void printSummary() {
        System.out.println("Content: " + content);
        System.out.println("Sender: " + sender);
        System.out.println("Recipient: " + recipient);
    }

    public void printDetails() {
        printSummary(); // Call printSummary to avoid duplicate logic
        System.out.println("Content Length: " + content.length());
        System.out.println("Sender Uppercase: " + sender.toUpperCase());
        System.out.println("Recipient Lowercase: " + recipient.toLowerCase());
    }
}

class MessagingService {
    private final Map<String, List<Message>> inbox;

    public MessagingService() {
        this.inbox = new HashMap<>();
    }

    public void sendMessage(String content, String sender, String recipient) {
        Message message = new Message(content, sender, recipient);
        inbox.computeIfAbsent(message.getRecipient(), k -> new ArrayList<>()).add(message);
    }

    public List<Message> getMessagesForRecipient(String recipient) {
        // Use Collections.emptyList() for efficiency
        return inbox.getOrDefault(recipient, Collections.emptyList());
    }

    public void printAllMessagesGroupedByRecipient() {
        inbox.forEach((recipient, messages) -> {
            System.out.println("Messages for: " + recipient);
            messages.forEach(Message::printSummary);
            System.out.println("--------------------");
        });
    }
}

public class Main {
    public static void main(String[] args) {
        MessagingService messagingService = new MessagingService();

        // Sending messages
        messagingService.sendMessage("Hello, tenant!", "Property Manager", "Tenant A");
        messagingService.sendMessage("Important notice: Rent due next week.", "Property Owner", "Tenant A");
        messagingService.sendMessage("Maintenance request received.", "Tenant A", "Property Manager");

        // Retrieving messages for a recipient
        List<Message> tenantAMessages = messagingService.getMessagesForRecipient("Tenant A");
        System.out.println("Messages for Tenant A:");
        tenantAMessages.forEach(message -> 
            System.out.println("From: " + message.getSender() + ", Content: " + message.getContent())
        );

        // Printing message details
        Message exampleMessage = new Message("Test", "Sender", "Recipient");
        System.out.println("\nMessage Details:");
        exampleMessage.printDetails();

        // Print all messages grouped by recipient
        System.out.println("\nAll Messages:");
        messagingService.printAllMessagesGroupedByRecipient();
    }
}
