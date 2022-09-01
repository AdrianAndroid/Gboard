package defpackage;

import android.content.Context;

/* compiled from: PG */
/* renamed from: jlx  reason: default package */
/* loaded from: classes.dex */
public final class jlx implements npe {
    private final /* synthetic */ int a;

    public jlx(int i) {
        this.a = i;
    }

    public static Context b() {
        Context a = guw.a();
        nxp.X(a);
        return a;
    }

    public static void c(oiy oiyVar) {
        nxp.X(kfl.e() ? (kfl) oiyVar.a() : new kfl());
    }

    @Override // defpackage.oiy
    public final /* synthetic */ Object a() {
        switch (this.a) {
            case 0:
                return new gjz();
            case 1:
                throw null;
            case 2:
                return new kbv();
            case 3:
                throw null;
            case 4:
                return true;
            case 5:
                return new jlr((byte[]) null);
            case 6:
                return new jco(null, null, null);
            default:
                return new jco(null, null);
        }
    }
}
