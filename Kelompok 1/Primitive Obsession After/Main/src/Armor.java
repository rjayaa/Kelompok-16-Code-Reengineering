public class Armor {
    private String armor;
    private String armorType;

    // Setelah kita pindahkan ke dalam class weapon ini langsung kita buat
    // constructornya
    public Armor(String armor, String armorType) {
        super();
        this.armor = armor;
        this.armorType = armorType;
    }

    // kemudian kita buat setter & getternya
    public String getarmor() {
        return armor;
    }

    public void setarmor(String armor) {
        this.armor = armor;
    }

    public String getarmorType() {
        return armorType;
    }

    public void setarmorType(String armorType) {
        this.armorType = armorType;
    }
}
