package Model;

public class Topic {
	private int topicId;
    private int sId;
    private String topicName;
    private String topicStatus;

    // Default constructor
    public Topic() {
    }

    // Constructor
    public Topic(int topicId, int sId, String topicName, String topicStatus) {
        this.topicId = topicId;
        this.sId = sId;
        this.topicName = topicName;
        this.topicStatus = topicStatus;
    }
    
    public int getTopicId() {
        return this.topicId;
    }

    public int getSId() {
        return this.sId;
    }

    public String getTopicName() {
        return this.topicName;
    }

    public String getTopicStatus() {
        return this.topicStatus;
    }

}
