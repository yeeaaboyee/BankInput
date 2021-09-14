package com.micha.BankInput.BackendJavaCode;

import java.util.regex.*;

public class Main {
    public Main() {
    }
    public boolean submitRequest(User user){
        boolean requestValidated = true;
            if (user.getBank() == null || user.getCard() == null || user.getExpiry() == null) {
                requestValidated = false;
            }
            String newCard = user.getCard().replace(" ", "");
            for (int i = 0; i < newCard.length(); i++) {
                if (!(newCard.charAt(i) == '0' || newCard.charAt(i) == '1' || newCard.charAt(i) == '2' || newCard.charAt(i) == '3' || newCard.charAt(i) == '4' || newCard.charAt(i) == '5' || newCard.charAt(i) == '6' || newCard.charAt(i) == '7' || newCard.charAt(i) == '8' || newCard.charAt(i) == '9')) {
                    requestValidated = false;
                }
            }
            return requestValidated;
    }
}
