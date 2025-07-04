package lib;

public class PasswordValidator {

    /**
     * INVALID รหัสผ่านสั้นไปหรือไม่ตรงเงื่อนไข
     * WEAK    รหัสผ่านมีตัวเล็ก หรือ ใหญ่แต่ไม่มีเลข
     * MEDIUM  รหัสผ่านมีตัวเล็ก และ ใหญ่แต่ไม่มีเลข
     * STRONG  รหัสผ่านมีตัวเล็ก และ ใหญ่ และ มีตัวเลข
     * @param password string รหัสผ่านที่ต้องการตรวจสอบ
     * @return ระดับความปลอดภัยของรหัสผ่าน
     */

    public static PasswordStrength validate(String password) {
        int minLength = 8 ;
        boolean hasLower = false ;
        boolean hasUpper = false ;
        boolean hasNumber = false ;

        if (password.length() < minLength) {
            return PasswordStrength.INVALID ;
        }

        for (char c : password.toCharArray()) {
            if (Character.isLowerCase(c))
                hasLower = true ;

            else if (Character.isUpperCase(c))
                hasUpper = true ;

            else if (Character.isDigit(c))
                hasNumber = true ;
        }
        if (hasLower && hasUpper && hasNumber) return PasswordStrength.STRONG ;

        if (hasLower && hasUpper) return PasswordStrength.MEDIUM ;

        if (hasLower && hasNumber) return PasswordStrength.MEDIUM ;

        if (hasUpper && hasNumber) return PasswordStrength.MEDIUM ;

        if (hasLower && !hasUpper) return PasswordStrength.WEAK ;

        if (!hasLower && hasUpper) return PasswordStrength.WEAK ;


        return PasswordStrength.INVALID ; // TODO: การคืนค่านี้ถูกต้องหรือไม่?
    }
}