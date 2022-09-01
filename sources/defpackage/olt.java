package defpackage;

/* compiled from: PG */
/* renamed from: olt  reason: default package */
/* loaded from: classes2.dex */
public class olt implements olu {
    private Object a;

    public olt(Object obj) {
        this.a = obj;
    }

    protected void a(ome omeVar, Object obj, Object obj2) {
        throw null;
    }

    @Override // defpackage.olu
    public final void b(ome omeVar, Object obj) {
        oll.e(omeVar, "property");
        Object obj2 = this.a;
        oll.e(omeVar, "property");
        this.a = obj;
        a(omeVar, obj2, obj);
    }

    @Override // defpackage.olu
    public final Object c(ome omeVar) {
        oll.e(omeVar, "property");
        return this.a;
    }
}
