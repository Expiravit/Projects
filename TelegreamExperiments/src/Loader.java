import org.javagram.TelegramApiBridge;
import org.javagram.response.AuthAuthorization;
import org.javagram.response.AuthCheckedPhone;
import org.javagram.response.AuthSentCode;
import org.javagram.response.object.UserContact;
import org.telegram.api.contacts.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Loader {
    public static void main(String[] args) throws IOException {

        String phoneNumber;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        TelegramApiBridge bridge = new TelegramApiBridge("149.154.167.50:443", 65269, "104db8efc1fd3ce1f3fb06ba11c13230");

        System.out.println("Please, type phone number: ");
        phoneNumber = reader.readLine().replace("[^0-9]+","");
        AuthCheckedPhone checkedPhone = bridge.authCheckPhone(phoneNumber);


        if (checkedPhone.isRegistered()) {
            System.out.println("Number registered");
            AuthSentCode sentCode = bridge.authSendCode(phoneNumber);
            System.out.println("Please, enter SMS-code: ");
            AuthAuthorization authorization = bridge.authSignIn(reader.readLine().trim());
            System.out.println(authorization.getUser());
            ArrayList<UserContact> contactsList= bridge.contactsGetContacts();
            for (UserContact userContact : contactsList) {
                System.out.println(userContact + " - " + userContact.getPhone());
            }


        }
        else {
            System.out.println("Number is not registered");
            System.out.println("Please, enter SMS-code: ");
            String code = reader.readLine().trim();
            System.out.println("Enter first name: ");
            String firstName = reader.readLine().trim();
            System.out.println("Enter last name: ");
            String lastName = reader.readLine().trim();
            AuthAuthorization authorization = bridge.authSignUp(code,firstName,lastName);
            System.out.println("Registered complete!");
            System.out.println(authorization.getUser());
        }


       // bridge.authLogOut();

    }
}
