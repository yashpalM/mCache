package wiki.depasquale.mcache;

/**
 * diareuse on 26.03.2017
 */

public class L {

  public static void l(String message) {
    if (message == null) {
      return;
    }
    if (message.contains("sDebug") && MCache.sDebug) {
      android.util.Log.d(MCache.TAG, message);
    } else if (BuildConfig.DEBUG) {
      if (message.contains("error")) {
        android.util.Log.e(MCache.TAG, message);
      } else if (message.contains("warning")) {
        android.util.Log.w(MCache.TAG, message);
      } else {
        android.util.Log.i(MCache.TAG, message);
      }
    }
  }

  public static void debug(String s) {
    l("sDebug: " + s);
  }
}