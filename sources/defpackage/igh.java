package defpackage;

/* compiled from: PG */
/* renamed from: igh  reason: default package */
/* loaded from: classes.dex */
public final class igh implements ijj {
    private final Class a;
    private final his b;
    private final /* synthetic */ int c;

    public igh(Class cls, his hisVar, int i) {
        this.c = i;
        this.a = cls;
        this.b = hisVar;
    }

    @Override // defpackage.ijj
    public final /* synthetic */ void fe(Class cls) {
    }

    @Override // defpackage.ijj
    public final /* synthetic */ void fd(ijg ijgVar) {
        if (this.c == 0) {
            igi igiVar = (igi) ijgVar;
            if (!this.a.isAssignableFrom(igiVar.b)) {
                return;
            }
            this.b.a(igiVar.a, Boolean.valueOf(igiVar.c));
            return;
        }
        igd igdVar = (igd) ijgVar;
        if (!this.a.isAssignableFrom(igdVar.b)) {
            return;
        }
        this.b.a(igdVar.a, this.a.cast(igdVar.c));
    }
}
