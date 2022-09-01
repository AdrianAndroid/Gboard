package defpackage;

import android.content.Context;
import android.support.v7.widget.GridLayoutManager;

/* compiled from: PG */
/* renamed from: egv  reason: default package */
/* loaded from: classes.dex */
public final class egv implements npe {
    private final oiy a;
    private final oiy b;

    public egv(oiy oiyVar, oiy oiyVar2) {
        this.a = oiyVar;
        this.b = oiyVar2;
    }

    public static egv c(oiy oiyVar, oiy oiyVar2) {
        return new egv(oiyVar, oiyVar2);
    }

    @Override // defpackage.oiy
    /* renamed from: b */
    public final GridLayoutManager a() {
        Context context = (Context) this.a.a();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(((egw) this.b).b().intValue(), 1);
        gridLayoutManager.i = true;
        return gridLayoutManager;
    }
}
