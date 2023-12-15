
package com.mycompany.coffeeshopsystem;


public class CredentialsHolder {
  private static String username;
    private static String password;

    public static void setCredentials(String username, String password) {
        CredentialsHolder.username = username;
        CredentialsHolder.password = password;
    }

    public static String[] getCredentials() {
        if (hasCredentials()) {
            return new String[] { username, password };
        } else {
            return null;
        }
    }

    public static void clearCredentials() {
        username = null;
        password = null;
    }

    public static boolean hasCredentials() {
        return username != null && password != null;
    }
}
