package enums;

import java.sql.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public enum OrderStatus {
    ORDERED,
    PREPARED,
    DELIVERED,
    COMPLETED,
}


class Test {
    public static void main(String[] args) {
        KFC kfc = new KFC("Błonie");
        kfc.changeOrderStatus(1234, OrderStatus.ORDERED);
        kfc.changeOrderStatus(39278, OrderStatus.ORDERED);
        kfc.changeOrderStatus(39278, OrderStatus.DELIVERED);
    }
}



class KFC {
    public String address;

    public String getAddress() {
        return address;
    }

    public Map<Integer, OrderStatus> orders = new HashMap();

    public KFC(String address) {
        this.address = address;
    }

    public boolean changeOrderStatus(Integer index, OrderStatus status) {
        if(status == OrderStatus.ORDERED) {
            orders.put(index, status);
        }
        orders.replace(index, status);
        System.out.println(orders.toString());
        return true;
    }
}