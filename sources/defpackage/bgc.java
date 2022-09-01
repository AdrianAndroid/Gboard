package defpackage;

/* compiled from: PG */
/* renamed from: bgc  reason: default package */
/* loaded from: classes.dex */
public final class bgc implements bgd {
    final /* synthetic */ bgd a;
    private volatile Object b;

    public bgc(bgd bgdVar) {
        this.a = bgdVar;
    }

    @Override // defpackage.bgd
    public final Object a() {
        if (this.b == null) {
            synchronized (this) {
                if (this.b == null) {
                    Object a = this.a.a();
                    ce.m(a);
                    this.b = a;
                }
            }
        }
        return this.b;
    }
}
