package entity;

public class StaffDetail {
    private Staff staff;
    private int quantityItem;

    public StaffDetail(Staff staff, int quantityItem) {
        this.staff = staff;
        this.quantityItem = quantityItem;
    }

    public Staff getStaff() {
        return staff;
    }

    public void setStaff(Staff staff) {
        this.staff = staff;
    }

    public int getQuantityItem() {
        return quantityItem;
    }

    public void setQuantityItem(int quantityItem) {
        this.quantityItem = quantityItem;
    }

    @Override
    public String toString() {
        return "StaffDetail{" +
                "staff=" + staff +
                ", quantityItem=" + quantityItem +
                '}';
    }
}
