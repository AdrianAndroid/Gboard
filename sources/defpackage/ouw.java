package defpackage;

/* compiled from: PG */
/* renamed from: ouw  reason: default package */
/* loaded from: classes2.dex */
public class ouw implements ovp {
    public final ovp d;

    public ouw(ovp ovpVar) {
        oll.e(ovpVar, "delegate");
        this.d = ovpVar;
    }

    @Override // defpackage.ovp
    public final ovr a() {
        return this.d.a();
    }

    @Override // defpackage.ovp
    public long b(our ourVar, long j) {
        return this.d.b(ourVar, 8192L);
    }

    @Override // defpackage.ovp, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.d.close();
    }

    public final String toString() {
        String simpleName = getClass().getSimpleName();
        ovp ovpVar = this.d;
        return simpleName + "(" + ovpVar + ")";
    }
}
