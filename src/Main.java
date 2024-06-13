
public class Main {
    public static void main(String[] args) {
        User user = new User(58);

        try {
            checkUserAge(user);
        } catch (NotCorrectUser e) {
            System.out.println(e.getMessage());
        }
    }

    public static void checkUserAge(User us) throws NotCorrectUser {
        if (us.getAge() < 65) {
            throw new NotCorrectUser("İstifadəçi uyğun deyil!");
        }
    }
    }
