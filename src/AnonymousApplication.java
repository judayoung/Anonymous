import anonymous.Anonymous;

public class AnonymousApplication {

    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Let's code msg!");

        Anonymous aaaEncryptAnonymous = new Anonymous() {
            @Override
            public String encryptMsg(String msg) {
                StringBuilder resultMsg = new StringBuilder();
                for (int i = msg.length() - 1; i >= 0; i--) {
                    resultMsg.append(msg.charAt(i));
                }
                return "aaaEncryptAnonymous : " + resultMsg.toString();
            }
        };

        System.out.println(aaaEncryptAnonymous.encryptMsg("Hello world!"));

        Anonymous bbbEncryptAnonymous = new Anonymous() {
            @Override
            public String encryptMsg(String msg) {
                StringBuilder resultMsg = new StringBuilder();
                for (int i = 0; i < msg.length(); i++) {
                    String string = Character.toString(msg.charAt(i)).toLowerCase();
                    switch(string){
                        case "q": resultMsg.append("ㅂ"); break;
                        case "w": resultMsg.append("ㅈ"); break;
                        case "e": resultMsg.append("ㄷ"); break;
                        case "r": resultMsg.append("ㄱ"); break;
                        case "t": resultMsg.append("ㅅ"); break;
                        case "y": resultMsg.append("ㅛ"); break;
                        case "u": resultMsg.append("ㅕ"); break;
                        case "i": resultMsg.append("ㅑ"); break;
                        case "o": resultMsg.append("ㅐ"); break;
                        case "p": resultMsg.append("ㅔ"); break;
                        default: resultMsg.append(string); break;
                    }
                }
                return "bbbEncryptAnonymous : " + resultMsg.toString();
            }
        };

        System.out.println(bbbEncryptAnonymous.encryptMsg("Hello world!"));
    }

}
