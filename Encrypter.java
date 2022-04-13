public class Encrypter {

    public String encrypt(String cipherText, int shiftKey) {
        String alpha = "abcdefghijklmnopqrstuvwxyz";
        cipherText = cipherText.toLowerCase();
        String message = "";
        for (int i = 0; i < cipherText.length(); i++) {
            int charPosition = alpha.indexOf(cipherText.charAt(i));
            int keyVal = (shiftKey + charPosition) % 26;
            char replaceVal = alpha.charAt(keyVal);
            message += replaceVal;
        }
        return message;
    }


    public String decrypt(String cipherText, int shiftKey) {
        String alpha = "abcdefghijklmnopqrstuvwxyz";
        cipherText = cipherText.toLowerCase();
        String message = "";
        for (int i = 0; i < cipherText.length(); i++) {
            int charPosition = alpha.indexOf(cipherText.charAt(i));
            int keyVal = (charPosition - shiftKey) % 26;
            if (keyVal < 0) {
                keyVal = alpha.length() + keyVal;
            }
            char replaceVal = alpha.charAt(keyVal);
            message += replaceVal;
        }
        return message;
    }
}

