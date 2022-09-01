package defpackage;

import java.util.ArrayList;
import java.util.logging.Level;

/* compiled from: PG */
/* renamed from: cxm  reason: default package */
/* loaded from: classes.dex */
public final class cxm {
    public static final hhl a = hhq.a("enable_blacklist_for_sticker_pack_recommendation", false);
    public static final ltg b = ltg.j("com/google/android/apps/inputmethod/libs/expression/stickerpackfavoritemanager/StickerPackFavoriteHistoryManager");
    public final cxp c;
    public final mkr d;

    public cxm(cxp cxpVar, mkr mkrVar) {
        this.c = cxpVar;
        this.d = mkrVar;
    }

    public final hiz a(final String str, final boolean z) {
        hiz k;
        cxp cxpVar = this.c;
        if (((Boolean) cxp.a.c()).booleanValue()) {
            final long currentTimeMillis = System.currentTimeMillis();
            k = hiz.k(cxpVar.c.b(new leq() { // from class: cxn
                @Override // defpackage.leq
                public final Object a(Object obj) {
                    boolean z2 = z;
                    String str2 = str;
                    long j = currentTimeMillis;
                    cxl cxlVar = (cxl) obj;
                    int i = cxp.d;
                    ArrayList B = lre.B(cxlVar.a);
                    ArrayList B2 = lre.B(cxlVar.c);
                    if (z2) {
                        cxp.b(B, str2);
                        cxp.a(B2, str2, j);
                    } else {
                        cxp.a(B, str2, j);
                        cxp.b(B2, str2);
                    }
                    nfh nfhVar = (nfh) cxlVar.N(5);
                    nfhVar.cG(cxlVar);
                    if (nfhVar.c) {
                        nfhVar.cD();
                        nfhVar.c = false;
                    }
                    ((cxl) nfhVar.b).a = cxl.G();
                    if (nfhVar.c) {
                        nfhVar.cD();
                        nfhVar.c = false;
                    }
                    cxl cxlVar2 = (cxl) nfhVar.b;
                    nga ngaVar = cxlVar2.a;
                    if (!ngaVar.c()) {
                        cxlVar2.a = nfm.H(ngaVar);
                    }
                    ndt.cs(B, cxlVar2.a);
                    if (nfhVar.c) {
                        nfhVar.cD();
                        nfhVar.c = false;
                    }
                    ((cxl) nfhVar.b).c = cxl.G();
                    if (nfhVar.c) {
                        nfhVar.cD();
                        nfhVar.c = false;
                    }
                    cxl cxlVar3 = (cxl) nfhVar.b;
                    nga ngaVar2 = cxlVar3.c;
                    if (!ngaVar2.c()) {
                        cxlVar3.c = nfm.H(ngaVar2);
                    }
                    ndt.cs(B2, cxlVar3.c);
                    return (cxl) nfhVar.cz();
                }
            }, cxpVar.b));
        } else {
            k = hiz.n(null);
        }
        afp afpVar = afp.STARTED;
        boolean z2 = jam.b;
        llk e = llp.e();
        llk e2 = llp.e();
        llk e3 = llp.e();
        e.h(bxl.n);
        e2.h(bxl.o);
        k.E(hjg.a(this.d, null, afpVar, z2, e, e2, e3));
        return k;
    }

    public final hiz b(String str) {
        hiz k;
        cxp cxpVar = this.c;
        if (((Boolean) cxp.a.c()).booleanValue()) {
            k = hiz.k(cxpVar.c.b(new cxo(str, System.currentTimeMillis(), 0), cxpVar.b));
        } else {
            k = hiz.n(null);
        }
        k.J(Level.FINEST, "Added sticker pack %s to skip from recommendation", str);
        k.H(Level.WARNING, "Failed to update skip from recommendation for %s", str);
        return k;
    }
}
