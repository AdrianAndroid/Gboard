package defpackage;

/* compiled from: PG */
/* renamed from: nvv  reason: default package */
/* loaded from: classes2.dex */
public final class nvv extends Exception {
    private static final long serialVersionUID = -660954903976144640L;
    public final nvu a;
    private final boolean b = true;

    public nvv(nvu nvuVar) {
        super(nvu.j(nvuVar), nvuVar.q);
        this.a = nvuVar;
        fillInStackTrace();
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        if (this.b) {
            return super.fillInStackTrace();
        }
        return this;
    }
}
