package org.example;

import javax.print.Doc;
import java.util.List;
import java.util.Timer;

public class Services {

    //Γιατί δεν κάνω extent Doctor στην κλάση?
    // Δεν το κάνω γιατί δεν έχει νόημα
    // Αν κάνω public class Service extend Doctor Σημαίνει ότι η υπηρεσία είναι ένας γιατρός
    // Αλλά μια υπηρεσία δεν είναι γιατρός
    // είναι κάτι ξεχωριστό που σχετίζεται με του γιατρούς
    // δηλαδή μπορούνε να την παρέχουν αλλά δεν είναι υποκατηγορία τους
    // Άρα:
    // Η Service συσχετίζεται με Doctor μέσω List<Doctor>
    // Δεν "είναι" Doctor άρα δεν πρέπει να κληρονομήσει από αυτόν

    private String duration;

    // βάζω λίστα γιατί η εκφώνηση λέει ότι πολλοί γιατροί μπορούν να προσφέρουν υπηρεσίες
    // απο την στιγμή που χρησιμοποιεί πληθυντικό σημαίνει πολλά
    private List<Doctor> doctor;

    private String description;

    public Services(String duration, List<Doctor> doctor, String description) {
        this.duration = duration;
        this.doctor = doctor;
        this.description = description;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public List<Doctor> getDoctor() {
        return doctor;
    }

    public void setDoctor(List<Doctor> doctor) {
        this.doctor = doctor;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}