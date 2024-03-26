package com.example.bai_tap_ngay_2603;

public class EmailRegistration {
    private String email; // Đúng vị trí khai báo biến instance

    public EmailRegistration() {
        // Constructor không cần khai báo biến ở đây
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Phương thức kiểm tra và đăng ký email
    public boolean registerEmail(String email) {
        if (email == null || email.length() < 10 || email.length() > 50) {
            System.out.println("Email không hợp lệ.");
            return false;
        }
        // Thêm logic để đăng ký email
        return true;
    }
}
