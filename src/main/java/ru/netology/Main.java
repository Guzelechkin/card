package ru.netology;

public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Ольга";
        post.passport = "1234 № 12312312";
        post.patronymic = "Юрьевна";
        post.phone = "+7 (911)-111-11-11";
        post.surname = "Вебер";
        post.subscription = true;

        post.birthday = new Form();
        post.birthday.day =13;
        post.birthday.month = 6;
        post.birthday.year = 1999;
    }
}
