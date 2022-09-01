package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ocn  reason: default package */
/* loaded from: classes2.dex */
public final class ocn extends ntk {
    final oco b;

    public ocn(oco ocoVar) {
        this.b = ocoVar;
    }

    @Override // defpackage.ntk
    public final oqv a() {
        oco ocoVar = this.b;
        jdg.G(true, "config is not set");
        return new oqv(nvu.b, ocoVar);
    }
}
