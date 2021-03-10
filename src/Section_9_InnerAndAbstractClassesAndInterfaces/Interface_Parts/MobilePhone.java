package Section_9_InnerAndAbstractClassesAndInterfaces.Interface_Parts;

public class MobilePhone implements ITelephone {
    private String myNumber;
    private boolean isRinging;
    private boolean isOn;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        isRinging = false;
        isOn = false;
    }

    @Override
    public void powerOn() {
        isOn = true;
        System.out.println("Mobile phone powered on");
    }

    @Override
    public void dial(String phoneNumber) {
        if (isOn) {
            System.out.println("Now ringing: " + phoneNumber + " on mobile phone");
        } else {
            System.out.println("Mobile phone is switched off");
        }
    }

    @Override
    public void answer() {
        if (isRinging) {
            System.out.println("Answering the mobile phone");
            isRinging = false; // because we've answered it
        }
    }

    @Override
    public boolean callPhone(String phoneNumber) {
        // I DON'T REALLY GET THE FUNCTION OF THIS METHOD, MAYBE THE METHOD NAME IS MISLEADING???
        // IT LOOKS TO ME LIKE WE ARE CALLING OURSELF, WHICH MAKES NO SENSE
        if (phoneNumber.equals(myNumber) && isOn) {
            isRinging = true;
            System.out.println("Melodic Ringtone playing...");
        } else {
            System.out.println("Mobile phone is not on or number is different");
            isRinging = false;
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
