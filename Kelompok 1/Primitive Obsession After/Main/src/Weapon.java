public class Weapon {
    private String weapon;
    private String weaponType;

    // Setelah kita pindahkan ke dalam class weapon ini langsung kita buat
    // constructornya
    public Weapon(String weapon, String weaponType) {
        super();
        this.weapon = weapon;
        this.weaponType = weaponType;
    }

    // kemudian kita buat setter & getternya
    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public String getWeaponType() {
        return weaponType;
    }

    public void setWeaponType(String weaponType) {
        this.weaponType = weaponType;
    }

}
