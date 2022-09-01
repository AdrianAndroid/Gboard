package defpackage;

import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: cxp  reason: default package */
/* loaded from: classes.dex */
public final class cxp {
    static final hhl a = hhq.a("enable_sticker_pack_favorite_history_store", false);
    public static final /* synthetic */ int d = 0;
    public final Executor b;
    public final kqr c;

    public cxp(kqi kqiVar, Executor executor) {
        kqg a2 = kqh.a();
        kor a3 = kos.a(guw.a());
        a3.d("protodatastore");
        a3.e("ExpressionStickerPackFavoriteHistory.pb");
        a2.f(a3.a());
        a2.e(cxl.d);
        this.c = kqiVar.a(a2.a());
        this.b = executor;
    }

    public static void a(List list, String str, long j) {
        int X = lre.X(list, new cjm(str, 11));
        if (X >= 0) {
            cxk cxkVar = (cxk) list.get(X);
            nfh nfhVar = (nfh) cxkVar.N(5);
            nfhVar.cG(cxkVar);
            if (nfhVar.c) {
                nfhVar.cD();
                nfhVar.c = false;
            }
            cxk cxkVar2 = (cxk) nfhVar.b;
            cxk cxkVar3 = cxk.d;
            cxkVar2.a |= 2;
            cxkVar2.c = j;
            list.set(X, (cxk) nfhVar.cz());
            return;
        }
        nfh t = cxk.d.t();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        cxk cxkVar4 = (cxk) t.b;
        str.getClass();
        int i = cxkVar4.a | 1;
        cxkVar4.a = i;
        cxkVar4.b = str;
        cxkVar4.a = i | 2;
        cxkVar4.c = j;
        list.add((cxk) t.cz());
    }

    public static void b(List list, String str) {
        int X = lre.X(list, new cjm(str, 12));
        if (X >= 0) {
            list.remove(X);
        }
    }
}
