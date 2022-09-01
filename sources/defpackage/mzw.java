package defpackage;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* renamed from: mzw  reason: default package */
/* loaded from: classes2.dex */
public final class mzw {
    public static final mzm a = e(mzj.a);

    public static final mzi a(List list) {
        return new mzi(list);
    }

    public static final mzi b(mzi mziVar, mzv mzvVar) {
        oll.e(mzvVar, "other");
        return new mzi(nxp.s(mziVar.a, nxp.n(mzvVar)));
    }

    public static final mzi c(mzv mzvVar, mzv mzvVar2) {
        oll.e(mzvVar, "<this>");
        oll.e(mzvVar2, "other");
        return new mzi(nxp.y(new mzv[]{mzvVar, mzvVar2}));
    }

    public static final mzm d(mzm mzmVar, mzm mzmVar2) {
        oll.e(mzmVar, "<this>");
        oll.e(mzmVar2, "other");
        return new mzm(new mzs(mzmVar, mzmVar2));
    }

    public static final mzm e(mzv mzvVar) {
        return new mzm(mzvVar);
    }

    public static final mzn f(okf okfVar) {
        return new mzn(okfVar);
    }

    public static final mzp g(mzv mzvVar, Integer num) {
        return new mzp(mzvVar, num);
    }

    public static final mzq h(mzv mzvVar) {
        return new mzq(mzvVar);
    }

    public static final mzs i(mzv mzvVar, mzv mzvVar2) {
        oll.e(mzvVar, "<this>");
        oll.e(mzvVar2, "other");
        return new mzs(mzvVar, mzvVar2);
    }

    public static final mzy j(String str, omv... omvVarArr) {
        Set set;
        Object[] copyOf = Arrays.copyOf(omvVarArr, omvVarArr.length);
        oll.e(copyOf, "elements");
        int length = copyOf.length;
        if (length > 0) {
            oll.e(copyOf, "<this>");
            if (length == 1) {
                set = nxp.j(copyOf[0]);
            } else {
                set = new LinkedHashSet(nxp.k(length));
                oll.e(copyOf, "<this>");
                for (Object obj : copyOf) {
                    set.add(obj);
                }
            }
        } else {
            set = ojt.a;
        }
        return new mzy(str, set);
    }

    public static final naa k(String str) {
        oll.e(str, "prefix");
        return new naa(str);
    }

    public static final nab l(mzv mzvVar, okq okqVar) {
        return new nab(mzvVar, okqVar);
    }

    public static final nab m(mzm mzmVar, mzv mzvVar) {
        oll.e(mzmVar, "<this>");
        oll.e(mzvVar, "other");
        return l(new mzs(mzmVar, mzvVar), kls.g);
    }

    public static final nab n(mzv mzvVar, mzm mzmVar) {
        oll.e(mzvVar, "<this>");
        oll.e(mzmVar, "other");
        return l(new mzs(mzvVar, mzmVar), kls.h);
    }

    public static final nac o(mzs mzsVar, mzv mzvVar) {
        return new nac(mzsVar, mzvVar);
    }

    public static final ndb q(ndb ndbVar, okv okvVar) {
        ndb ndbVar2;
        oll.e(ndbVar, "<this>");
        if (ndbVar instanceof mzu) {
            mzu mzuVar = (mzu) ndbVar;
            ndbVar2 = okvVar.a(mzuVar.a, mzuVar.b, mzuVar.c);
        } else {
            boolean z = ndbVar instanceof mzt;
            ndbVar2 = ndbVar;
            if (!z) {
                throw new ojb();
            }
        }
        return ndbVar2;
    }

    public static final ndb r(ndb ndbVar, okq okqVar) {
        oll.e(ndbVar, "<this>");
        if (!(ndbVar instanceof mzu)) {
            if (!(ndbVar instanceof mzt)) {
                throw new ojb();
            }
            return (ndb) okqVar.a(ndbVar);
        }
        return ndbVar;
    }
}
