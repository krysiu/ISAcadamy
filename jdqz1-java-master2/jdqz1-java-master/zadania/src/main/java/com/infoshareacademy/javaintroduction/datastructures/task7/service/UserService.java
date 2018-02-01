package com.infoshareacademy.javaintroduction.datastructures.task7.service;

import com.infoshareacademy.javaintroduction.datastructures.task7.domain.Permission;
import com.infoshareacademy.javaintroduction.datastructures.task7.domain.Person;
import com.infoshareacademy.javaintroduction.datastructures.task7.domain.Role;
import com.infoshareacademy.javaintroduction.datastructures.task7.domain.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

public class UserService {

    public static List<User> findUsersWhoHaveMoreThanOneAddress(List<User> users) {
        List<User> listaOdfiltrowana = new ArrayList<>();
        for (User user : users){
            if (user.getPersonDetails().getAddresses().size() > 1){
                listaOdfiltrowana.add(user);
            }
        }

        return listaOdfiltrowana;
    }

    public static Person findOldestPerson(List<User> users) {
        Person OldestPerson = users.get(0).getPersonDetails();
        for (User user : users){
            if (user.getPersonDetails().getAge() > OldestPerson.getAge()){
               OldestPerson = user.getPersonDetails();
            }
        }

        return OldestPerson;
    }

    public static Person findUserWithLongestUsername(List<User> users) {
        Person longestUsername = users.get(0).getPersonDetails();
        for (User user : users){
            if (user.getPersonDetails().getName().length() > longestUsername.getName().length()){
                longestUsername = user.getPersonDetails();
            }
        }

        return longestUsername;

    }

    public static String getNamesAndSurnamesCommaSeparatedOfAllUsersAbove18(List<User> users) {
        StringBuilder getNameAndSurnameAbove18 = new StringBuilder();
        for (User user : users){
            if (user.getPersonDetails().getAge() > 18){
                Person person = user.getPersonDetails();
                getNameAndSurnameAbove18.append(person.getName()).append(", ").append(person.getSurname()).append(", ");
            }
        }

        return getNameAndSurnameAbove18.toString();
    }

    public static TreeSet<String> getSortedPermissionsOfUsersWithNameStartingWithA(List<User> users) {
        TreeSet<String> getSortedPermissions = new TreeSet<>();
        for (User user : users){
            if (user.getPersonDetails().getName().startsWith("A")){
                for (Permission permission : user.getPersonDetails().getRole().getPermissions())
                    getSortedPermissions.add(permission.getName());
            }
        }

        return getSortedPermissions;
    }

    public static void printCapitalizedPermissionNamesOfUsersWithSurnameStartingWithS(List<User> users) {


    }

    public static Map<Role, List<User>> groupUsersByRole(List<User> users) {

        return null;
    }

    public static Map<Boolean, List<User>> partitionUserByUnderAndOver18(List<User> users) {

        return null;
    }
}