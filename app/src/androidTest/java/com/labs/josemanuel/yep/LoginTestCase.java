package com.labs.josemanuel.yep;

import android.test.ActivityInstrumentationTestCase2;
import android.test.TouchUtils;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by JoseManuel on 07/03/2016.
 */
public class LoginTestCase extends ActivityInstrumentationTestCase2<LoginActivity> {
    private static final String USERNAME = "jose";
    private static final String PASSWORD = "1 2 3";
    private static final String VACIO = "";
    private LoginActivity actividad;
    private Button loginBtn;
    private EditText usuario;
    private EditText password;

    public LoginTestCase() {
        super(LoginActivity.class);

    }
    protected void setUp() throws Exception {
        super.setUp();
        actividad = getActivity();
        usuario = (EditText) actividad.findViewById(R.id.userField);
        password = (EditText) actividad.findViewById(R.id.passField);
        loginBtn = (Button) actividad.findViewById(R.id.button_login);

    }

    protected void tearDown() throws Exception {
        super.tearDown();

    }

    public void test1() {
        //on value 1 entry
        TouchUtils.tapView(this, usuario);
        getInstrumentation().sendStringSync(VACIO);
        // now on value2 entry
        TouchUtils.tapView(this, password);
        getInstrumentation().sendStringSync(VACIO);
        // now on Add button
        TouchUtils.clickView(this, loginBtn);

    }
  /*  public void test2() {

        //on value 1 entry
        TouchUtils.tapView(this, usuario);
        getInstrumentation().sendStringSync(USERNAME);

        // now on value2 entry
        TouchUtils.tapView(this, password);
        sendKeys(PASSWORD);

        // now on Add button
        TouchUtils.clickView(this, loginBtn);

        String usuario = ParseUser.getCurrentUser().getUsername();

        assertTrue("Add result should be...", usuario.equals(USERNAME));


    }*/
}