package com.imdb.tests.registration;

import com.imdb.tests.BaseTest;
import org.junit.Test;

public class registerTest extends BaseTest {

    @Test
    public void testRegisterNewUser() {
        home.navegar("https://imdb.com");
        home.verificarPagina();
        home.clickSignIn();
        login.clickCrearCuenta();
        createAccount.crearCuenta("Luis","luis@gmail.com","12345678");
        home.verificarNombreUsuario("Luis");
        //login.comenzarRegistro();
        //createAccount.crearUsuario("user", "email", "password");
    }
}
