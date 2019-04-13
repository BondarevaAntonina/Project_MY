package lessons.low_coupling_code;

/*public class Gun {
    private WeaponOne weaponOne;
    private WeaponTwo weaponTwo;

    public Gun(WeaponOne weaponOne, WeaponTwo weaponTwo) {
        this.weaponOne = weaponOne;
        this.weaponTwo = weaponTwo;
    }

    public void actionWeaponOne() {
        weaponOne.action();
    }

    public void actionWeaponTwo() {
        weaponTwo.action();
    }
}*/

public class Gun {
    private Weaponable weaponable;

    public Gun(Weaponable weaponable) {
        this.weaponable = weaponable;
    }

    public void actionWeapon() {
        weaponable.action();
    }

}

interface Weaponable {
    void action();
}

class WeaponOne implements Weaponable {
    public void action() {
        System.out.println("WeaponOne");
    }
}


class WeaponTwo implements Weaponable {
    public void action() {
        System.out.println("WeaponTwo");
    }
}

class TestGun {
    public static void main(String[] args) {

        Weaponable weaponable = new WeaponOne();
        Weaponable weaponable1 = new WeaponTwo();

        Gun gun = new Gun(weaponable1);
    }
}
