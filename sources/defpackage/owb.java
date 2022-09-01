package defpackage;

import j$.nio.charset.StandardCharsets;
import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;
import java.util.Iterator;

/* compiled from: PG */
/* renamed from: owb  reason: default package */
/* loaded from: classes2.dex */
public final class owb {
    static {
        a("UTF8");
    }

    public static owa a(String str) {
        Charset defaultCharset = Charset.defaultCharset();
        if (str != null) {
            try {
                defaultCharset = Charset.forName(str);
            } catch (UnsupportedCharsetException unused) {
            }
        }
        String name = defaultCharset.name();
        if (name == null) {
            name = Charset.defaultCharset().name();
        }
        boolean z = true;
        if (!StandardCharsets.UTF_8.name().equalsIgnoreCase(name)) {
            Iterator<String> it = StandardCharsets.UTF_8.aliases().iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                } else if (it.next().equalsIgnoreCase(name)) {
                    break;
                }
            }
        }
        return new ovz(defaultCharset, z);
    }
}
