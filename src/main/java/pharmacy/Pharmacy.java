package pharmacy;

import java.util.ArrayList;
import java.util.List;

public class Pharmacy {
    public List<Drug> drugs = new ArrayList<>();
    public Pharmacy addDrug(Drug drug){
        this.drugs.add(drug);
        return this;
    }
    public Drug findDrug(String name){
        return this.drugs.stream().filter(element -> element.getName().equalsIgnoreCase (name)).toList().get(0);
    }

    public Drug buyDrug(Citizen c, String name) {
        Drug drug = this.findDrug(name);
        if(drug == null) return null;
        if(c.getDiscount() == 0) drug.buy();
        else drug.buy(c.getDiscount());
        return drug;
    }
}
