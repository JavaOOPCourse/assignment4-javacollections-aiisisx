package service;

import java.util.LinkedList;
import java.util.Iterator;

public class AppointmentService {

    private LinkedList<String> appointments = new LinkedList<>();

    public void initializeAppointments() {
        appointments.add("Consultation A");
        appointments.add("Consultation B");
        appointments.add("Consultation C");
        appointments.addFirst("URGENT Consultation");
    }

    public void cancelLast() {
        if (!appointments.isEmpty()) {
            appointments.removeLast();
        }
    }

    public void showFirstAndLast() {
        if (!appointments.isEmpty()) {
            System.out.println("First: " + appointments.getFirst());
            System.out.println("Last: " + appointments.getLast());
        }
    }

    public void printAppointments() {
        Iterator<String> iterator = appointments.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}