package defpackage;

/* compiled from: PG */
/* renamed from: ouv  reason: default package */
/* loaded from: classes2.dex */
public class ouv implements ovn {
    private final ovn a;

    public ouv(ovn ovnVar) {
        oll.e(ovnVar, "delegate");
        this.a = ovnVar;
    }

    @Override // defpackage.ovn
    public final ovr a() {
        return this.a.a();
    }

    @Override // defpackage.ovn, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.a.close();
    }

    @Override // defpackage.ovn, java.io.Flushable
    public void flush() {
        this.a.flush();
    }

    @Override // defpackage.ovn
    public void ik(our ourVar, long j) {
        this.a.ik(ourVar, j);
    }

    public final String toString() {
        String simpleName = getClass().getSimpleName();
        ovn ovnVar = this.a;
        return simpleName + "(" + ovnVar + ")";
    }
}
