package defpackage;

/* compiled from: PG */
/* renamed from: ogc  reason: default package */
/* loaded from: classes2.dex */
public final class ogc extends nxq {
    public static final our d = new our();
    public final nuq e;
    public final String f;
    public final ofg g;
    public final String h;
    public final oar j;
    private final nry k;
    private final opu l = new opu(this);
    public final boolean i = false;

    public ogc(nuq nuqVar, num numVar, ofu ofuVar, ogh oghVar, ogr ogrVar, Object obj, int i, int i2, String str, String str2, ofg ofgVar, ofo ofoVar, nsa nsaVar) {
        super(ofgVar, ofoVar, numVar, nsaVar);
        this.g = ofgVar;
        this.e = nuqVar;
        this.h = str;
        this.f = str2;
        this.k = oghVar.p;
        String str3 = nuqVar.b;
        this.j = new oar(this, i, ofgVar, obj, ofuVar, ogrVar, oghVar, i2);
    }

    @Override // defpackage.nyu
    public final nry a() {
        return this.k;
    }

    @Override // defpackage.nxq, defpackage.nxv
    protected final /* synthetic */ nxu p() {
        return this.j;
    }

    @Override // defpackage.nxq
    protected final /* synthetic */ nxu s() {
        return this.j;
    }

    @Override // defpackage.nxq
    protected final /* synthetic */ opu t() {
        return this.l;
    }

    public final nup u() {
        return this.e.a;
    }
}
