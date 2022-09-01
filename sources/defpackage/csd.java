package defpackage;

import android.content.Context;

/* compiled from: PG */
/* renamed from: csd  reason: default package */
/* loaded from: classes.dex */
public final class csd implements npe {
    private final oiy a;
    private final /* synthetic */ int b;

    public csd(oiy oiyVar, int i) {
        this.b = i;
        this.a = oiyVar;
    }

    public static csd b(oiy oiyVar) {
        return new csd(oiyVar, 0);
    }

    public static ino d(Context context) {
        ino M = ino.M(context);
        nxp.X(M);
        return M;
    }

    public static csd e(oiy oiyVar) {
        return new csd(oiyVar, 1);
    }

    @Override // defpackage.oiy
    public final /* synthetic */ Object a() {
        return this.b != 0 ? c() : c();
    }

    public final ino c() {
        if (this.b == 0) {
            return d((Context) this.a.a());
        }
        return ino.K((Context) this.a.a(), null);
    }
}
