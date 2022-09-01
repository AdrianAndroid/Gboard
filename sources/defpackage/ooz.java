package defpackage;

/* compiled from: PG */
/* renamed from: ooz  reason: default package */
/* loaded from: classes2.dex */
final class ooz extends ouw {
    final /* synthetic */ ora a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ooz(ovp ovpVar, ora oraVar) {
        super(ovpVar);
        this.a = oraVar;
    }

    @Override // defpackage.ouw, defpackage.ovp, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
        super.close();
    }
}
