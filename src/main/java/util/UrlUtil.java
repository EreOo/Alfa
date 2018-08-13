package util;

/**
 * Created Vladimir Shekhavtsov.
 * Create and return correct name search site format for naming in FileSaver.class.
 */
public class UrlUtil {

    public static String getSearchSite(String url) {
        return url.split("[.]")[1];
    }
}
