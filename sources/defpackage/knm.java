package defpackage;

import android.util.Log;
import java.util.LinkedHashMap;

/* compiled from: PG */
/* renamed from: knm  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class knm implements leq {
    private final /* synthetic */ int i;
    public static final /* synthetic */ knm h = new knm(8);
    public static final /* synthetic */ knm g = new knm(7);
    public static final /* synthetic */ knm f = new knm(6);
    public static final /* synthetic */ knm e = new knm(5);
    public static final /* synthetic */ knm d = new knm(4);
    public static final /* synthetic */ knm c = new knm(3);
    public static final /* synthetic */ knm b = new knm(1);
    public static final /* synthetic */ knm a = new knm(0);

    public /* synthetic */ knm(int i) {
        this.i = i;
    }

    @Override // defpackage.leq
    public final Object a(Object obj) {
        switch (this.i) {
            case 0:
                byte[] bArr = (byte[]) obj;
                if (bArr != null) {
                    try {
                        nfh t = ncs.b.t();
                        t.cH(bArr, bArr.length, nfb.a());
                        return (ncs) t.cz();
                    } catch (ngd e2) {
                        throw new IllegalArgumentException("Response has protocol buffer issue.", e2);
                    }
                }
                throw new IllegalArgumentException("Response content data cannot be empty.");
            case 1:
                Log.w("ExpressiveStickerClient", "Fetch failed.", (Throwable) obj);
                return null;
            case 2:
                ncs ncsVar = (ncs) obj;
                LinkedHashMap linkedHashMap = new LinkedHashMap(lre.l(ncsVar.a.size()));
                for (ncz nczVar : ncsVar.a) {
                    ncy ncyVar = nczVar.a;
                    if (ncyVar == null) {
                        ncyVar = ncy.g;
                    }
                    int u = ndb.u(ncyVar.b);
                    if (u == 0 || u != 4) {
                        linkedHashMap.put(ncyVar.a, ncyVar);
                    }
                }
                return linkedHashMap;
            case 3:
                LinkedHashMap linkedHashMap2 = (LinkedHashMap) obj;
                return null;
            case 4:
                LinkedHashMap linkedHashMap3 = (LinkedHashMap) obj;
                return null;
            case 5:
                LinkedHashMap linkedHashMap4 = (LinkedHashMap) obj;
                return null;
            case 6:
                LinkedHashMap linkedHashMap5 = (LinkedHashMap) obj;
                return null;
            case 7:
                return ((kpy) obj).getClass().getSimpleName();
            default:
                return ((kpx) obj).getClass().getSimpleName();
        }
    }
}
