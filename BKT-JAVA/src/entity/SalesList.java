package entity;

import java.util.Arrays;

public class SalesList {
  private Items items;


//  private ItemsDetail [] itemsDetails;
  private StaffDetail[] staffDetail ;

  public StaffDetail[] getStaffDetail() {
    return staffDetail;
  }

  public void setStaffDetail(StaffDetail[] staffDetail) {
    this.staffDetail = staffDetail;
  }

  public SalesList(Items items, StaffDetail[] staffDetail) {
    this.items = items;
    this.staffDetail = staffDetail;
  }

  public Items getItems() {
    return items;
  }

  public void setItems(Items items) {
    this.items = items;
  }

  //  public ItemsDetail[] getItemsDetails() {
//    return itemsDetails;
//  }
//
//  public void setItemsDetails(ItemsDetail[] itemsDetails) {
//    this.itemsDetails = itemsDetails;
//  }


  @Override
  public String toString() {
    return "SalesList{" +
            "items=" + items +
            ", staffDetail=" + Arrays.toString(staffDetail) +
            '}';
  }
}
