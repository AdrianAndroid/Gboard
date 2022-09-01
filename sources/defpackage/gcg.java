package defpackage;

import android.content.Context;
import com.google.android.libraries.micore.learning.base.ErrorStatusException;
import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: PG */
/* renamed from: gcg  reason: default package */
/* loaded from: classes.dex */
public final class gcg {
    private static final Pattern a = Pattern.compile("/([a-zA-Z_.]+)/.+?");

    public static File a(Context context, String str) {
        return new File(c(context, str));
    }

    public static File b(Context context, URI uri) {
        String scheme = uri.getScheme();
        if ("appdir".equals(scheme)) {
            return context.getDir(g(uri.getPath())[0], 0);
        }
        if ("appfiles".equals(scheme)) {
            return context.getFilesDir();
        }
        if ("appcache".equals(scheme)) {
            return context.getCacheDir();
        }
        throw ErrorStatusException.b(3, "Unsupported URI scheme: %s", scheme);
    }

    public static String c(Context context, String str) {
        URI e = e(str);
        String path = b(context, e).getPath();
        String scheme = e.getScheme();
        if ("appdir".equals(scheme)) {
            String[] g = g(e.getPath());
            return mhr.a(path, mhr.a((String[]) Arrays.copyOfRange(g, 1, g.length)));
        } else if (!"appfiles".equals(scheme) && !"appcache".equals(scheme)) {
            throw ErrorStatusException.b(3, "Unsupported URI scheme: %s", scheme);
        } else {
            return mhr.a(path, e.getPath());
        }
    }

    public static String d(String str) {
        Matcher matcher = a.matcher(str);
        if (matcher.matches()) {
            return matcher.group(1);
        }
        return null;
    }

    public static URI e(String str) {
        try {
            return new URI(str);
        } catch (URISyntaxException e) {
            throw ErrorStatusException.a(3, e);
        }
    }

    public static void f(File file) {
        File[] listFiles;
        if (!file.isDirectory()) {
            fxa.a(file);
        }
        for (File file2 : file.listFiles()) {
            if (!file2.getName().equals("__brella__")) {
                fxa.a(file2);
            }
        }
    }

    private static String[] g(String str) {
        if (!str.startsWith("/")) {
            throw ErrorStatusException.b(3, "Path is not absolute.", new Object[0]);
        }
        return str.substring(1).split("/");
    }
}
