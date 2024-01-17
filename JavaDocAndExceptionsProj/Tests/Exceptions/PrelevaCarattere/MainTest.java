package Exceptions.PrelevaCarattere;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    @Test
    public void Foo() {
        String varToCheck = "asdfghjkl";

        for (int i = 0; i < varToCheck.length(); i++) {
            int indexToCheck = i;
            assertDoesNotThrow(() -> Main.ManageInput(varToCheck, indexToCheck));
        }
    }

    @Test
    public void Bar() {
        String toCheck = "Hello";
        assertDoesNotThrow(() -> Main.ManageInput(toCheck, toCheck.length()));
        assertDoesNotThrow(() -> Main.ManageInput(toCheck, -1));
    }

}