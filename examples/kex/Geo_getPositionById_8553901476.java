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
import static org.example.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.example.EqualityUtils.*;
import java.lang.Object;

public class Geo_getPositionById_8553901476 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14463;
     Object term14467;

    public Geo_getPositionById_8553901476() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14463 = newInstance(Class.forName("org.example.Geo"));
        Object[] term14419 = (Object[]) newArray("org.example.Point2", 12);
        setField(term14463, term14463.getClass(), "points", term14419);
        term14467 = newInstance(Class.forName("org.example.Geo"));
        Object[] term14468 = (Object[]) newArray("org.example.Point2", 12);
        setField(term14467, term14467.getClass(), "points", term14468);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.example.Geo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        Object retValue = callMethod(klass, "getPositionById", argTypes, term14463, args);
        assertTrue(recursiveEquals(term14463, term14467));
        assertTrue(recursiveEquals(retValue, null));
    }

};


