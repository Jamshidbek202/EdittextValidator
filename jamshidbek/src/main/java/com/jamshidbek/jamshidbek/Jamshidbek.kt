package com.jamshidbek.jamshidbek

class Jamshidbek {

    companion object{

        fun checkIfEmpty(input: String) : Boolean{
            return input == ""
        }

        fun checkPassword(password: String) : Boolean{
            return password.length >= 8
        }

        fun checkPasswordMatch(password: String, confirmPassword: String) : Boolean{
            return password == confirmPassword || password.length >= 8 || confirmPassword.length >= 8
        }

        fun checkYearValidity(year: String) : Boolean{
            return year.length == 4
        }
    }
}