package Utils;


/**
 * Enumeration related toolkit.
 * 
 * @version $Id: $
 */
public final class EnumUtil {


    /** The default popup timeout. */
    public static final int DEFAULT_POPUP_TIME_OUT = 10000;

    /** Forward slash. */
    public static final String FORWARD_SLASH = "//";

    /** css key. */
    public static final String CSS_KEY = "css=";

    /** Label key. */
    public static final String LABEL_KEY = "label=";

    /** id key. */
    public static final String ID_KEY = "id=";
    
    /** id key. */
    public static final String NAME_KEY = "name=";

    /** id key. */
    public static final String CLASS_NAME = "classname=";

    /** id key. */
    
    /** id key. */
    public static final String TAG_NAME = "tagName=";

    /** id key. */

    public static final String PARTIAL_LINK_TEXT = "partialLinkText=";

    /** post timeout. */
    public static final String TIME_OUT_POST_MESSAGE = "] does not show up";

    /** pre timeout. */
    public static final String TIME_OUT_PRE_MESSAGE = "Before time is out, expected alert: [";

    /** Base URL. */
    private static String baseUrl;

    /**
     * get base URL.
     * 
     * @return base URL.
     */
    public static String getBaseUrl() {
        return EnumUtil.baseUrl;
    }

    /**
     * set base URL.
     * 
     * @param baseUrl base URL.
     */
    public static void setBaseUrl(final String baseUrl) {
        EnumUtil.baseUrl = baseUrl;
    }

    /**
     * empty private constructor.
     */
    private EnumUtil() {
    }

}
