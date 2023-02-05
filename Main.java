import Model.CompanyContact;
import Model.ContactService;
import Model.PersonContact;

public class Main {
    public static void main(String[] args){

        PersonContact ilon = new PersonContact("Ilon", "Mask");
        CompanyContact tesla = new CompanyContact("Tesla");

        ContactService cs = new ContactService();
        cs.addContact(ilon);
        cs.addContact(tesla);

        //Просмотреть список контактов
        System.out.println(cs.getContactList());

        //Добавляю данные контакту ilon
        ilon.addAdress("California");
        ilon.addAdress("Moon");
        ilon.addEmail("ilonmask@tesla.com");
        System.out.println(" ");

        //Поиск контакта по названию
        System.out.println(cs.findByName("sergei")); //такого контакта нет
        System.out.println(cs.findByName("mask"));
        System.out.println(" ");

        //Поиск контакта по названию и просмотр детализированной информации о нем (если контакт найден)
        System.out.println(cs.findByNameDetailed("sergei")); //такого контакта нет
        System.out.println(cs.findByNameDetailed("mask"));
        System.out.println(" ");

        //Добавление и удаление способа связи с контрагентом
        ilon.addPhoneNumber("+79535577666");
        System.out.println(ilon.showDetails());
        System.out.println(" ");
        ilon.deletePhoneNumber("+79535577666");
        ilon.clearAdressList();
        System.out.println(ilon.showDetails());
        System.out.println(" ");

        //Удаление контакта
        cs.deleteContact(ilon);
        System.out.println(cs.getContactList());
    }
}
