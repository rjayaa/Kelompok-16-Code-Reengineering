
public class Character {
    private String name;
    private String charClass;
    // memindahkan variable primitive weapon ke dalam class baru Weapon
    // kemudian tinggal kita panggil dalam bentuk objek baru
    private Weapon weapon;
    // memindahkan variable primitive armor ke dalam class baru Armor
    // kemudian tinggal kita panggil dalam bentuk objek baru
    private Armor armor;

    public Character(String name, String charClass, String weapon, String weaponType, String armor, String armorType) {
        super();
        this.name = name;
        this.charClass = charClass;
        // dan jangan lupa kita inisiasi objek dari class yang sudah kita buat
        this.weapon = new Weapon(weapon, weaponType);
        this.armor = new Armor(armor, armorType);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCharClass() {
        return charClass;
    }

    public void setCharClass(String charClass) {
        this.charClass = charClass;
    }

    // Kemudian kita hapus setter getter Weapon yang lama pada class ini
    // dan kita buat yang baru

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Armor getSArmor() {
        return armor;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }

}
