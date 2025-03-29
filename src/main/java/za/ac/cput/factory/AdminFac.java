package za.ac.cput.factory;

import za.ac.cput.domain.Admin;
/*
Author : Natasa Njili
Student.no : 21785345
 */
public class AdminFac {

    public static Admin createAdmin(int adminId, String adminUsername, String adminPassword) {


        return new Admin.Builder()
                .setAdminId(adminId)
                .setAdminUsername(adminUsername)
                .setAdminPassword(adminPassword)
                .build();

    }
}
