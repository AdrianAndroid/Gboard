package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import j$.util.Objects;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: buf  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class buf implements lgb {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ buf(Context context, int i) {
        this.c = i;
        this.a = context;
        this.b = "EXPRESSION";
    }

    public /* synthetic */ buf(bui buiVar, llp llpVar, int i) {
        this.c = i;
        this.a = buiVar;
        this.b = llpVar;
    }

    public /* synthetic */ buf(cvx cvxVar, String str, int i) {
        this.c = i;
        this.a = cvxVar;
        this.b = str;
    }

    public /* synthetic */ buf(cwo cwoVar, String str, int i) {
        this.c = i;
        this.a = cwoVar;
        this.b = str;
    }

    public /* synthetic */ buf(flo floVar, int i) {
        this.c = i;
        this.a = floVar;
        this.b = "EXPRESSION_COUNTERS";
    }

    public /* synthetic */ buf(gyu gyuVar, gyw gywVar, int i) {
        this.c = i;
        this.a = gyuVar;
        this.b = gywVar;
    }

    public /* synthetic */ buf(hyy hyyVar, lgb lgbVar, int i) {
        this.c = i;
        this.a = hyyVar;
        this.b = lgbVar;
    }

    public /* synthetic */ buf(Class cls, String str, int i) {
        this.c = i;
        this.a = cls;
        this.b = str;
    }

    public /* synthetic */ buf(jlt jltVar, nox noxVar, int i, byte[] bArr, byte[] bArr2) {
        this.c = i;
        this.a = jltVar;
        this.b = noxVar;
    }

    public /* synthetic */ buf(kdz kdzVar, Context context, int i) {
        this.c = i;
        this.b = kdzVar;
        this.a = context;
    }

    public /* synthetic */ buf(kff kffVar, oiy oiyVar, int i) {
        this.c = i;
        this.a = kffVar;
        this.b = oiyVar;
    }

    public /* synthetic */ buf(lgb lgbVar, List list, int i) {
        this.c = i;
        this.a = lgbVar;
        this.b = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v54, types: [lgb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v14, types: [gyw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v15, types: [lgb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v26, types: [java.lang.Object, oiy] */
    /* JADX WARN: Type inference failed for: r1v27, types: [nox, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v31, types: [java.util.List, java.lang.Object] */
    @Override // defpackage.lgb
    public final Object a() {
        Object g;
        switch (this.c) {
            case 0:
                return Boolean.valueOf(!((bui) this.a).l((llp) this.b));
            case 1:
                Object obj = this.a;
                Object obj2 = this.b;
                while (true) {
                    Class cls = (Class) obj;
                    Class<?> enclosingClass = cls.getEnclosingClass();
                    if (enclosingClass == null) {
                        String simpleName = cls.getSimpleName();
                        int indexOf = simpleName.indexOf("$");
                        if (indexOf != -1) {
                            simpleName = simpleName.substring(0, indexOf);
                        }
                        return simpleName + "[" + ((String) obj2) + "]";
                    }
                    obj = enclosingClass;
                }
            case 2:
                return Boolean.valueOf(!((bui) this.a).l((llp) this.b));
            case 3:
                return ((cvx) this.a).m((String) this.b, Integer.MAX_VALUE, false);
            case 4:
                Object obj3 = this.a;
                Object obj4 = this.b;
                cwo cwoVar = (cwo) obj3;
                idn a = cwoVar.d.a(ctg.STICKERS_EXPRESSIVE_FETCHER_SEARCH);
                knn knnVar = (knn) ((cwn) cwoVar.b).a().a;
                kog kogVar = knnVar.f;
                synchronized (kogVar.b) {
                    if (kogVar.d == null) {
                        kog.e();
                    }
                }
                String b = knnVar.f.b();
                knnVar.g();
                mko h = mio.h(kcu.K(new ArrayList()), new jmg(knnVar, (String) obj4, 6), knnVar.a);
                kcu.U(h, new fel(knnVar, b, 11), knnVar.a);
                mko g2 = mio.g(h, cuv.f, cwoVar.c);
                Objects.requireNonNull(a);
                g2.d(new cvj(a, 6), mjl.a);
                return g2;
            case 5:
                return this.b.a((ContextWrapper) this.a);
            case 6:
                Object obj5 = this.a;
                ?? r1 = this.b;
                igr igrVar = ((hyy) obj5).f;
                boe boeVar = new boe((short[]) null);
                jjk jjkVar = (jjk) r1.a();
                boeVar.q("https", jjkVar);
                boeVar.q("http", jjkVar);
                for (Class cls2 : igrVar.e(hzf.class)) {
                    ifw b2 = igrVar.b(cls2);
                    if (b2 instanceof hzf) {
                        llp c = ((hzf) b2).c();
                        int size = c.size();
                        for (int i = 0; i < size; i++) {
                            hzo hzoVar = (hzo) c.get(i);
                            boeVar.q(hzoVar.a(), hzoVar);
                        }
                    }
                }
                return new jjl(boeVar, null, null);
            case 7:
                return new flo((Context) this.a, (String) this.b);
            case 8:
                return new fma((flo) this.a, (String) this.b, 100);
            case 9:
                Object obj6 = this.b;
                Object obj7 = this.a;
                synchronized (obj6) {
                    String a2 = kcn.a();
                    String str = a2 + ".trace";
                    File file = new File(((Context) obj7).getFilesDir(), "primes_profiling_" + a2);
                    if (file.exists() || file.mkdir()) {
                        File file2 = new File(file, str);
                        file2.deleteOnExit();
                        try {
                            if (file2.exists()) {
                                file2.delete();
                            }
                        } catch (RuntimeException unused) {
                        }
                        g = lfb.g(file2);
                    } else {
                        g = ldu.a;
                    }
                }
                return g;
            case 10:
                return ((kff) this.a).b(this.b);
            case 11:
                Object obj8 = this.a;
                ?? r12 = this.b;
                int i2 = kgz.a;
                return ((jlt) obj8).d(((kgx) r12.a()).a);
            default:
                return oqv.b(new fgx(2), nxp.Q((nsb) this.a.a(), this.b));
        }
    }
}
