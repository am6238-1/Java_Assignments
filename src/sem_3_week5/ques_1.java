package sem_3_week5;

public class ques_1 {
    static class AccessChecker {

        static String classifyAccess(String fieldModifier, String accessorContext) {

            switch (fieldModifier) {
                case "private" -> {
                    if (accessorContext.equals("SAME_CLASS"))
                        return "ALLOWED";
                    else
                        return "DENIED";
                }
                case "default" -> {
                    if (accessorContext.equals("SAME_CLASS") ||
                            accessorContext.equals("SAME_PACKAGE"))
                        return "ALLOWED";
                    else
                        return "DENIED";
                }
                case "protected" -> {
                    if (accessorContext.equals("SAME_CLASS") ||
                            accessorContext.equals("SAME_PACKAGE") ||
                            accessorContext.equals("SUBCLASS_DIFFERENT_PACKAGE_OWN_TYPE"))
                        return "ALLOWED";
                    else
                        return "DENIED";
                }
                case "public" -> {
                    return "ALLOWED";
                }
            }

            return "DENIED";
        }

        static String summarizeByModifier(String[][] attempts) {

            int privateAllowed = 0, privateDenied = 0;
            int defaultAllowed = 0, defaultDenied = 0;
            int protectedAllowed = 0, protectedDenied = 0;
            int publicAllowed = 0, publicDenied = 0;

            for (String[] attempt : attempts) {

                String modifier = attempt[0];
                String context = attempt[1];

                String result = classifyAccess(modifier, context);

                switch (modifier) {
                    case "private" -> {
                        if (result.equals("ALLOWED"))
                            privateAllowed++;
                        else
                            privateDenied++;
                    }
                    case "default" -> {
                        if (result.equals("ALLOWED"))
                            defaultAllowed++;
                        else
                            defaultDenied++;
                    }
                    case "protected" -> {
                        if (result.equals("ALLOWED"))
                            protectedAllowed++;
                        else
                            protectedDenied++;
                    }
                    case "public" -> {
                        if (result.equals("ALLOWED"))
                            publicAllowed++;
                        else
                            publicDenied++;
                    }
                }
            }

            return "private: " + privateAllowed + " allowed / " + privateDenied +
                    " denied | default: " + defaultAllowed + " allowed / " + defaultDenied +
                    " denied | protected: " + protectedAllowed + " allowed / " + protectedDenied +
                    " denied | public: " + publicAllowed + " allowed / " + publicDenied + " denied";
        }

        static void main() {

            System.out.println(
                    classifyAccess("private", "SAME_CLASS")
            );

            String[][] attempts = {
                    {"private", "SAME_CLASS"},
                    {"private", "SAME_PACKAGE"},
                    {"default", "SAME_PACKAGE"},
                    {"default", "DIFFERENT_PACKAGE"},
                    {"protected", "SAME_PACKAGE"},
                    {"protected", "SAME_CLASS"},
                    {"public", "DIFFERENT_PACKAGE"}
            };

            System.out.println(summarizeByModifier(attempts));
        }
    }
}
