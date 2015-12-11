package regressionSuiteCore.model;

import javax.persistence.*;

/**
 *
 * @author Dylan McGuire
 */

@Entity
@javax.persistence.Table(name = "test_result", catalog = "TidyTester", uniqueConstraints = {
        @UniqueConstraint(columnNames = "ID") })
public class TestResult {

    private String title;
    private String date;
    private String message;
    private String projectId;
    private String result;
    private String id;


    @Id
    @Column(name = "ID", unique = true, nullable = false)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    @Column(name = "TITLE", unique = false, nullable = false)
    public String getTitle() {
        return title;
    }


    public void setTitle(String title) {
        this.title = title;
    }


    @Column(name = "DATE", unique = false, nullable = false)
    public String getDate() {
        return date;
    }


    public void setDate(String date) {
        this.date = date;
    }


    @Column(name = "MESSAGE", unique = false, nullable = false)
    public String getMessage() {
        return message;
    }


    public void setMessage(String message) {
        this.message = message;
    }


    @Column(name = "PROJECT_ID", unique = false, nullable = false)
    public String getProjectId() {
        return projectId;
    }


    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }


    @Column(name = "RESULT", unique = false, nullable = false)
    public String getResult() {
        return result;
    }


    public void setResult(String result) {
        this.result = result;
    }
}
