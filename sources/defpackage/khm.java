package defpackage;

import android.content.Context;

/* compiled from: PG */
/* renamed from: khm  reason: default package */
/* loaded from: classes.dex */
public final class khm implements npe {
    private final oiy a;
    private final oiy b;
    private final oiy c;

    public khm(oiy oiyVar, oiy oiyVar2, oiy oiyVar3) {
        this.a = oiyVar;
        this.b = oiyVar2;
        this.c = oiyVar3;
    }

    @Override // defpackage.oiy
    /* renamed from: b */
    public final jma a() {
        Context b = ((lba) this.a).b();
        gjz gjzVar = (gjz) this.b.a();
        return new jma(b, this.c);
    }
}
