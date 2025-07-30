class Threat{
    String severity;

    public Threat(String severity){
        this.severity=severity;
    }

    public void displayInfo(){
        System.out.println("Severity: "+this.severity);
    }
}

class Cyberthreat extends Threat{
    String protocol;

    public Cyberthreat(String severity, String protocol){
        super(severity);
        this.protocol=protocol;
    }

    public void showProtocol(){
        System.out.println("Protocol Used: "+this.protocol);
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Threat type: Cyberthreat");
    }
}

public class SecurityScanner{
    public static void main(String[] args) {
        System.out.println("--- UPCASTING EXAMPLE ---");

        Threat upcastThreat = new Cyberthreat("Critical","HTTPS");
        upcastThreat.displayInfo();

        System.out.println("\n--- DOWNCASTING EXAMPLE ---");

        if (upcastThreat instanceof Cyberthreat) {
            Cyberthreat downcastThreat = (Cyberthreat) upcastThreat;
        
        System.out.println("Downcast successful!");
        downcastThreat.displayInfo();
        downcastThreat.showProtocol();
        }
    }
}

