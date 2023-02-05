package Model;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

public class ContactService <T extends BaseContact> {
    private List<T> contactList = new ArrayList<>();

    public ContactService(List<T> contactList) {
        this.contactList = contactList;
    }

    public ContactService() {
    }

    public void addContact (T tempContact){
        this.contactList.add(tempContact);
    }
    public void deleteContact (T tempContact){
        this.contactList.remove(tempContact);
    }

    public List<T> getContactList() {
        return contactList;
    }

    public List<T> findByName (String name){
        List<T> resultList = new ArrayList<>();
        for (T elem : contactList){
            if (elem.findByName(name) == true){
                resultList.add(elem);
            }
        }
        return resultList;

    }
    public List<String> findByNameDetailed (String name){
        List<T> tempResultList = findByName(name);
        List<String> resultList = new ArrayList<>();
        for (T elem : tempResultList){
            resultList.add(elem.showDetails());
        }
        return resultList;
    }


}
