package defpackage;

/* compiled from: PG */
/* renamed from: kfo  reason: default package */
/* loaded from: classes.dex */
public final class kfo implements npe {
    private final oiy a;
    private final oiy b;
    private final oiy c;

    public kfo(oiy oiyVar, oiy oiyVar2, oiy oiyVar3) {
        this.a = oiyVar;
        this.b = oiyVar2;
        this.c = oiyVar3;
    }

    @Override // defpackage.oiy
    /* renamed from: b */
    public final Boolean a() {
        lfb lfbVar = (lfb) ((npf) this.a).b;
        oiy oiyVar = this.b;
        boolean z = false;
        if (((Boolean) ((lfb) ((npf) this.c).b).c(false)).booleanValue() || (((Boolean) lfbVar.c(false)).booleanValue() && ((Boolean) oiyVar.a()).booleanValue())) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
