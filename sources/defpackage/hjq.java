package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* renamed from: hjq  reason: default package */
/* loaded from: classes.dex */
public final class hjq {
    public static hst a;
    private static final AtomicBoolean b = new AtomicBoolean(true);

    public static atw a(Context context) {
        c(context);
        return atb.c(context);
    }

    public static Object b(Uri uri, iil iilVar) {
        if (!iin.c(uri)) {
            if (uri == null) {
                return Uri.EMPTY;
            }
            if (uri.getScheme() != null) {
                return uri;
            }
            String uri2 = uri.toString();
            if (TextUtils.isEmpty(uri2)) {
                return Uri.EMPTY;
            }
            if (uri2.charAt(0) == '/') {
                return iin.a(uri2);
            }
            Uri parse = Uri.parse(uri2);
            return parse.getScheme() == null ? iin.a(uri2) : parse;
        }
        return new hjo(new aze(uri.toString()), iilVar);
    }

    public static void c(Context context) {
        if (hjg.r()) {
            if (a == null) {
                hjp hjpVar = new hjp(context.getApplicationContext());
                a = hjpVar;
                hjpVar.g(gyc.b);
            }
            if (b.get()) {
                return;
            }
            d(context, true);
        }
    }

    public static void d(Context context, boolean z) {
        hjg.q();
        b.set(z);
        atb b2 = atb.b(context);
        axp axpVar = b2.a;
        if (axpVar instanceof hjs) {
            ((hjs) axpVar).a.set(z);
        }
        if (z) {
            b2.f(atj.NORMAL);
            return;
        }
        b2.f(atj.LOW);
        b2.e();
    }

    public static axp e(lcv lcvVar) {
        int i = lcvVar.b;
        return i > 0 ? new hjs(i) : new axq();
    }
}
