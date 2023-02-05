package Model;

import java.util.List;

public class PersonContact extends BaseContact implements Finder{
    private String firstName;
    private String lastName;

    public PersonContact(List<String> phoneNumbers, List<String> emails,
                         List<String> vkUrls, List<String> telegramNikNames,
                         List<String> adress, String firstName, String lastName) {
        super(phoneNumbers, emails, vkUrls, telegramNikNames, adress);
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public PersonContact(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "PersonContact{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    @Override
    public boolean findByName(String nameToFind) {
        return (this.firstName.equalsIgnoreCase(nameToFind) || this.lastName.equalsIgnoreCase(nameToFind));
    }

    @Override
    public String showDetails() {
        return "" + this.firstName + this.lastName +
                "\nphoneNumbers=" + this.getPhoneNumbers() +
                ", \nemails=" + this.getEmails() +
                ", \nvkUrls=" + this.getVkUrls() +
                ", \ntelegramNikNames=" + this.getTelegramNikNames() +
                ", \nadress=" + this.getAdress() +
                '}';
    }
}
