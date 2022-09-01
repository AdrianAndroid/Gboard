package defpackage;

import android.view.inputmethod.CompletionInfo;
import j$.util.Objects;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* renamed from: hmd  reason: default package */
/* loaded from: classes.dex */
public final class hmd implements hls {
    public final hls a;
    private final mkr b = gyc.b;

    public hmd(hls hlsVar) {
        this.a = hlsVar;
    }

    private final Object k(Callable callable) {
        if (hjg.r()) {
            try {
                return callable.call();
            } catch (Exception unused) {
                return null;
            }
        }
        mko hQ = this.b.hQ(callable);
        while (true) {
            try {
                return hQ.get();
            } catch (InterruptedException unused2) {
            } catch (ExecutionException unused3) {
                return null;
            }
        }
    }

    private final void m(Runnable runnable) {
        if (hjg.r()) {
            runnable.run();
        } else {
            this.b.execute(runnable);
        }
    }

    @Override // defpackage.hlq
    public final void B() {
        hls hlsVar = this.a;
        Objects.requireNonNull(hlsVar);
        m(new gxd(hlsVar, 11));
    }

    @Override // defpackage.hlq
    public final void C(int i, int i2) {
        m(new esy(this, i, i2, 2));
    }

    @Override // defpackage.hlq
    public final void D() {
        hls hlsVar = this.a;
        Objects.requireNonNull(hlsVar);
        m(new gxd(hlsVar, 12));
    }

    @Override // defpackage.hlq
    public final void G() {
        hls hlsVar = this.a;
        Objects.requireNonNull(hlsVar);
        m(new gxd(hlsVar, 13));
    }

    @Override // defpackage.hlq
    public final void M(int i, int i2) {
        m(new esy(this, i, i2, 3));
    }

    @Override // defpackage.hlq
    public final void N() {
        this.a.N();
    }

    @Override // defpackage.hlq
    public final void O(hfd hfdVar) {
        m(new gxi(this, hfdVar, 11));
    }

    @Override // defpackage.hlq
    public final void R(String str) {
        m(new gxi(this, str, 10));
    }

    @Override // defpackage.hlq
    public final void S(CharSequence charSequence, int i, Object obj) {
        m(new hpq(this, charSequence, i, obj, 1));
    }

    @Override // defpackage.hlq
    public final void T(List list) {
        m(new gxi(this, list, 12));
    }

    @Override // defpackage.hls
    public final lmz W() {
        hls hlsVar = this.a;
        Objects.requireNonNull(hlsVar);
        lmz lmzVar = (lmz) k(new evl(hlsVar, 16));
        return lmzVar != null ? lmzVar : lrr.a;
    }

    @Override // defpackage.hls
    public final void Z() {
        Objects.requireNonNull(this.a);
        m(new bsd(14));
    }

    @Override // defpackage.hlq
    public final void f(int i, int i2, CharSequence charSequence) {
        m(new dfe(this, i, i2, charSequence, 3));
    }

    @Override // defpackage.hlq
    public final void g(CharSequence charSequence, int i) {
        m(new ov(this, charSequence, i, 8));
    }

    @Override // defpackage.hls
    public final gqc h() {
        return this.a.h();
    }

    @Override // defpackage.hlt
    public final idk hO() {
        return this.a.hO();
    }

    @Override // defpackage.hlr
    public final hqk hT(int i, int i2, int i3) {
        return hqk.a((hqk) k(new hpo(this, i, i2, i3, 1)));
    }

    @Override // defpackage.hlq
    public final void hU(CompletionInfo completionInfo) {
        m(new gxi(this, completionInfo, 9));
    }

    @Override // defpackage.hlq
    public final void hV(final CharSequence charSequence, final boolean z, final int i) {
        m(new Runnable() { // from class: hly
            @Override // java.lang.Runnable
            public final void run() {
                hmd hmdVar = hmd.this;
                hmdVar.a.hV(charSequence, z, i);
            }
        });
    }

    @Override // defpackage.hlq
    public final void hW() {
        hls hlsVar = this.a;
        Objects.requireNonNull(hlsVar);
        m(new gxd(hlsVar, 10));
    }

    @Override // defpackage.hlq
    public final void hX(final int i, final int i2, final CharSequence charSequence, final boolean z) {
        m(new Runnable() { // from class: hlz
            @Override // java.lang.Runnable
            public final void run() {
                hmd hmdVar = hmd.this;
                hmdVar.a.hX(i, i2, charSequence, z);
            }
        });
    }

    @Override // defpackage.hlq
    public final void hY(boolean z) {
        m(new bdx(this, z, 5));
    }

    @Override // defpackage.hlq
    public final boolean hZ(hln hlnVar, boolean z) {
        Boolean bool = (Boolean) k(new hlx(this, hlnVar, z, 0));
        return bool != null && bool.booleanValue();
    }

    @Override // defpackage.hlq
    public final void hu(int i, int i2, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, CharSequence charSequence5) {
        m(new htz(this, i, i2, charSequence, charSequence2, charSequence3, charSequence4, charSequence5, 1));
    }

    @Override // defpackage.hlr
    public final CharSequence i(int i) {
        CharSequence charSequence = (CharSequence) k(new hmc(this, i, 1));
        return charSequence != null ? charSequence : "";
    }

    @Override // defpackage.hlr
    public final CharSequence j(int i) {
        CharSequence charSequence = (CharSequence) k(new hmc(this, i, 0));
        return charSequence != null ? charSequence : "";
    }

    @Override // defpackage.hlq
    public final void l(final List list, final hln hlnVar, final boolean z) {
        m(new Runnable() { // from class: hma
            @Override // java.lang.Runnable
            public final void run() {
                hmd hmdVar = hmd.this;
                hmdVar.a.l(list, hlnVar, z);
            }
        });
    }

    @Override // defpackage.hlq
    public final void x() {
        hls hlsVar = this.a;
        Objects.requireNonNull(hlsVar);
        m(new gxd(hlsVar, 14));
    }

    @Override // defpackage.hlq
    public final void y(final long j, final boolean z) {
        m(new Runnable() { // from class: hmb
            @Override // java.lang.Runnable
            public final void run() {
                hmd hmdVar = hmd.this;
                hmdVar.a.y(j, z);
            }
        });
    }
}
