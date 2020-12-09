package com.zeoblocks.learning.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * Created with IntelliJ IDEA. 09.12.2020
 *
 * @author Evgeniy Zabozhan (evgzabozhan@gmail.com)
 * @version $
 * @since 1.0
 *
 * This class use reflection
 */
public class Reflection {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class className = Ref.class;
        System.out.println(className);
        Object obj = className.getConstructor().newInstance();
        System.out.println(obj.toString());
        System.out.println(Modifier.toString(className.getModifiers()));

        Field[] fields = className.getDeclaredFields();
        Method[] methods = className.getDeclaredMethods();
        Constructor[] constructors = className.getDeclaredConstructors();

        for(Field f : fields){
            System.out.println(f.getName() + " " + f.getType());
        }

        for(Method m : methods){
            System.out.println(m.getName() + " " + m.getParameterCount());
        }

        for(Constructor c : constructors){
            System.out.println(c.getName() + " " + c.getParameterCount());
        }
    }
}
