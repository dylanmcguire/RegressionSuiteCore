package regressionSuiteCore.model;

/**
 * Created by dylan on 6/9/15.
 */
public class TestResult {

    private String title;
    private String date;
    private String message;
    private int    projectId;
    private String result;


    public String getTitle() {
        return title;
    }


    public void setTitle(String title) {
        this.title = title;
    }


    public String getDate() {
        return date;
    }


    public void setDate(String date) {
        this.date = date;
    }


    public String getMessage() {
        return message;
    }


    public void setMessage(String message) {
        this.message = message;
    }


    public int getProjectId() {
        return projectId;
    }


    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }


    public String getResult() {
        return result;
    }


    public void setResult(String result) {
        this.result = result;
    }
}
