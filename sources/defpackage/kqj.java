package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: kqj  reason: default package */
/* loaded from: classes.dex */
public final class kqj {
    public final Context a;
    public final Executor b;
    public String c;
    public opu e;
    private boolean f = false;
    public lgb d = jgf.k;

    public kqj(Context context, Executor executor) {
        this.a = context;
        this.b = executor;
    }

    public final kql a() {
        jdg.w(this.f, "Must specify either forKeys(...) or forAllKeys() before calling build().");
        return new kql(this);
    }

    public final void b() {
        this.f = true;
    }

    public final void c(kqk kqkVar) {
        this.e = new opu(kqkVar);
    }
}
