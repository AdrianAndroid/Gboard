package defpackage;

import android.content.Context;
import j$.util.concurrent.ConcurrentHashMap;
import java.nio.charset.Charset;

/* compiled from: PG */
/* renamed from: fmn  reason: default package */
/* loaded from: classes.dex */
public final class fmn implements fln {
    public static final Charset a = Charset.forName("UTF-8");
    public static final kjs b;
    public static final ConcurrentHashMap c;
    static Boolean d;
    static Long e;
    public final Context f;

    static {
        kjs kjsVar = new kjs(kjg.a("com.google.android.gms.clearcut.public"));
        if (!kjsVar.e) {
            kjs kjsVar2 = new kjs(kjsVar.b, "gms:playlog:service:samplingrules_", kjsVar.d, false, kjsVar.g, kjsVar.h);
            b = new kjs(kjsVar2.b, kjsVar2.c, "LogSamplingRulesV2__", kjsVar2.e, kjsVar2.g, kjsVar2.h);
            c = new ConcurrentHashMap();
            d = null;
            e = null;
            return;
        }
        throw new IllegalStateException("Cannot set GServices prefix and skip GServices");
    }

    public fmn(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f = applicationContext;
        if (applicationContext != null) {
            kju.f(applicationContext);
        }
    }
}
