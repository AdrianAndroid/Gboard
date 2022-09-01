package defpackage;

import android.content.Context;

/* compiled from: PG */
/* renamed from: dyy  reason: default package */
/* loaded from: classes.dex */
public final class dyy implements npe {
    private final oiy a;

    public dyy(oiy oiyVar) {
        this.a = oiyVar;
    }

    public static dyy c(oiy oiyVar) {
        return new dyy(oiyVar);
    }

    @Override // defpackage.oiy
    /* renamed from: b */
    public final dyx a() {
        return new dyx((Context) this.a.a());
    }
}
