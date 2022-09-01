package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Printer;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* renamed from: inq  reason: default package */
/* loaded from: classes.dex */
public final class inq implements ind {
    public final Context a;
    public volatile inc b;
    public volatile boolean c;
    public ija d;
    private volatile boolean e;
    private final AtomicReference f = new AtomicReference();
    private volatile SharedPreferences.Editor g;

    public inq(Context context) {
        this.a = context;
    }

    @Override // defpackage.lgb
    public final /* bridge */ /* synthetic */ Object a() {
        return (SharedPreferences) this.f.get();
    }

    public final SharedPreferences b(SharedPreferences sharedPreferences, boolean z) {
        this.e = z;
        SharedPreferences sharedPreferences2 = (SharedPreferences) this.f.getAndSet(sharedPreferences);
        this.g = sharedPreferences.edit();
        return sharedPreferences2;
    }

    public final void c() {
        if (this.b != null) {
            this.b.b();
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
    }

    @Override // defpackage.ind
    public final SharedPreferences.Editor d() {
        return this.g;
    }

    @Override // defpackage.gzv
    public final /* synthetic */ void dump(Printer printer, boolean z) {
    }

    @Override // defpackage.ind
    public final String e() {
        return String.valueOf(this.a.getPackageName()).concat("_preferences");
    }

    @Override // defpackage.ind
    public final void f(inc incVar) {
        this.b = incVar;
        if (this.c) {
            c();
        }
    }

    @Override // defpackage.ind
    public final boolean g() {
        return this.e;
    }

    @Override // defpackage.gzv
    public final /* synthetic */ String getDumpableTag() {
        return hqs.i(this);
    }
}
