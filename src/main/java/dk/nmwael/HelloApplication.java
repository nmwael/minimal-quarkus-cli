package dk.nmwael;

import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import jakarta.inject.Inject;
import picocli.CommandLine;

@QuarkusMain
public class HelloApplication implements QuarkusApplication {

    private CommandLine.IFactory factory;

    @Inject
    public HelloApplication(CommandLine.IFactory factory){
        this.factory=factory;

    }

    @Override
    public int run(String... args) throws Exception {
         return new CommandLine(this, factory).execute(args);
    }
    
}
