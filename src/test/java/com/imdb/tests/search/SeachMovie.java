package com.imdb.tests.search;

import com.imdb.tests.BaseTest;
import org.junit.Test;

public class SeachMovie extends BaseTest {
    @Test
    public void testeSearhMovie(){
        home.searchMovie("It");

    }
}
