package defpackage;

import java.util.List;

/* compiled from: PG */
/* renamed from: ihu  reason: default package */
/* loaded from: classes.dex */
public final class ihu implements iid {
    private final hiz a;
    private final lgb b;

    public ihu(hiz hizVar, lgb lgbVar) {
        this.a = hizVar;
        this.b = lgbVar;
    }

    @Override // defpackage.iid
    public final mko c(iih iihVar) {
        return ((iid) this.a.y().b(this.b)).c(iihVar);
    }

    @Override // defpackage.iid
    public final nuf d(String str, List list) {
        return ((iid) this.a.y().b(this.b)).d(str, list);
    }
}
