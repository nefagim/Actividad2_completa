package ar.edu.udeci.pv;

import org.apache.commons.cli.*;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class App {

    static Logger logger = Logger.getLogger(App.class);

    public static void main(String[] args) {

        PropertyConfigurator.configure(App.class.getClassLoader().getResource("log4j.properties"));

        Options options = new Options();
        options.addOption("n", "nombre", true, "Nombre del usuario");
        options.addOption("h", "help", false, "Mostrar ayuda");

        CommandLineParser parser = new DefaultParser();
        HelpFormatter formatter = new HelpFormatter();

        try {
            CommandLine cmd = parser.parse(options, args);

            if (cmd.hasOption("h")) {
                formatter.printHelp("Actividad2", options);
                return;
            }

            String nombre = cmd.getOptionValue("n", "Invitado");
            logger.info("La aplicación fue ejecutada por: " + nombre);
            System.out.println("¡Hola, " + nombre + "!");

        } catch (ParseException e) {
            logger.error("Error al parsear los argumentos", e);
            formatter.printHelp("Actividad2", options);
        }
    }
}
