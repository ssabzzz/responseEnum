/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enumtrial;

/**
 *
 * @author Zaha
 */
public class EnumTrial {

    enum responseStatus {
        notAnswered(1), Answered(2), Approved(3);

        private int stat;

        public int getStatus() {
            return this.stat;
        }

        private responseStatus(int stat) {
            this.stat = stat;
        }

        public void setValue(int value) {
            this.stat = value;
        }

        public static String getStringValueFromInt(int i) {
            for (responseStatus status : responseStatus.values()) {
                if (status.getStatus() == i) {
                    return status.toString();
                }
            }
            throw new IllegalArgumentException("the given number doesn't match any Status.");
        }

    }

    public static void main(String[] args) {

        trial("Approved", "Answered");
    }
    
    public static void trial(String a, String b) {
        System.out.println(responseStatus.getStringValueFromInt(Math.min(responseStatus.valueOf(a).getStatus(), responseStatus.valueOf(b).getStatus())));

    }
}
