package defpackage;

/* compiled from: PG */
/* renamed from: hue  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class hue implements jfx {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ hue(dbs dbsVar, int i) {
        this.b = i;
        this.a = dbsVar;
    }

    public /* synthetic */ hue(iat iatVar, int i) {
        this.b = i;
        this.a = iatVar;
    }

    public /* synthetic */ hue(ibk ibkVar, int i) {
        this.b = i;
        this.a = ibkVar;
    }

    public /* synthetic */ hue(ibn ibnVar, int i) {
        this.b = i;
        this.a = ibnVar;
    }

    public /* synthetic */ hue(icv icvVar, int i) {
        this.b = i;
        this.a = icvVar;
    }

    @Override // defpackage.jfx
    public final void a(jfy jfyVar) {
        int i = this.b;
        if (i == 0) {
            Object obj = this.a;
            int i2 = huh.i;
            ((ibk) obj).d(jfyVar);
        } else if (i == 1) {
            Object obj2 = this.a;
            ibv b = ibw.b();
            b.f(jfyVar);
            ((dbs) obj2).a = b.d();
        } else if (i == 2) {
            ((iat) this.a).f(jfyVar);
        } else if (i == 3) {
            ((ibk) this.a).d(jfyVar);
        } else if (i == 4) {
            Object obj3 = this.a;
            if ("merge".equals(jfyVar.b())) {
                int attributeResourceValue = jfyVar.a().getAttributeResourceValue(null, "def", 0);
                if (attributeResourceValue == 0) {
                    return;
                }
                ((ibn) obj3).b(attributeResourceValue);
                return;
            }
            throw jfyVar.c("Unexpected xml node:".concat(String.valueOf(jfyVar.b())));
        } else {
            ((icv) this.a).d(jfyVar);
        }
    }
}
