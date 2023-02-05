package Model;

import java.util.ArrayList;
import java.util.List;

public abstract class BaseContact implements Finder{

    private List<String> phoneNumbers = new ArrayList<>();
    private List<String> emails = new ArrayList<>();
    private List<String> vkUrls = new ArrayList<>();
    private List<String> telegramNikNames = new ArrayList<>();
    private List<String> adress = new ArrayList<>();

    public BaseContact(List<String> phoneNumbers, List<String> emails, List<String> vkUrls,
                       List<String> telegramNikNames, List<String> adress) {
        this.phoneNumbers = phoneNumbers;
        this.emails = emails;
        this.vkUrls = vkUrls;
        this.telegramNikNames = telegramNikNames;
        this.adress = adress;
    }

    public BaseContact() {
    }

    public List<String> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(List<String> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }
    public void addPhoneNumber(String newPhoneNumber) {
        this.phoneNumbers.add(newPhoneNumber);
    }
    public void deletePhoneNumber(String phoneNumberToDelete){
        this.phoneNumbers.remove(phoneNumberToDelete);
    }
    public void clearPhoneNumbers(){
        this.phoneNumbers.clear();
    }

    public List<String> getEmails() {
        return emails;
    }

    public void setEmails(List<String> emails) {
        this.emails = emails;
    }
    public void addEmail(String newEmail) {
        this.emails.add(newEmail);
    }

    public void deleteEmail(String emailToDelete){
        this.emails.remove(emailToDelete);
    }
    public void clearEmailList(){
        this.emails.clear();
    }
    public List<String> getVkUrls() {
        return vkUrls;
    }

    public void setVkUrls(List<String> vkUrls) {
        this.vkUrls = vkUrls;
    }
    public void addVkUrl(String newVkUrl) {
        this.vkUrls.add(newVkUrl);
    }

    public void deleteVkUrl(String vkUrlToDelete){
        this.vkUrls.remove(vkUrlToDelete);
    }

    public void clearVkUrlList(){
        this.vkUrls.clear();
    }

    public List<String> getTelegramNikNames() {
        return telegramNikNames;
    }

    public void setTelegramNikNames(List<String> telegramNikNames) {
        this.telegramNikNames = telegramNikNames;
    }
    public void addTelegramNikNames(String newTelegramNikName) {
        this.telegramNikNames.add(newTelegramNikName);
    }
    public void deleteTelegramNikName(String nikToDelete){
        this.telegramNikNames.remove(nikToDelete);
    }

    public void clearTelegramNikNames(){
        this.telegramNikNames.clear();
    }


    public List<String> getAdress() {
        return adress;
    }

    public void setAdress(List<String> adress) {
        this.adress = adress;
    }
    public void addAdress(String newAdress) {
        this.adress.add(newAdress);
    }

    public void deleteAdress(String adressToDelete){
        this.adress.remove(adressToDelete);
    }

    public void clearAdressList(){
        this.adress.clear();
    }

    @Override
    public String toString() {
        return "BaseContact{" +
                "phoneNumbers=" + phoneNumbers +
                ", emails=" + emails +
                ", vkUrls=" + vkUrls +
                ", telegramNikNames=" + telegramNikNames +
                ", adress=" + adress +
                '}';
    }
}
