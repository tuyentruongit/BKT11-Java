package entity;

import java.time.LocalDate;
import java.util.Scanner;

public class Staff extends Person {
    private static int nextId = 1000;
    private int idStaff;
    private String contract;


    public Staff() {
        this.idStaff=nextId;
        nextId++;
    }

    public static int getNextId() {
        return nextId;
    }

    public static void setNextId(int nextId) {
        Staff.nextId = nextId;
    }

    public int getIdStaff() {
        return idStaff;
    }

    public void setIdStaff(int idStaff) {
        this.idStaff = idStaff;
    }

    public String getContract() {
        return contract;
    }

    public void setContract(String contract) {
        this.contract = contract;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "idStaff=" + idStaff +
                ", contract='" + contract + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone=" + phone +
                '}';
    }
    public void inputStaff(){
        System.out.println("nhập tên của nhân viên");
        this.setName(new Scanner(System.in).nextLine());
        System.out.println("nhập địa chỉ của nhân viên");
        this.setAddress(new Scanner(System.in).nextLine());
        System.out.println("nhập số điện thoại của nhân viên");
        this.setPhone(new Scanner(System.in).nextInt());
        System.out.println("nhập ngày kí hợp đồng của nhân viên");
        this.setContract(new Scanner(System.in).nextLine());
    }
}
