package structural;
import java.util.HashSet;
import java.util.Set;
public class HealthcareWorkerTeam implements HealthcareServiceable {
    private Set<HealthcareServiceable> members = new HashSet<HealthcareServiceable>();

    public void addMember(HealthcareServiceable member){
        members.add(member);
    }

    public void removeMember(HealthcareServiceable member){
        members.remove(member);
    }

    public void service(){
        for (HealthcareServiceable healthcareServiceable : members) {
            healthcareServiceable.service();
        }
    }

    public double getPrice(){
        double total = 0;
        for (HealthcareServiceable healthcareServiceable : members) {
            total += healthcareServiceable.getPrice();
        }
        return total;
    }
}