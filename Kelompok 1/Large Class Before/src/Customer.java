public class Customer {
    private String name;
    private int age;
    // kita buat credit menjadi class baru dan kembali memangiglnya menjadi objek
    private Credit credit;

    // ubah parameter dari tipe int menjadi objek credit
    public Customer(String name, int age, Credit credit) {
        this.name = name;
        this.age = age;
        this.credit = credit;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Credit getCredit() {
        return credit;
    }

    public boolean isAdult() {
        if (age >= 18) {
            return true;
        } else {
            return false;
        }
    }

    // sehingga pada saat pemanggilan amount, kita tinggal memanggil method
    // getAmount() yang sudah dbuat di class Credit
    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Credit: " + credit.getAmount());
    }
}
