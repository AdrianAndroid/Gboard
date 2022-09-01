package defpackage;

/* compiled from: PG */
/* renamed from: kll  reason: default package */
/* loaded from: classes.dex */
public final class kll extends olt {
    final /* synthetic */ klo a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kll(Object obj, klo kloVar) {
        super(obj);
        this.a = kloVar;
    }

    @Override // defpackage.olt
    protected final void a(ome omeVar, Object obj, Object obj2) {
        oll.e(omeVar, "property");
        if (oll.g(obj, obj2) || ((Boolean) obj2).booleanValue()) {
            return;
        }
        klo kloVar = this.a;
        if (!kloVar.c) {
            return;
        }
        kloVar.c = false;
        kloVar.e(kloVar.a());
    }
}
