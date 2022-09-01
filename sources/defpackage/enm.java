package defpackage;

/* compiled from: PG */
/* renamed from: enm  reason: default package */
/* loaded from: classes.dex */
public final class enm implements eno {
    final /* synthetic */ enn a;
    private final eno b;

    public enm(enn ennVar, eno enoVar) {
        this.a = ennVar;
        this.b = enoVar;
    }

    @Override // defpackage.eno
    public final boolean a(jav javVar) {
        throw null;
    }

    @Override // defpackage.eno
    public final llp b(CharSequence charSequence, boolean z) {
        return this.b.b(charSequence, z);
    }

    @Override // defpackage.eno, java.lang.AutoCloseable
    public final void close() {
        this.a.f.release();
    }
}
