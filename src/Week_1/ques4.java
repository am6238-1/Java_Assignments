package Week_1;

 class ques4 {
        static void analyzeInventory(int[] sectionA, int[] sectionB) {

            int high = sectionA[0];
            int totA=0;
            int totB=0;
            String section = "Section A";
            int index = 0;

            for (int i = 0; i < sectionA.length; i++) {

                totA = totA + sectionA[i];
                totB = totB + sectionB[i];

                if (sectionA[i] > high) {
                    high = sectionA[i];
                    section = "Section A";
                    index = i;
                }

                if (sectionB[i] > high) {
                    high = sectionB[i];
                    section = "Section B";
                    index = i;
                }
            }

    String status;

            if (totA == totB) {
                status = "Balanced";
            } else {
                status = "Not Balanced";
            }

            System.out.println("Section A Total: "+totA);
            System.out.println("Section A Total: "+totB);
                   System.out.print("Highest Quantity: " + high
                    + " (" + section + ", Item " + (index + 1) + ")");
        }

        public static void main(String[] args) {

            int[] sectionA = {20, 15, 30};
            int[] sectionB = {25, 10, 30};

            analyzeInventory(sectionA, sectionB);
        }
    }


