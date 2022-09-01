package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* renamed from: kha  reason: default package */
/* loaded from: classes.dex */
public final class kha implements npe {
    private final oiy a;
    private final oiy b;
    private final oiy c;

    public kha(oiy oiyVar, oiy oiyVar2, oiy oiyVar3) {
        this.a = oiyVar;
        this.b = oiyVar2;
        this.c = oiyVar3;
    }

    @Override // defpackage.oiy
    /* renamed from: b */
    public final lfb a() {
        lfb lfbVar = (lfb) ((npf) this.b).b;
        oiy oiyVar = this.c;
        if (((lfb) ((npf) this.a).b).e() || lfbVar.e()) {
            Objects.requireNonNull(oiyVar);
            return lfb.g(new doc(oiyVar, 11));
        }
        return ldu.a;
    }
}
