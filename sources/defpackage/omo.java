package defpackage;

import java.nio.charset.Charset;

/* compiled from: PG */
/* renamed from: omo  reason: default package */
/* loaded from: classes2.dex */
public final class omo {
    public static final Charset a;

    static {
        Charset forName = Charset.forName("UTF-8");
        oll.d(forName, "forName(\"UTF-8\")");
        a = forName;
        oll.d(Charset.forName("UTF-16"), "forName(\"UTF-16\")");
        oll.d(Charset.forName("UTF-16BE"), "forName(\"UTF-16BE\")");
        oll.d(Charset.forName("UTF-16LE"), "forName(\"UTF-16LE\")");
        oll.d(Charset.forName("US-ASCII"), "forName(\"US-ASCII\")");
        oll.d(Charset.forName("ISO-8859-1"), "forName(\"ISO-8859-1\")");
    }
}
