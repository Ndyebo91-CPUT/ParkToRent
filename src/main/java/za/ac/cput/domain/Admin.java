package za.ac.cput.domain;
/*
Author :Natasha Njili
Student.no :221785345
 */
public class Admin {

    private int adminId;
    private String adminUsername;
    private String adminPassword;

    public Admin() {
    }

    private Admin(Builder builder){
        this.adminId = builder.adminId;
        this.adminUsername = builder.adminUsername;
        this.adminPassword = builder.adminPassword;
    }
    public int getAdminId() {
        return adminId;
    }

    public String getAdminUsername() {
        return adminUsername;
    }
    public String getAdminPassword() {
        return adminPassword;
    }
    public static class Builder{
        private int adminId;
        private String adminUsername;
        private String adminPassword;

        public Builder() {
        }

        public Builder(int adminId , String adminUsername, String adminPassword){
            this.adminId = adminId;
            this.adminPassword = adminPassword;
            this.adminUsername = adminUsername;
        }

        public Builder setAdminId(int adminId) {
            this.adminId = adminId;
            return this;
        }

        public Builder setAdminUsername(String adminUsername) {
            this.adminUsername = adminUsername;
            return this;
        }

        public Builder setAdminPassword(String adminPassword) {
            this.adminPassword = adminPassword;
            return this;
        }

        public Admin build(){
            return   new Admin(this);

        }
    }

}
