public class Mobile
{
    String deviceModel;
    String deviceColor;
    String OsVersion;
    String deviceRefNo;

    //Default Constructor
    Mobile()
    {
        deviceModel = "Oppo Find X6 Pro";
        deviceColor = "Silver Gray";
        OsVersion = "Android 13, ColorOS 13.1";
        deviceRefNo = "REF-OP-X6P-9821";
    }

    //Parameterized Constructor
    Mobile(String dModel, String dColor, String os, String deviceRef)
    {
        deviceModel = dModel;
        deviceColor = dColor;
        OsVersion = os;
        deviceRefNo = deviceRef;
    }

    //Copy Constructor
    Mobile(Mobile obj)
    {
        this.deviceModel = obj.deviceModel ;
        this.deviceColor = obj.deviceColor;
        this.OsVersion = obj.OsVersion;
        this.deviceRefNo = obj.deviceRefNo;
    }

    void print()
    {
        System.out.println("MOBILE MODEL: "+deviceModel);
        System.out.println("DEVICE COLOR: "+deviceColor);
        System.out.println("OS VERSION: "+OsVersion);
        System.out.println("REFERENCE NUMBER: "+deviceRefNo);
    }

    public static void main(String[] arg)
    {
        Mobile mb1 = new Mobile();
        System.out.println("-----------------------------------------------");
        System.out.println("This data is from the default constructor.");
        mb1.print();
        System.out.println("-----------------------------------------------");

        Mobile mb2 = new Mobile("Oppo Reno 10 Pro+","Glossy Purple","Android 13, ColorOS 13.1","REF-OP-R10P-4402");
        System.out.println();
        System.out.println("-----------------------------------------------");
        System.out.println("This data is from the parameterized constructor.(1st New data)");
        mb2.print();
        System.out.println("-----------------------------------------------");

        Mobile mb3 = new Mobile("Oppo Find N3 Flip","Misty Pink","Android 14, ColorOS 14.0","REF-OP-N3F-1109");
        System.out.println();
        System.out.println("-----------------------------------------------");
        System.out.println("This data is from the parameterized constructor.(2nd New data)");
        mb3.print();
        System.out.println("-----------------------------------------------");

        Mobile mb4 = new Mobile(mb1);
        System.out.println();
        System.out.println("-----------------------------------------------");
        System.out.println("This data is from the Copy constructor. (Copying 1st Data)");
        mb4.print();
        System.out.println("-----------------------------------------------");

        Mobile mb5 = new Mobile(mb2);
        System.out.println();
        System.out.println("-----------------------------------------------");
        System.out.println("This data is from the Copy constructor. (Copying 2nd Data)");
        mb5.print();
        System.out.println("-----------------------------------------------");

        Mobile mb6 = new Mobile(mb1);
        System.out.println();
        System.out.println("-----------------------------------------------");
        System.out.println("This data is from the Copy constructor. (Copying 3rd Data)");
        mb6.print();
        System.out.println("-----------------------------------------------");
    }
}