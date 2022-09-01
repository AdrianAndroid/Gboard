package defpackage;

/* compiled from: PG */
/* renamed from: ayh  reason: default package */
/* loaded from: classes.dex */
public final class ayh extends bgf {
    public kdr a;

    public ayh(long j) {
        super(j);
    }

    @Override // defpackage.bgf
    protected final /* bridge */ /* synthetic */ int a(Object obj) {
        axh axhVar = (axh) obj;
        if (axhVar == null) {
            return 1;
        }
        return axhVar.a();
    }

    public final /* bridge */ /* synthetic */ axh b(auw auwVar) {
        return (axh) super.h(auwVar);
    }

    @Override // defpackage.bgf
    protected final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
        auw auwVar = (auw) obj;
        axh axhVar = (axh) obj2;
        kdr kdrVar = this.a;
        if (kdrVar == null || axhVar == null) {
            return;
        }
        ((hxf) kdrVar.c).e(axhVar, true);
    }

    public final /* bridge */ /* synthetic */ void d(auw auwVar, axh axhVar) {
        axh axhVar2 = (axh) super.g(auwVar, axhVar);
    }
}
