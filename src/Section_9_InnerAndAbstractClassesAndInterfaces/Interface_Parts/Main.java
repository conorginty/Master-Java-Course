package Section_9_InnerAndAbstractClassesAndInterfaces.Interface_Parts;

public class Main {
    public static void main(String[] args) {
//        ITelephone timsPhone; // Also valid
        // Above is useful if we later want to re-assign timsPhone from DeskPhone -> MobilePhone
        DeskPhone timsPhone = new DeskPhone("087-1234567");
        timsPhone.powerOn();
        timsPhone.callPhone("087-1234567");
        timsPhone.answer();
        System.out.println("==============");

        ITelephone mobilePhone;
        mobilePhone = new MobilePhone("086-6661234");
        mobilePhone.callPhone("086-6661234");
        mobilePhone.answer();
    }
}
