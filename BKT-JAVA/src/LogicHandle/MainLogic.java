package LogicHandle;

import entity.Items;
import entity.SalesList;
import entity.Staff;
import entity.StaffDetail;

import java.util.Scanner;

public class MainLogic {
    public  Items[] itemss = new Items[100];
    public  Staff[] staffs = new Staff[100];
    public  SalesList[] salesLists = new SalesList[100];
    public  void run () {
        while (true){
            printMenu();
            int funtion = choiceMenu() ;
            switch (funtion){
                case 1:
                    inputItems();
                    break;
                case 2:
                    printItems();
                    break;
                case 3:
                    inputStaff();
                    break;
                case 4:
                    prinStaff();
                    break;
                case 5:
                    salesLits();
                    break;
                case 6:

                    break;
                case 7:
                    System.out.println("Bạn muốn sắp xếp theo ? ");
                    System.out.println("1. Theo tên nhân viên ");
                    System.out.println("2. Theo nhóm mặt hàng ");
                    System.out.println("3. Quay lại ");
                    int index = new Scanner(System.in).nextInt();
                    switch (index){
                        case 1:
//                            for (int i = 0; i <salesLists.length -1 ; i++) {
//                                for (int j = i+1; j <salesLists.length ; j++) {
//                                    if (salesLists[i].setStaffDetail(staffs[i].getName().compareToIgnoreCase(salesLists[j].getStaffDetail(staffs[j].getName()>0)));
//                                }
//                            }
                            break;
                        case 2:
                            break;
                        case 3:
                            return;
                    }
                    break;
                case 8:
                    break;
                case 9:
                    return;

            }
        }

    }

    private  void salesLits() {
        System.out.println("Có bao nhiêu nhân viên bán hàng ");
        int number = new Scanner(System.in).nextInt();
        StaffDetail[] staffDetails = new StaffDetail[number];
        int count = 0 ;
        for (int i = 0; i < number; i++) {
            System.out.println(" Nhập id của bạn nhân viên thứ "+(i+1));
            int idStaff;
            Staff staff = null;
            do {
                idStaff = new Scanner(System.in).nextInt();
                for (int j = 0; j < staffs.length; j++) {
                    if (staffs[j] != null && staffs[j].getIdStaff()==idStaff){
                        break;
                    }
                }
                if ( staff !=null){
                    break;
                }
                System.out.println("Id bạn vừa nhập không đúng , vui lòng nhập lại");
            }while (true);
            System.out.println(" Bạn đã bán được bao nhiêu mặt hàng  ");
            int numberItems;
            do {
                numberItems = new Scanner(System.in).nextInt();
                if (numberItems<5 && numberItems>1){
                    break;
                }
                System.out.println("Mỗi nhân viên chỉ được bán tối đa 5 mặt hàng , vui lòng nhập lại các mặt hàng đã bán ");
            }while (true);
            StaffDetail staffDetail = new StaffDetail(staff,numberItems);
            staffDetails[count]=staffDetail;
            int idItems ;
            Items items = null;
            for (int j = 0; j <numberItems ; j++) {
                System.out.println("Nhập id của mặt hàng nhân viên đã bán được  ");
                do {
                    idItems = new Scanner(System.in).nextInt();
                    for (int k = 0; k <itemss.length; k++) {
                        if (itemss[k]!= null &&  itemss[k].getIdItems()==idItems){
                            break;
                        }
                    }
                    if (items!=null){
                        break;
                    }
                    System.out.println("Id mặt hàng bạn vừa nhập không đúng vui lòng nhập lại");
                }while (true);
            }SalesList salesList = new SalesList(items,staffDetails);
            for (int j = 0; j < salesLists.length; j++) {
                if (salesLists[j]==null ){
                    salesLists[i]=salesList;
                }
            }
            for (int j = 0; j < salesLists.length; j++) {
                if (salesLists[j]!=null){
                    System.out.println(salesLists[j]);
                }
            }

        }
    }

    private  void prinStaff() {
        for (int i = 0; i < staffs.length; i++) {
            if (staffs[i]!=null){
                System.out.println(staffs[i]);
            }
        }
    }

    private  void inputStaff() {
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

    private  void printItems() {
        for (int i = 0; i < itemss.length; i++) {
            if (itemss[i]!=null){
                System.out.println(itemss[i]);
            }
        }
    }

    private  void inputItems() {
        System.out.println("Bạn muốn thêm bao nhiêu danh sách mặt hàng");
        int add = new Scanner(System.in).nextInt();
        for (int i = 0; i < add; i++) {
            System.out.println("Nhập thông tin mặt hàng "+(i+1));
            Items items = new Items();
            items.inputItems();
            saveItems(items);
        }
    }

    private  void saveItems(Items items) {
        for (int j = 0; j < itemss.length; j++) {
            if (itemss[j]== null){
                itemss[j]=items;
                break;
            }
        }
    }

    private  int choiceMenu() {
        int funtion;
        do {
            funtion = new Scanner(System.in).nextInt();
            if (funtion>0 && funtion < 10){
                break;
            }
            System.out.println("Chức năng bạn vừa chọn không hợp lệ , Vui lòng chọn lại");
        }while (true);
        return funtion;
    }

    private  void printMenu() {
        System.out.println("Phần mềm quản lý bán hàng");
        System.out.println("1. Nhập danh sách mặt hàng mới ");
        System.out.println("2. In danh sách mặt hàng mới ");
        System.out.println("3. lập danh sách nhân viên ");
        System.out.println("4. In danh sách nhân viên đã có  ");
        System.out.println("5. Lập bảng danh sách bán hàng cho từng nhân viên  ");
        System.out.println("6. In bảng danh sách bán hàng của từng nhân viên  ");
        System.out.println("7. Sắp xếp danh sách bán hàng ");
        System.out.println("8. Lập bảng kê doanh thu cho mỗi nhân viên ");
        System.out.println("9. thoát ");
        System.out.println(" Mời bạn chọn những chức năng trên ");
    }
}
