package nomber_5;

public class ThrowsDemo {
    public void printMessage(String key) {
        String message = getDetails(key);
        System.out.println(message);
    }

    public String getDetails(String key) {
        try {
            if (key == null) {
                throw new NullPointerException(" null key in getDetails");
            }

        } catch (NullPointerException ex) {
           System.err.println(ex.getMessage());
        }
        return "data for " + key;
    }


}
