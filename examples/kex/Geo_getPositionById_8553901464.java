package org.example;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.lang.NullPointerException;
import static org.example.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Geo_getPositionById_8553901464 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4005;
     Object term4006;

    public Geo_getPositionById_8553901464() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4005 = newInstance(Class.forName("org.example.Geo"));
        setField(term4005, term4005.getClass(), "points", null);
        term4006 = newInstance(Class.forName("java.lang.Integer"));
        setIntField(term4006, term4006.getClass(), "value", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.example.Geo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term4006;
        try {
            callMethod(klass, "getPositionById", argTypes, term4005, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


