package defpackage;

/* compiled from: PG */
/* renamed from: bnk  reason: default package */
/* loaded from: classes.dex */
public final class bnk extends mik {
    public final mko a;

    public bnk(mko mkoVar) {
        this.a = mkoVar;
    }

    @Override // defpackage.mik
    protected final void a() {
        if (isCancelled()) {
            this.a.cancel(o());
        }
    }
}
