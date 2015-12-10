package regressionSuiteCore.model;

import javax.persistence.*;

/**
 *
 * @author Dylan McGuire
 */

@Entity
@javax.persistence.Table(name = "TEST_RESULT", catalog = "TidyTester")
public class TestResult {

    private String title;
    private String date;
    private String message;
    private String projectId;
    private String result;


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
