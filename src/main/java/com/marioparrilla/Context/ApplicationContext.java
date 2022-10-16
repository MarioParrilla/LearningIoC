package com.marioparrilla.Context;

public interface ApplicationContext {

    /**
     * @param cest List of the classes that has the eggs to inject
     * @return ApplicationContext current context
     */
    ApplicationContext registerCestEggsClass(Class<?>[] cest);

    /**
     * @param classes List of the classes to scan and inject the eggs
     * @return ApplicationContext current context
     */
    ApplicationContext classesToScan(Class<?>[] classes);

    /**
     * Create the context calling submethods to get the eggs of the classes and inject the eggs.
     * @return ApplicationContext current context
     * @throws Exception
     */
    ApplicationContext run() throws Exception;


    /**
     * In the future you can set a custom name to the eggs
     * @param eggName The name of the egg
     * @return The egg that was saved with this name
     */
    Object getEgg(String eggName);

    /**
     * In the future you can set a custom name to the eggs
     * @param clazz The class of the egg
     * @return The egg that was saved with this class
     */
    <T> T getEgg(Class<T> clazz);


    /**
     * In the future you can set a custom name to the eggs
     * @param eggName The name of the egg
     * @param clazz The class of the egg
     * @return The egg that was saved with this class and name
     */
    <T> T getEgg(String eggName, Class<T> clazz);

    /**
     * @param eggName The name of the egg
     * @return True if it has this egg else false
     */
    boolean containsEgg(String eggName);

    /**
     * @param clazz The class of the egg
     * @return True if it has this egg else false
     */
    boolean containsEgg(Class<?> clazz);

    /**
     * @param eggName The name of the egg
     * @param clazz The class of the egg
     * @return True if it has this egg else false
     */
    boolean containsEgg(String eggName, Class<?> clazz);
}
