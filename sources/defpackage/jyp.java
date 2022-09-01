package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;

/* compiled from: PG */
/* renamed from: jyp  reason: default package */
/* loaded from: classes.dex */
public final class jyp implements jzm {
    private final Context a;
    private final Class b;
    private final boolean c;

    public jyp(Context context, Class cls) {
        this.a = context;
        this.b = cls;
        this.c = f(context, cls);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean f(Context context, Class cls) {
        try {
            Bundle bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, cls), 128).metaData;
            if (bundle != null) {
                return bundle.getBoolean("com.google.android.libraries.micore.superpacks.scheduling.require_notification", true);
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        lug lugVar = jsh.a;
        cls.getCanonicalName();
        return true;
    }

    private static void g(jsz jszVar) {
        if (((jrk) jszVar.a()).b != ((jrk) ((jrl) jyo.a).a).b || ((jrk) jszVar.a()).a != ((jrk) ((jrl) jyo.a).a).a) {
            throw new IllegalArgumentException("This scheduler does not support constraints");
        }
        if (!jszVar.b()) {
            throw new IllegalArgumentException("This scheduler only supports running in foreground");
        }
    }

    @Override // defpackage.jzm
    public final void a(jsz jszVar) {
        if (!jszVar.b()) {
            return;
        }
        g(jszVar);
        ahh.a(this.a).d(new Intent("com.google.android.libraries.micore.superpacks.scheduling.fg_cancel"));
    }

    @Override // defpackage.jzm
    public final void b() {
        a(jyo.a);
    }

    @Override // defpackage.jzm
    public final void c(jsz jszVar) {
        g(jszVar);
        ahh.a(this.a).d(new Intent("com.google.android.libraries.micore.superpacks.scheduling.fg_reset_timeout"));
    }

    @Override // defpackage.jzm
    public final void d(jsz jszVar, int i) {
        g(jszVar);
        if (i != 0) {
            throw new IllegalArgumentException("This scheduler only supports immediate tasks");
        }
        Intent intent = new Intent(this.a, this.b);
        if (Build.VERSION.SDK_INT < 26 || !this.c) {
            this.a.startService(intent);
        } else {
            this.a.startForegroundService(intent);
        }
    }

    @Override // defpackage.jzm
    public final boolean e(jsz jszVar) {
        return jszVar.b();
    }
}
