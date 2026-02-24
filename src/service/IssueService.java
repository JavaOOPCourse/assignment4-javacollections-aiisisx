package service;

import model.Issue;
import java.util.PriorityQueue;
import java.util.Iterator;

public class IssueService {

    private PriorityQueue<Issue> issues = new PriorityQueue<>();

    public void initializeIssues() {
        issues.add(new Issue("problem1", 2));
        issues.add(new Issue("problem2", 1));
        issues.add(new Issue("problem3", 3));
        issues.add(new Issue("problem4", 2));
        issues.add(new Issue("problem5", 4));
    }

    public void showMostUrgent() {
        if (!issues.isEmpty()) {
            System.out.println("Most urgent: " + issues.peek());
        }
    }

    public void resolveIssues() {
        if (!issues.isEmpty()) issues.poll();
        if (!issues.isEmpty()) issues.poll();
    }

    public void printRemainingIssues() {
        Iterator<Issue> iterator = issues.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public void addNewIssue(String description, int urgency) {
        issues.add(new Issue(description, urgency));
    }
}