package defpackage;

/* compiled from: PG */
/* renamed from: hmu  reason: default package */
/* loaded from: classes.dex */
public final class hmu implements gwb {
    private static final xx d = new xz(2);
    public hln a;
    public int b;
    public boolean c;

    public static hmu b(hln hlnVar, int i, boolean z) {
        hmu hmuVar = (hmu) d.a();
        if (hmuVar == null) {
            hmuVar = new hmu();
        }
        hmuVar.a = hlnVar;
        hmuVar.b = i;
        hmuVar.c = z;
        return hmuVar;
    }

    @Override // defpackage.gwb
    public final void a() {
        this.a = null;
        d.b(this);
    }
}
