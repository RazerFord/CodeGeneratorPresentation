package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.utbot.runtime.utils.java.UtUtils.createInstance;
import static org.utbot.runtime.utils.java.UtUtils.setField;

public final class ConnectionImplTest {
    ///region Test suites for executable org.example.ConnectionImpl.createUserById

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method createUserById(int, java.lang.String, int)

    /**
     * @utbot.classUnderTest {@link ConnectionImpl}
     * @utbot.methodUnderTest {@link ConnectionImpl#createUserById(int, String, int)}
     * @utbot.executesCondition {@code (id < 0): False}
     * @utbot.executesCondition {@code (age < 0): False}
     * @utbot.invokes {@link String#length()}
     * @utbot.invokes {@link User2#id(int)}
     * @utbot.invokes {@link User2#name(String)}
     * @utbot.invokes {@link User2#age(int)}
     * @utbot.returnsFrom {@code return user;}
     */
    @Test
    @DisplayName("createUserById: id < 0 : False -> return user")
    public void testCreateUserById_AgeGreaterOrEqualZero() throws Exception {
        ConnectionImpl connectionImpl = new ConnectionImpl();
        String name = " ";
        User2 actual = connectionImpl.createUserById(0, name, 0);
        User2 expected = ((User2) createInstance("org.example.User2"));
        setField(expected, "org.example.User2", "name", name);
        assertEquals(expected, actual);
    }
    ///endregion

    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method createUserById(int, java.lang.String, int)

    /**
     * @utbot.classUnderTest {@link ConnectionImpl}
     * @utbot.methodUnderTest {@link ConnectionImpl#createUserById(int, String, int)}
     * @utbot.executesCondition {@code (id < 0): True}
     * @utbot.throwsException {@link IllegalArgumentException} when: id < 0
     */
    @Test
    @DisplayName("createUserById: id < 0 -> ThrowIllegalArgumentException")
    public void testCreateUserById_ThrowIllegalArgumentException() {
        ConnectionImpl connectionImpl = new ConnectionImpl();

        assertThrows(IllegalArgumentException.class, () -> connectionImpl.createUserById(-1, null, -255));
    }

    /**
     * @utbot.classUnderTest {@link ConnectionImpl}
     * @utbot.methodUnderTest {@link ConnectionImpl#createUserById(int, String, int)}
     * @utbot.executesCondition {@code (id < 0): False}
     * @utbot.executesCondition {@code (age < 0): True}
     * @utbot.throwsException {@link IllegalArgumentException} when: age < 0
     */
    @Test
    @DisplayName("createUserById: age < 0 -> ThrowIllegalArgumentException")
    public void testCreateUserById_ThrowIllegalArgumentException_1() {
        ConnectionImpl connectionImpl = new ConnectionImpl();

        assertThrows(IllegalArgumentException.class, () -> connectionImpl.createUserById(0, null, -1));
    }
    ///endregion

    ///region SYMBOLIC EXECUTION: ERROR SUITE for method createUserById(int, java.lang.String, int)

    /**
     * @utbot.classUnderTest {@link ConnectionImpl}
     * @utbot.methodUnderTest {@link ConnectionImpl#createUserById(int, String, int)}
     * @utbot.executesCondition {@code (id < 0): False}
     * @utbot.executesCondition {@code (age < 0): False}
     * @utbot.invokes {@link String#length()}
     * @utbot.throwsException {@link NullPointerException} in: name.length();
     */
    @Test
    @DisplayName("createUserById: name.length() : True -> ThrowNullPointerException")
    public void testCreateUserById_ThrowNullPointerException() {
        ConnectionImpl connectionImpl = new ConnectionImpl();
        
        /* This test fails because method [org.example.ConnectionImpl.createUserById] produces [java.lang.NullPointerException]
            org.example.ConnectionImpl.createUserById(ConnectionImpl.java:10) */
        connectionImpl.createUserById(0, null, 0);
    }
    ///endregion

    ///endregion
}
