package defpackage;

/* compiled from: PG */
/* renamed from: jpo  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class jpo implements jpq {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ jpo(jub jubVar, int i) {
        this.b = i;
        this.a = jubVar;
    }

    public /* synthetic */ jpo(llk llkVar, int i) {
        this.b = i;
        this.a = llkVar;
    }

    @Override // defpackage.jpq
    public final void a(Object obj) {
        if (this.b == 0) {
            ((llk) this.a).h(obj);
        } else {
            ((jub) this.a).f((String) obj);
        }
    }
}
