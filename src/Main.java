import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        // Створити енум Стать.
        // Створити клас Юзер з плоями : ід, ім'я , вік, Стать.
        // Ствроити 10 об'єктів Юзера з відповідними ід (1-10)
        // Свторити  arrayList , та покласти цих юзерів в arayList.

        User user1 = new User(1,"Oleg",23,Sex.male);
        User user2 = new User(2,"Ira",16,Sex.female);
        User user3 = new User(3,"Arsen",27,Sex.male);
        User user4 = new User(4,"Olya",20,Sex.female);
        User user5 = new User(5,"Bodia",11,Sex.male);
        User user6 = new User(6,"Vova",12,Sex.male);
        User user7 = new User(7,"Vlad",25,Sex.male);
        User user8 = new User(8,"Nastya",27,Sex.female);
        User user9 = new User(9,"Vira",14,Sex.female);
        User user10 = new User(10,"Oleg",88,Sex.male);


        List<User> userArrayList = new ArrayList<>();
        userArrayList.add(user1);
        userArrayList.add(user2);
        userArrayList.add(user3);
        userArrayList.add(user4);
        userArrayList.add(user5);
        userArrayList.add(user6);
        userArrayList.add(user7);
        userArrayList.add(user8);
        userArrayList.add(user9);
        userArrayList.add(user10);

        Stream<User> stream = userArrayList.stream();
        Iterator<User> iterator = stream.iterator();
        // Проітерувати колекцію юзерів, вивевши тільки юзерів з парним значенням ід
//        while (iterator.hasNext()) {
//            User next =  iterator.next();
//            if(next.getId()%2==0){
//                System.out.println(next);
//            }
//        }
        // Проітерувати колекцію юзерів, вивевши тільки юзерів з ім'ям , довжина якого більше ніж 5 символів
//        while (iterator.hasNext()) {
//            User next =  iterator.next();
//            if(next.getName().length()>5){
//                System.out.println(next);
//            }
//        }
        // Проітерувати колекцію юзерів, вивевши тільки юзерів жінок
        while (iterator.hasNext()) {
            User next =  iterator.next();
            if(next.getSex()==Sex.female){
                System.out.println(next);
            }
        }
    }
}
