package defpackage;

/* compiled from: PG */
/* renamed from: nvw  reason: default package */
/* loaded from: classes2.dex */
public final class nvw extends RuntimeException {
    private static final long serialVersionUID = 1950934672280720624L;
    public final nvu a;
    public final num b;
    private final boolean c = true;

    public nvw(nvu nvuVar, num numVar) {
        super(nvu.j(nvuVar), nvuVar.q);
        this.a = nvuVar;
        this.b = numVar;
        fillInStackTrace();
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        if (this.c) {
            return super.fillInStackTrace();
        }
        return this;
    }
}
