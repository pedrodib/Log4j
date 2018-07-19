package br.com.devph;

import java.util.logging.Logger;

/**
 * Hello world!
 *
 */
public class App 
{
    private final static Logger logger = Logger.getLogger("App");
    public static void main( String[] args )
    {
        logger.info("Starting Worker");
        try {
            logger.info("Do something here");
            
            throw new Exception("Customer not defined");
        }catch (Exception ex) {
            logger.severe(ex.getMessage());
        }

        logger.info("Finish Worker");
    }
}
