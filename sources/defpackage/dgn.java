package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dgn  reason: default package */
/* loaded from: classes.dex */
public final class dgn extends dgm {
    public dgn(int i, float f) {
        super(i, f);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dgm
    public final float j(float f, float f2) {
        return -super.j(f, f2);
    }

    @Override // defpackage.dgm
    protected final float k(gpq gpqVar, int i, float f) {
        gpf gpfVar = new gpf(gpqVar);
        float f2 = i;
        return (f2 - gpfVar.b()) - (f2 * f);
    }
}
