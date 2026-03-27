package model;


public class Bidder extends User {

    // Các thuộc tính phục vụ chức năng nâng cao Auto-Bidding

    private double maxBid;
    private double increment;
    private boolean autoBiddingEnabled;


    public Bidder(String username, String password, String email) {
        super(username, password, email);
        // Mặc định khi mới tạo tài khoản thì tắt tính năng tự động đấu giá
        this.autoBiddingEnabled = false;
    }

    @Override
    public void showRole() {
        System.out.println("Vai trò: Người tham gia đấu giá (Bidder)");
    }

    // --- Các phương thức đặc thù của Bidder ---

    // Thiết lập tính năng đấu giá tự động với maxBid và increment [cite: 74, 75]
    public void setupAutoBidding(double maxBid, double increment) {
        this.maxBid = maxBid;
        this.increment = increment;
        this.autoBiddingEnabled = true;
        System.out.println(this.getUsername() + " đã bật Auto-Bidding. Max: " + maxBid + ", Bước giá: " + increment);
    }

    public void disableAutoBidding() {
        this.autoBiddingEnabled = false;
        System.out.println(this.getUsername() + " đã tắt Auto-Bidding.");
    }

    // Các hàm Getter để lấy thông tin cấu hình (Dùng cho tầng Service xử lý sau này)
    public double getMaxBid() {
        return maxBid;
    }

    public double getIncrement() {
        return increment;
    }

    public boolean isAutoBiddingEnabled() {
        return autoBiddingEnabled;
    }
}
