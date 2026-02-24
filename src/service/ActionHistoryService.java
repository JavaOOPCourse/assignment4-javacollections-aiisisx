package service;

import java.util.ArrayDeque;
import java.util.Iterator;
public class ActionHistoryService {

    private ArrayDeque<String> actions = new ArrayDeque<>();

    public void initializeActions() {
        actions.add("Submitted Assignment");
        actions.add("Dropped Course");
        actions.add("Registered Course");
        actions.add("Updated Profile");
    }

    public void undoLastAction() {
        if (!actions.isEmpty()) {
            System.out.println("Removed: " + actions.removeLast());
        }
    }

    public void addRequestedTranscript() {
        actions.add("Requested Transcript");
    }

    public void showFirstAndLast() {
        if (!actions.isEmpty()) {
            System.out.println("First: " + actions.peekFirst());
            System.out.println("Last: " + actions.peekLast());
        }
    }

    public void printHistory() {
        Iterator<String> iterator = actions.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}