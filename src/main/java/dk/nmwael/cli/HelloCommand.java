package dk.nmwael.cli;

import picocli.CommandLine.Command;

@Command(name = "hello", mixinStandardHelpOptions = true, description = "Greet someone")
public class HelloCommand {
    
}
