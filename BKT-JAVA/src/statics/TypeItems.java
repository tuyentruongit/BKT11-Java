package statics;

public enum TypeItems {
    DIEN_TU("Điện tử"),
    DIEN_LANH("Điện lạnh"),
    MAY_TINH("Máy tính"),
    THIET_BI_VAN_PHONG("Thiết  bị văn phòng");
    public String value;

    TypeItems(String value) {
        this.value = value;
    }
}
