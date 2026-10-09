package sem3_week5;

public class ques_1 {
    class LibraryMember {
        private String membershipPin;

    }

    public class AccessChecker {

        static String classifyAccess(String fieldModifier, String accessorContext) {

            if (fieldModifier.equals("public"))
                return "ALLOWED";

            if (accessorContext.equals("SAME_CLASS"))
                return "ALLOWED";

            if (fieldModifier.equals("private"))
                return "DENIED";

            if (accessorContext.equals("SAME_PACKAGE"))
                return "ALLOWED";

            return "DENIED";
        }

        static String summarizeByModifier(String[][] attempts) {

            String[] modifiers = {"private", "default", "protected", "public"};

            StringBuilder result = new StringBuilder();

            for (int i = 0; i < modifiers.length; i++) {
                int allowed = 0;
                int denied = 0;

                for (String[] attempt : attempts) {
                    if (attempt[0].equals(modifiers[i])) {
                        String answer = classifyAccess(
                                attempt[0], attempt[1]);

                        if (answer.equals("ALLOWED"))
                            allowed++;
                        else
                            denied++;
                    }
                }

                if (i > 0) {
                    StringBuilder append = result.append(" | ");
                }

                result.append(modifiers[i]).append(": ").append(allowed).append(" allowed / ").append(denied).append(" denied");
            }

            return result.toString();
        }

        public static void main() {

            System.out.println(classifyAccess("private", "SAME_CLASS"));

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
