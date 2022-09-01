package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* renamed from: khi  reason: default package */
/* loaded from: classes.dex */
public final class khi implements npe {
    private final oiy a;
    private final oiy b;

    public khi(oiy oiyVar, oiy oiyVar2) {
        this.a = oiyVar;
        this.b = oiyVar2;
    }

    @Override // defpackage.oiy
    /* renamed from: b */
    public final lfb a() {
        lfb lfbVar = (lfb) ((npf) this.a).b;
        ((lba) this.b).b();
        if (lfbVar.e()) {
            Objects.requireNonNull(lfbVar);
            return lfb.g(new ihp(lfbVar, 14));
        }
        return ldu.a;
    }
}
