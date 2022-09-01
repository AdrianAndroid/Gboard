package defpackage;

import android.util.LruCache;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* renamed from: gjj  reason: default package */
/* loaded from: classes.dex */
public final class gjj implements gji {
    public static final int a = ndb.t(ndy.class.getName());
    public static final Map b = new HashMap();
    public static final oir f = new oir();
    public final LruCache c = new gjm();
    public final LruCache d = new LruCache(100);
    public final gkb e = new gkb();

    static {
        lls llsVar = new lls();
        llsVar.a(0, "WIRETYPE_VARINT");
        llsVar.a(1, "WIRETYPE_FIXED64");
        llsVar.a(2, "WIRETYPE_LENGTH_DELIMITED");
        llsVar.a(3, "WIRETYPE_START_GROUP");
        llsVar.a(4, "WIRETYPE_END_GROUP");
        llsVar.a(5, "WIRETYPE_FIXED32");
        llsVar.l();
    }

    public static boolean a(gjd gjdVar, pca pcaVar, gje gjeVar, gkh gkhVar, lfb lfbVar) {
        gjq gjyVar;
        int i = 0;
        while (true) {
            int i2 = 1;
            if (pcaVar == null || i >= pcaVar.b.size()) {
                break;
            }
            int a2 = niz.a(pcaVar.b.d(i));
            if (a2 == 0) {
                a2 = 1;
            }
            gju gjuVar = gjeVar.b;
            niy z = cd.z(a2);
            if (z.a == 1) {
                gjr gjrVar = ((gjv) gjuVar).b;
                int b2 = niv.b(((Integer) z.b).intValue());
                if (b2 != 0) {
                    i2 = b2;
                }
                gjyVar = gjrVar.a(i2, gjdVar);
            } else {
                gjyVar = new gjy(((gjv) gjuVar).b, z, gjdVar);
            }
            if (!gjyVar.a()) {
                if (gjz.a()) {
                    nfh b3 = gkhVar.b(3);
                    if (b3.c) {
                        b3.cD();
                        b3.c = false;
                    }
                    nja njaVar = (nja) b3.b;
                    nja njaVar2 = nja.m;
                    njaVar.i = a2 - 1;
                    njaVar.a |= 128;
                    niy z2 = cd.z(a2);
                    if (b3.c) {
                        b3.cD();
                        b3.c = false;
                    }
                    nja njaVar3 = (nja) b3.b;
                    z2.getClass();
                    njaVar3.j = z2;
                    njaVar3.a |= 512;
                    if (lfbVar.e()) {
                        b3.ef(((Integer) lfbVar.a()).intValue());
                    }
                    gkhVar.a(b3);
                }
                return false;
            }
            i++;
        }
        return true;
    }

    public static boolean b(pca pcaVar) {
        return (pcaVar == null || pcaVar.b.size() == 0) ? false : true;
    }

    public static boolean c(int i, int i2) {
        return i == a && i2 == 2;
    }

    public static pca d(pbz pbzVar) {
        return (pca) Collections.unmodifiableMap(pbzVar.c).get(-2032180703);
    }

    public static pca e(pcd pcdVar) {
        return (pca) Collections.unmodifiableMap(pcdVar.a).get(-2032180703);
    }
}
