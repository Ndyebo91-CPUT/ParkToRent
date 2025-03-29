


package za.ac.cput.repository;

import za.ac.cput.domain.Admin;

import java.util.ArrayList;
import java.util.List;


/*
Aouthor : Natasha Njili
Student.no : 221785345
 */
public class AdminRepository  implements iAdminRepository{
    private static iAdminRepository repository= null;
    private List<Admin> adminList;

    private AdminRepository(){
        adminList = new ArrayList<Admin>();
    }

    public static iAdminRepository getInstance(){
        if ( repository==null){
            repository= new AdminRepository();
        }
        return repository;
    }
    @Override
    public List<Admin> getAll() {
        return adminList;
    }

    @Override
    public boolean create(Admin admin) {
        return adminList.add(admin);
    }

    @Override
    public Admin read(Integer adminId) {
        for(Admin admin :adminList){
            if(admin.getAdminId()==adminId){
                return admin;
            }
        }
        return null;
    }

    @Override
    public Admin update(Admin admin) {
        for(int i =0 ;i<adminList.size();i++){
            Admin admin1 = adminList.get(i);
            if(admin1.getAdminId()==admin.getAdminId()){
                adminList.set(i,admin);
                return admin;
            }
        }
        return null;
    }

    @Override
    public boolean delete(Integer adminId) {
        Admin admin =  read(adminId);
        if(admin!=null){
            adminList.remove(admin);
            return true ;
        }
        return false;
    }
}
