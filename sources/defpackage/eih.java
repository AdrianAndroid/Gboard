package defpackage;

/* compiled from: PG */
/* renamed from: eih  reason: default package */
/* loaded from: classes.dex */
public final class eih implements npe {
    private final oiy a;
    private final /* synthetic */ int b;

    public eih(oiy oiyVar, int i) {
        this.b = i;
        this.a = oiyVar;
    }

    @Override // defpackage.oiy
    public final /* synthetic */ Object a() {
        return this.b != 0 ? b() : b();
    }

    public final cri b() {
        if (this.b == 0) {
            return cri.b(((egx) this.a).b(), "recent_sticker_shared");
        }
        return cri.b(((egx) this.a).b(), "recent_bitmoji_shared");
    }
}
