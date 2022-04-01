package com.company;

public class Main {

    public static void main(String[] args) {
        grecha grechaMist = new grecha("Greachka Mist", 250, 5);
        a4Paper officePaper = new a4Paper("Office paper A4", 2500, 4.7);
        iceCream russianStandartIceCream = new iceCream("Russian Sandart Ice Cream", 50, 3.9);

        usernameUser user1 = new  usernameUser("kef", "password", "Valentin");
        mailUser user2 = new mailUser("ajjfn@t.com","12345","Vova");
        phoneUser user3 = new phoneUser("8994958883", "qwerty", "Jenya");

        order order1 = new order(user1, grechaMist);
        order1.getOrder();
    }
}
interface IGoods{
    double getRating();
    int getPrice();
    String getName();
}
class grecha implements IGoods{
    double rating;
    int price;
    String name;

    grecha(String name, int price, double rating){
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    public double getRating() {
        return rating;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}
class a4Paper implements IGoods{
    double rating;
    int price;
    String name;

    a4Paper(String name, int price, double rating){
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    public double getRating() {
        return rating;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}
class iceCream implements IGoods{
    double rating;
    int price;
    String name;

    iceCream(String name, int price, double rating){
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    public double getRating() {
        return rating;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}

interface IUser{
    void setPassword(String password);
    void setUserAuthMethod(String userAuthMethod);
    String getUserAuthMethod();
    String getName();
}
class usernameUser implements IUser{
    String userName;
    String password;
    String name;

    usernameUser(String userName, String password, String name){
        this.userName = userName;
        this.password = password;
        this.name = name;
    }

    public void setUserAuthMethod(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserAuthMethod() {
        return userName;
    }

    public String getName() {
        return name;
    }
}
class mailUser implements IUser{
    String mail;
    String password;
    String name;

    mailUser(String mail, String password, String Name){
        this.mail = mail;
        this.password = password;
        this.name = Name;
    }

    public void setUserAuthMethod(String mail) {
        this.mail = mail;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserAuthMethod() {
        return mail;
    }
    public String getName() {
        return name;
    }
}
class phoneUser implements IUser{
    String phoneNumber;
    String password;
    String name;

    phoneUser(String phoneNumber, String password, String Name){
        this.phoneNumber = phoneNumber;
        this.password = password;
        this.name = Name;
    }

    public void setUserAuthMethod(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserAuthMethod() {
        return phoneNumber;
    }
    public String getName() {
        return name;
    }
}

class order implements IGoods, IUser{
    IUser user;
    IGoods goods;

    order(IUser user, IGoods goods){
        this.user = user;
        this.goods = goods;
    }
    public double getRating() {
        return goods.getRating();
    }

    public int getPrice() {
        return goods.getPrice();
    }

    public String getName() {
        return goods.getName();
    }

    public void setPassword(String password) {
        user.setPassword(password);
    }
    public void setUserAuthMethod(String AuthMethod){
        user.setUserAuthMethod(AuthMethod);
    }
    public String getUserAuthMethod(){
        return user.getUserAuthMethod();
    }
    public void getOrder(){
        System.out.printf("%s ordered %s", user.getName(), goods.getName());
    }
}