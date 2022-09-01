package defpackage;

import android.content.Context;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: hbj  reason: default package */
/* loaded from: classes.dex */
public final class hbj implements hbg {
    public static final ltg a = ltg.j("com/google/android/libraries/inputmethod/emoji/data/StickyVariantsPreferences");
    private static volatile hbj f;
    public final hau b;
    public final Map c = new ConcurrentHashMap();
    public final hbh d;
    public hiz e;
    private final Executor g;
    private hiz h;

    private hbj(Context context, Executor executor) {
        this.b = hau.c(context);
        this.g = executor == null ? gxo.a(10) : executor;
        this.d = new hat(context);
    }

    public static hbj g(Context context, Executor executor) {
        hbj hbjVar = f;
        if (hbjVar == null) {
            synchronized (hbj.class) {
                hbjVar = f;
                if (hbjVar == null) {
                    hbjVar = new hbj(context, executor);
                    hbjVar.h();
                    f = hbjVar;
                }
            }
        }
        return hbjVar;
    }

    private final void h() {
        hiz hizVar = this.e;
        if (hizVar != null && !hizVar.isDone()) {
            this.e.cancel(true);
        }
        hat hatVar = (hat) this.d;
        hiz p = hiz.p(new evl(hatVar, 11), hatVar.c);
        this.e = p;
        this.h = hiz.M(p, this.b.f).d(new evl(this, 13), this.g);
    }

    public final hax a() {
        nfh t = hax.b.t();
        t.cR(this.c);
        return (hax) t.cz();
    }

    @Override // defpackage.hbg
    public final hiz b() {
        return this.h;
    }

    @Override // defpackage.hbg
    public final String c(String str) {
        return (String) this.c.get(this.b.b(str));
    }

    @Override // defpackage.hbg
    public final void d() {
        h();
    }

    @Override // defpackage.hbg
    public final boolean e(String str) {
        String b = this.b.b(str);
        if (!str.equals((String) this.c.get(b))) {
            this.c.put(b, str);
            ((hat) this.d).a(a());
            return true;
        }
        return false;
    }

    @Override // defpackage.hbg
    public final void f() {
    }
}
