package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import Model.Topic;
import util.DBconnection;

public class TopicDAO {

    // Add a topic

    public void addTopic(Topic topic) {

        String query = """
                INSERT INTO topic
                (TOPIC_ID, S_ID, TOPIC_NAME, TOPIC_STATUS)
                VALUES (?, ?, ?, ?)
                """;

        try {

            Connection con = DBconnection.getDBConnection();

            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1, topic.getTopicId());
            ps.setInt(2, topic.getSId());
            ps.setString(3, topic.getTopicName());
            ps.setString(4, topic.getTopicStatus());

            int row = ps.executeUpdate();

            if (row > 0) {
                System.out.println("Topic added successfully");
            }

            ps.close();
            con.close();

        } catch (Exception e) {

            System.out.println(
                "Error occurred at TopicDAO while adding: " + e
            );
        }
    }


    // Delete a topic

    public void deleteTopic(Topic topic) {

        String query = """
                DELETE FROM topic
                WHERE TOPIC_ID = ?
                """;

        try {

            Connection con = DBconnection.getDBConnection();

            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1, topic.getTopicId());

            int row = ps.executeUpdate();

            if (row > 0) {
                System.out.println("Topic deleted successfully");
            }

            ps.close();
            con.close();

        } catch (Exception e) {

            System.out.println(
                "Error occurred at TopicDAO while deleting: " + e
            );
        }
    }


    // Get a topic by ID

    public Topic getTopicById(Topic topic) {

        Topic topic1 = null;

        String query = """
                SELECT *
                FROM topic
                WHERE TOPIC_ID = ?
                """;

        try {

            Connection con = DBconnection.getDBConnection();

            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1, topic.getTopicId());

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                topic1 = new Topic(
                    rs.getInt("TOPIC_ID"),
                    rs.getInt("S_ID"),
                    rs.getString("TOPIC_NAME"),
                    rs.getString("TOPIC_STATUS")
                );
            }

            rs.close();
            ps.close();
            con.close();

            return topic1;

        } catch (Exception e) {

            System.out.println(
                "Error occurred at TopicDAO while retrieving: " + e
            );
        }

        return null;
    }
}
