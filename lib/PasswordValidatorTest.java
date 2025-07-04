package lib;

public class PasswordValidatorTest{
    
    public static void run() {
        System.out.println("--- Running Password Validator Tests ---");
        
        // Test Case 1: รหัสผ่านสั้นจะ INVALID

        String pw = "123" ;
        PasswordStrength result1 = PasswordValidator.validate(pw);
        if (result1 == PasswordStrength.INVALID) {
            System.out.println("Test Case 1 : "+pw+" : Passed: Short password is INVALID.");
        } else {
            System.out.println("Test Case 1 : "+pw+" : FAILED: Expected INVALID but got " + result1);
        }
        // Test Case 2: รหัสผ่านตัวเล็กหมดจะ WEAK

        pw = "asdfghjkl" ;
        PasswordStrength result2 = PasswordValidator.validate(pw);
        if (result2 == PasswordStrength.WEAK) {
            System.out.println("Test Case 2 : "+pw+" : Passed: All lowercase password is WEAK.");
        } else {
            System.out.println("Test Case 2 : "+pw+" : FAILED: Expected INVALID but got " + result2);
        }
        // Test Case 3: รหัสผ่านตัวใหญ่หมดจะ WEAK

        pw = "ASDFGHJKL" ;
        PasswordStrength result3 = PasswordValidator.validate(pw);
        if (result3 == PasswordStrength.WEAK) {
            System.out.println("Test Case 3 : "+pw+" : Passed: All uppercase password is WEAK.");
        } else {
            System.out.println("Test Case 3 : "+pw+" : FAILED: Expected INVALID but got " + result3);
        }
        // Test Case 4: รหัสผ่านตัวเล็กและเลขจะ MEDUIM

        pw = "ASDFGHJKL123" ;
        PasswordStrength result4 = PasswordValidator.validate(pw);
        if (result4 == PasswordStrength.MEDIUM) {
            System.out.println("Test Case 4 : "+pw+" : Passed: Uppercase and number password is MEDIUM.");
        } else {
            System.out.println("Test Case 4 : "+pw+" : FAILED: Expected INVALID but got " + result4);
        }
        // Test Case 5: รหัสผ่านตัวใหญ่และเลขจะ MEDUIM

        pw = "asdfghjkkkl123" ;
        PasswordStrength result5 = PasswordValidator.validate(pw);
        if (result5 == PasswordStrength.MEDIUM) {
            System.out.println("Test Case 5 : "+pw+" : Passed: Lowercase password is MEDIUM.");
        } else {
            System.out.println("Test Case 5 : "+pw+" : FAILED: Expected INVALID but got " + result5);
        }
        // Test Case 6: รหัสผ่านตัวเล็กใหญ่และเลขจะ STRONG

        pw = "Asdfghjkkkl123" ;
        PasswordStrength result6 = PasswordValidator.validate(pw);
        if (result6 == PasswordStrength.STRONG) {
            System.out.println("Test Case 6 : "+pw+" : Passed: Upper-lowercase and number password is STRONG.");
        } else {
            System.out.println("Test Case 6 : "+pw+" : FAILED: Expected INVALID but got " + result6);
        }

        System.out.println("--------------------------------");
    }
}
