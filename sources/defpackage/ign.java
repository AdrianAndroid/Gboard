package defpackage;

/* compiled from: PG */
/* renamed from: ign  reason: default package */
/* loaded from: classes.dex */
public final class ign extends ifu {
    final /* synthetic */ Class a;
    final /* synthetic */ igq b;

    public ign(igq igqVar, Class cls) {
        this.b = igqVar;
        this.a = cls;
    }

    @Override // defpackage.ijj
    public final /* bridge */ /* synthetic */ void fd(ijg ijgVar) {
        boolean z = ((ifv) ijgVar).d(this.a) != null;
        if (z != this.b.s) {
            this.b.s = z;
            this.a.getSimpleName();
            this.b.a();
        }
    }
}
