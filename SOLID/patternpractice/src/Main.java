//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        UserProfile user1 = new UserProfile();
        user1.getPreferences().put("theme", "dark");

        UserProfile user2 = user1.clone();
        user2.getPreferences().put("theme", "light");

        System.out.println(user1.getPreferences());
    }
}