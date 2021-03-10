package Section_9_InnerAndAbstractClassesAndInterfaces.Interface_Parts;

public class DeskPhone implements ITelephone{

    private String myNumber;
    private boolean isRinging;

    public DeskPhone(String myNumber) {
        this.myNumber = myNumber;
        isRinging = false;
    }

    @Override
    public void powerOn() {
        System.out.println("No action taken. Desk phone has no power button");
    }

    @Override
    public void dial(String phoneNumber) {
        System.out.println("Now ringing: " + phoneNumber + " on desk phone");
    }

    @Override
    public void answer() {
        if (isRinging) {
            System.out.println("Answering the desk phone");
            isRinging = false; // because we've answered it
        }
    }

    @Override
    public boolean callPhone(String phoneNumber) {
        // I DON'T REALLY GET THE FUNCTION OF THIS METHOD, MAYBE THE METHOD NAME IS MISLEADING???
        // IT LOOKS TO ME LIKE WE ARE CALLING OURSELF, WHICH MAKES NO SENSE
        if (phoneNumber.equals(myNumber)) {
            isRinging = true;
            System.out.println("Ring ring");
        } else {
            isRinging = false;
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
