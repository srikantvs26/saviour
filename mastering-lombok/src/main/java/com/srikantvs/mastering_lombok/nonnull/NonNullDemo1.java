package com.srikantvs.mastering_lombok.nonnull;

import lombok.NonNull;

public class NonNullDemo1 {

    public static String fullNameOld(String firstName, String lastName){
        if(firstName == null || lastName==null){
            throw new NullPointerException("firstName or lastName should not be null, but is null");
        }
        return firstName.concat(lastName);
    }

    // You can use @NonNull on a record component, or a parameter of a method or constructor. This will cause to    lombok generate a null-check statement for you.

    // @NonNull on a method
    public static String fullName(@NonNull String firstName, @NonNull String lastName){
        return firstName.concat(lastName);
    }

    public static void main(String[] args) {
        
        String fullName = fullName("Damien", "Priest");
        System.out.println(fullName);

        String fullName2 = fullName(null, "Balor");
        System.out.println(fullName2);

    }

}
