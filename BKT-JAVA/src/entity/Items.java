package entity;

import statics.TypeItems;

import java.util.Scanner;

public class Items {
    private static int nextIdItems = 1000;
    private int idItems;
    private String name;
    private String price;
    private int quantity;
    private TypeItems typeItems;

    public Items() {
        this.idItems=nextIdItems;
        nextIdItems++;
    }

    public static int getNextIdItems() {
        return nextIdItems;
    }

    public static void setNextIdItems(int nextIdItems) {
        Items.nextIdItems = nextIdItems;
    }

    public int getIdItems() {
        return idItems;
    }

    public void setIdItems(int idItems) {
        this.idItems = idItems;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public TypeItems getTypeItems() {
        return typeItems;
    }

    public void setTypeItems(TypeItems typeItems) {
        this.typeItems = typeItems;
    }

    @Override
    public String toString() {
        return "Items{" +
                "idItems=" + idItems +
                ", name='" + name + '\'' +
                ", price='" + price + '\'' +
                ", quantity=" + quantity +
                ", typeItems=" + typeItems +
                '}';
    }
    public void inputItems(){
        System.out.println(" Nhập tên mặt hàng");
        this.setName(new Scanner(System.in).nextLine());
        System.out.println(" Bạn chọn loại mặt hàng sau đây");
        System.out.println("1. Điện tử ");
        System.out.println("2. Điện lạnh ");
        System.out.println("3. Máy tính");
        System.out.println("4. Thiết bị văn phòng ");
        int typeItems;
        do {
            typeItems= new Scanner(System.in).nextInt();
            if (typeItems>0 && typeItems<5){
                break;
            }
            System.out.println("Mặt hàng bạn vừa chọn không đúng vui lòng nhập lại");
        }while (true);
        switch (typeItems){
            case 1:
                this.setTypeItems(TypeItems.DIEN_TU);
                break;
            case 2:
                this  .setTypeItems(TypeItems.DIEN_LANH);
                break;
            case 3:
                this.setTypeItems(TypeItems.MAY_TINH);
                break;
            case 4:
                this.setTypeItems(TypeItems.THIET_BI_VAN_PHONG);
                break;
        }
        System.out.println(" Nhập gia bán mặt hàng");
        this.setPrice(new Scanner(System.in).nextLine());
        System.out.println(" Nhập số lượng mặt hàng");
        this.setQuantity(new Scanner(System.in).nextInt());
    }
}
