package za.ac.cput.repository;

import za.ac.cput.domain.Admin;

import java.util.List;

/*
Author : Natasha Njili
StuDent.no : 221785345
 */
public interface iAdminRepository  extends iRepository<Admin,Integer> {
    List<Admin> getAll();
}
