package service;

import model.Issue;
import java.util.PriorityQueue;
import java.util.Iterator;

public class IssueService {

    private PriorityQueue<Issue> issues = new PriorityQueue<>();

    public void initializeIssues() {
        // TODO: Add at least 5 issues
    }

    public void showMostUrgent() {
        // TODO: Show most urgent issue
    }

    public void resolveIssues() {
        // TODO: Remove 2 issues
    }

    public void printRemainingIssues() {
        // TODO: Print using iterator
    }

    public void addNewIssue(String description, int urgency) {
        // TODO: Add new issue
    }
}
