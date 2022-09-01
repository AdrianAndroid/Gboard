package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Xml;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: PG */
/* renamed from: jfy  reason: default package */
/* loaded from: classes.dex */
public final class jfy implements AutoCloseable {
    public final Context a;
    private jgc d;
    public jls c = null;
    public final Set b = new HashSet();

    private jfy(Context context, jgc jgcVar) {
        this.d = null;
        this.a = context;
        this.d = jgcVar;
    }

    public static void d(Context context, int i, jfx jfxVar) {
        f(context, i, null, jfxVar);
    }

    private final jgc g() {
        jgc jgcVar = this.d;
        if (jgcVar != null) {
            return jgcVar;
        }
        throw new IllegalStateException("The parser has been closed.");
    }

    public final AttributeSet a() {
        return Xml.asAttributeSet(g());
    }

    public final String b() {
        return g().getName();
    }

    public final XmlPullParserException c(String str) {
        return new XmlPullParserException(String.format(Locale.US, "%s (%s)", str, g().getPositionDescription()));
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        jgc jgcVar = this.d;
        if (jgcVar != null) {
            jgcVar.close();
            this.d = null;
        }
    }

    public final void e(jfx jfxVar) {
        jgc g = g();
        jls jlsVar = this.c;
        jfz jfzVar = null;
        if (jlsVar != null) {
            jfzVar = new jfz(jlsVar, null);
        }
        int i = -1;
        for (int eventType = g.getEventType(); eventType != 1; eventType = g.next()) {
            if (eventType != 2) {
                if (eventType == 3 && i == g.getDepth()) {
                    return;
                }
            } else if (i == -1) {
                i = g.getDepth();
            } else if (i == g.getDepth() - 1) {
                if (jfzVar != null) {
                    Set set = this.b;
                    String str = jfzVar.a;
                    String b = b();
                    jfzVar.a = b;
                    if (b == null) {
                        jfxVar.a(this);
                    } else {
                        jfq jfqVar = (jfq) ((llw) jfzVar.b.a).get(b);
                        if (jfqVar == null) {
                            jfxVar.a(this);
                        } else {
                            jfqVar.a(this, jfxVar, str, set);
                        }
                    }
                } else {
                    jfxVar.a(this);
                }
            }
        }
    }

    public static void f(Context context, int i, jls jlsVar, jfx jfxVar) {
        if (context == null) {
            throw new NullPointerException("xmlResId=" + i);
        } else if (i != 0) {
            jfy jfyVar = new jfy(context, new jgc(context, i));
            try {
                jfyVar.c = jlsVar;
                jfyVar.e(jfxVar);
                jfyVar.close();
            } catch (Throwable th) {
                try {
                    jfyVar.close();
                } catch (Throwable th2) {
                    try {
                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                    } catch (Exception unused) {
                    }
                }
                throw th;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }
}
