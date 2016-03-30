public class IPValidator {
    
    // ip
    public boolean Validate(String IP) {
        boolean results;
        if (IP.matches("^(?:[0-9]{1,3}\\.){3}[0-9]{1,3}$")) {
            results = true;
        }
        else {
            results = false;
        }
        return results;
    }
}
