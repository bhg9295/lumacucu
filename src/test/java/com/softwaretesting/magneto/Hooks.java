package com.softwaretesting.magneto;


import com.softwaretesting.magneto.propertyreader.PropertyReader;
import com.softwaretesting.magneto.utility.Utility;
import io.cucumber.java.After;
import io.cucumber.java.Before;



/**
 * Created by Jay Vaghani
 */
public class Hooks extends Utility {

    @Before
    public void setUp(){
        selectBrowser(PropertyReader.getInstance().getProperty("browser"));
    }


    @After
    public void tearDown(){
       closeBrowser();
    }

}
