module com.balaniuc.anton {
    requires com.fasterxml.jackson.annotation;
    requires com.fasterxml.jackson.databind;
    requires java.net.http;

    exports com.balaniuc.anton to com.fasterxml.jackson.databind;
}