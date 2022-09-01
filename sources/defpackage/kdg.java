package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: kdg  reason: default package */
/* loaded from: classes.dex */
public final class kdg {
    public final Object a;

    public kdg(Context context) {
        new ConcurrentHashMap();
        kqn.d(context != null, "Context cannot be null", new Object[0]);
        this.a = context.getApplicationContext();
    }

    public kdg(SharedPreferences sharedPreferences) {
        this.a = sharedPreferences;
    }

    public kdg(Object obj) {
        this.a = obj;
    }

    public kdg(kcm kcmVar) {
        this.a = kcmVar;
    }

    public kdg(khj khjVar) {
        this.a = khjVar;
    }

    public kdg(mjd mjdVar) {
        this.a = mjdVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.content.SharedPreferences, java.lang.Object] */
    public final llw a() {
        jdg.w(true, "SharedPreferencesView#getAll() not available on key migration");
        return llw.k(this.a.getAll());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.content.SharedPreferences, java.lang.Object] */
    public final long b(String str) {
        return this.a.getLong(str, 0L);
    }

    public final koq c() {
        return new koq(this, null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d(Object obj, Executor executor) {
        jdg.u(executor);
        if (obj != 0) {
            ((mjd) this.a).a(obj, executor);
        }
    }

    public kdg() {
        this.a = new ConcurrentHashMap();
    }
}
