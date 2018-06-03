
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class LocatedClass {

    static Logger LOG = Logger.getLogger(LocatedClass.class.getName());

    public static void main(String[] args) throws IOException {

        FileHandler fh = new FileHandler("/home/max/Hillel /JAVAElementary/HomeWork20_Logging/LogFile.log");
        SimpleFormatter formatter = new SimpleFormatter();
        fh.setFormatter(formatter);
        LOG.addHandler(fh);

       try {
            throw new NullPointerException("ERROR");
        }catch (Exception e){
            LOG.info(e.getMessage());
        }
    }
}
