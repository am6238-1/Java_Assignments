package sem3_week5;

public class ques_2 {

    public static class AccessChecker {

        static String classifyAccess(String fieldModifier, String accessorContext) {

            if (fieldModifier.equals("public"))
                return "ALLOWED";

            if (accessorContext.equals("SAME_CLASS"))
                return "ALLOWED";

            if (fieldModifier.equals("private"))
                return "DENIED";

            if (accessorContext.equals("SAME_PACKAGE"))
                return "ALLOWED";

            if (fieldModifier.equals("default"))
                return "DENIED";

            if (fieldModifier.equals("protected")) {
                if (accessorContext.equals("SUBCLASS_DIFFERENT_PACKAGE_OWN_TYPE"))
                    return "ALLOWED";

                return "DENIED";
            }

            return "DENIED";
        }

        static String firstDeniedAttempt(String[][] attempts) {

            for (int i = 0; i < attempts.length; i++) {

                String modifier = attempts[i][0];
                String context = attempts[i][1];

                if (classifyAccess(modifier, context).equals("DENIED")) {
                    return modifier + " via " + context
                            + " (attempt #" + (i + 1) + ")";
                }
            }

            return "None Denied";
        }

        static void main() {

            String[][] attempts = {
                    {"public", "SUBCLASS_DIFFERENT_PACKAGE_PARENT_TYPE"},
                    {"protected", "SUBCLASS_DIFFERENT_PACKAGE_PARENT_TYPE"},
                    {"protected", "SUBCLASS_DIFFERENT_PACKAGE_OWN_TYPE"}
            };

            System.out.println(firstDeniedAttempt(attempts));
        }
    }

}
