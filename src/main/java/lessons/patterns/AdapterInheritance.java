package lessons.patterns;


/*
* Structural pattern
* */
public class AdapterInheritance extends MiniUsb implements MicroUsb {
    @Override
    public void readMicroUsb() {
        readMiniUsb();
    }

    @Override
    public void writeMicroUsb() {
        writeMiniUsb();
    }
}

interface MicroUsb {
    void readMicroUsb();
    void writeMicroUsb();
}

class MiniUsb {
    void readMiniUsb() {
        System.out.println("Read mini usb");
    }

    void writeMiniUsb() {
        System.out.println("write mini usb");
    }
}

class AdapterAggregation implements MicroUsb {
    private MiniUsb miniUsb;

    @Override
    public void readMicroUsb() {
        miniUsb.readMiniUsb();
    }

    @Override
    public void writeMicroUsb() {
        miniUsb.writeMiniUsb();
    }
}