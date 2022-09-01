package defpackage;

import android.content.Context;
import android.net.Uri;

/* compiled from: PG */
/* renamed from: kjg  reason: default package */
/* loaded from: classes.dex */
public final class kjg {
    private static final qo a = new qo();

    public static synchronized Uri a(String str) {
        synchronized (kjg.class) {
            qo qoVar = a;
            Uri uri = (Uri) qoVar.get(str);
            if (uri == null) {
                Uri parse = Uri.parse("content://com.google.android.gms.phenotype/".concat(String.valueOf(Uri.encode(str))));
                qoVar.put(str, parse);
                return parse;
            }
            return uri;
        }
    }

    public static String b(Context context, String str) {
        if (str.contains("#")) {
            throw new IllegalArgumentException("The passed in package cannot already have a subpackage: ".concat(String.valueOf(str)));
        }
        String packageName = context.getPackageName();
        return str + "#" + packageName;
    }
}
