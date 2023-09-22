package LogicHandle;

import entity.Staff;

import java.util.Scanner;

public class StaffLogic {
    public  Staff[] staffs = new Staff[100];
    private  void prinStaff() {
        for (int i = 0; i < staffs.length; i++) {
            if (staffs[i]!=null){
                System.out.println(staffs[i]);
            }
        }
    }

    public  void inputStaff() {
        System.out.println("Bạn muốn nhập bao nhiêu nhân viên ");
        int addStaff = new Scanner(System.in).nextInt();
        for (int i = 0; i < addStaff; i++) {
            System.out.println("Nhập thông tin của nhân viên thứ "+(i+1));
            Staff staff = new Staff();
            staff.inputStaff();
            saveStaff(staff);
        }
    }

    private  void saveStaff(Staff staff) {
        for (int j = 0; j < staffs.length; j++) {
            if (staffs[j]== null){
                staffs[j]=staff;
                break;
            }
        }
    }
}
