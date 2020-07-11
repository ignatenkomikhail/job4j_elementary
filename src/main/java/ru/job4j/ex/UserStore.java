package ru.job4j.ex;

public class UserStore {

    public static User findUser(User[] users, String login) throws UserNotFoundException {
        User user = null;
        for (User u : users) {
            if (login.equals(u.getUsername())) {
                user = u;
                break;
            }
        }
        if (user == null) {
            throw new UserNotFoundException("User not found");
        }
        return user;
    }

    public static boolean validate(User user) throws UserInvalidException {
        boolean result = false;
        if (!user.isValid()) {
            throw new UserInvalidException("The user did not pass the validation check");
        } else if (user.getUsername().length() < 3) {
            throw new UserInvalidException("The user name must be more than 3 characters");
        } else {
            result = true;
        }
        return result;
    }

    public static void main(String[] args) {
        User[] users = {
                new User("Petr Arsentev", true),
                new User("Li", true),
                new User("Chen", false),
                new User("Su", false)
        };
        try {
            User user = findUser(users, "Petr Arsentev");
            if (validate(user)) {
                System.out.println("This user has an access");
            }
        } catch (UserInvalidException ui) {
            ui.printStackTrace();
        } catch (UserNotFoundException unf) {
            unf.printStackTrace();
        }
    }
}
