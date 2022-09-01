package defpackage;

import java.util.List;

/* compiled from: PG */
/* renamed from: gyh  reason: default package */
/* loaded from: classes.dex */
public final class gyh extends gxe {
    public final List e;
    public final /* synthetic */ gyj f;

    public gyh(gyj gyjVar, List list) {
        this.f = gyjVar;
        this.e = list;
    }

    @Override // defpackage.gxe
    public final /* synthetic */ void c(Object obj) {
        gyi gyiVar = (gyi) obj;
        ((luc) ((luc) this.f.e.b()).k("com/google/android/libraries/inputmethod/contentdata/AbstractContentDataManager$ImportContentTask", "onPostExecute", 260, "AbstractContentDataManager.java")).G("onPostExecute() : Result = [%d,%d]", gyiVar.a, gyiVar.b);
        gyj gyjVar = this.f;
        gyjVar.k = null;
        gyjVar.k(gyiVar.a.intValue(), gyiVar.b.intValue());
    }
}
