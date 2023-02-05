package Model;

import java.util.List;

public class CompanyContact extends BaseContact implements Finder{
    private String companyName;

    public CompanyContact(List<String> phoneNumbers, List<String> emails,
                          List<String> vkUrls, List<String> telegramNikNames,
                          List<String> adress, String companyName) {
        super(phoneNumbers, emails, vkUrls, telegramNikNames, adress);
        this.companyName = companyName;
    }

    public CompanyContact(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public String toString() {
        return "CompanyContact{" +
                "companyName='" + companyName + '\'' +
                '}';
    }
    @Override
    public boolean findByName(String nameToFind) {
        return this.companyName.equalsIgnoreCase(nameToFind);
    }


    @Override
    public String showDetails() {
        return "" + this.companyName +
                "\nphoneNumbers=" + this.getPhoneNumbers() +
                ", \nemails=" + this.getEmails() +
                ", \nvkUrls=" + this.getVkUrls() +
                ", \ntelegramNikNames=" + this.getTelegramNikNames() +
                ", \nadress=" + this.getAdress() +
                '}';
    }
}
