package defpackage;

/* compiled from: PG */
/* renamed from: csf  reason: default package */
/* loaded from: classes.dex */
public final class csf implements AutoCloseable {
    public final ctt a;
    public final lmz b;
    public boolean c = false;
    public boolean d = false;

    public csf(ctt cttVar, lmz lmzVar) {
        this.a = cttVar;
        this.b = lmzVar;
    }

    public final void a() {
        if (!this.c || this.d) {
            return;
        }
        this.c = false;
        this.a.i();
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.d) {
            return;
        }
        a();
        this.d = true;
        this.a.close();
    }
}
