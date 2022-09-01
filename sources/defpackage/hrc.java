package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* renamed from: hrc  reason: default package */
/* loaded from: classes.dex */
public final class hrc {
    public static final ltg a = ltg.j("com/google/android/libraries/inputmethod/inputmethodentry/ImeDefCache");
    public final Map b = new qo();
    public final Map c = new qo();
    public final kdr d;
    public final opu e;
    private final llp f;

    public hrc(opu opuVar, kdr kdrVar, llp llpVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.e = opuVar;
        this.d = kdrVar;
        this.f = llpVar;
    }

    public final synchronized void a() {
        ArrayList B = lre.B(this.c.values());
        int size = B.size();
        for (int i = 0; i < size; i++) {
            mko mkoVar = (mko) B.get(i);
            if (mkoVar != null) {
                mkoVar.cancel(true);
            }
        }
        this.c.clear();
        this.b.clear();
    }

    public final synchronized void b(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            mko mkoVar = (mko) this.c.remove((jav) it.next());
            if (mkoVar != null) {
                mkoVar.cancel(true);
            }
        }
        this.b.keySet().removeAll(collection);
    }

    public final synchronized mko c(jav javVar, iaw iawVar, jls jlsVar, mkr mkrVar) {
        mko g;
        hrb hrbVar = (hrb) this.b.get(javVar);
        if (hrbVar != null && hrbVar.d) {
            return kcu.K(hrbVar);
        }
        mko mkoVar = (mko) this.c.get(javVar);
        if (mkoVar == null) {
            llp llpVar = this.f;
            gvy gvyVar = new gvy(2);
            ArrayList arrayList = new ArrayList();
            int size = llpVar.size();
            for (int i = 0; i < size; i++) {
                hqx hqxVar = (hqx) llpVar.get(i);
                hqxVar.a();
                if (hrbVar == null || !mhq.o(hrbVar.c, i)) {
                    gvyVar.b(i);
                    arrayList.add(hqxVar.c(iawVar, jlsVar, mkrVar));
                }
            }
            if (arrayList.isEmpty()) {
                this.e.l(6);
                ((ltd) a.a(hip.a).k("com/google/android/libraries/inputmethod/inputmethodentry/ImeDefCache", "loadImeDefs", 239, "ImeDefCache.java")).t("No valid PrimaryImeDefsProvider.");
                g = kcu.K(null);
            } else {
                g = mio.g(kcu.Q(arrayList), new eiy(this, iawVar, new hra(hrbVar), gvyVar, 5), mkrVar);
            }
            kcu.U(g, new cvt(this, javVar, g, 9), mjl.a);
            this.c.put(javVar, g);
            return g;
        }
        return mkoVar;
    }

    public final mko d(jav javVar, jls jlsVar, mkr mkrVar) {
        iaw c = this.d.c(javVar);
        if (c == null) {
            ((ltd) ((ltd) a.d()).k("com/google/android/libraries/inputmethod/inputmethodentry/ImeDefCache", "getImeDefs", 126, "ImeDefCache.java")).w("There are no ImeDef resources defined for %s", javVar);
            this.e.l(4);
            return kcu.K(null);
        }
        return mio.g(c(javVar, c, jlsVar, mkrVar), hht.m, mkrVar);
    }
}
