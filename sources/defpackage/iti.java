package defpackage;

import java.util.Arrays;
import java.util.regex.Pattern;

/* compiled from: PG */
/* renamed from: iti  reason: default package */
/* loaded from: classes.dex */
public final class iti {
    public static final /* synthetic */ int a = 0;
    private static final Pattern b = Pattern.compile("[0-9a-z_]+");

    public static ipz a(mye myeVar, jyw jywVar, opu opuVar) {
        mxz mxzVar = mxz.EQUAL;
        int q = jco.q(myeVar.a);
        if (q == 0 || q == 1) {
            nga ngaVar = myeVar.b;
            c("NONE", 0, 1, ngaVar.size());
            myd mydVar = (myd) lre.ao(ngaVar);
            if (mydVar != null) {
                return b(mydVar, jywVar, opuVar);
            }
            return ipz.c;
        } else if (q == 2) {
            nga ngaVar2 = myeVar.b;
            c("AND", 0, Integer.MAX_VALUE, ngaVar2.size());
            osr a2 = ipz.a();
            a2.l(Arrays.asList((ipz[]) lre.H(ngaVar2, new fyn(jywVar, opuVar, 13, null, null, null, null)).toArray(new ipz[0])), ipz.a);
            return a2.k();
        } else if (q != 3) {
            nga ngaVar3 = myeVar.b;
            c("NOT", 1, 1, ngaVar3.size());
            myd mydVar2 = (myd) lre.ao(ngaVar3);
            if (mydVar2 != null) {
                osr a3 = ipz.a();
                ipz b2 = b(mydVar2, jywVar, opuVar);
                a3.a = b2.d;
                a3.b = b2.e;
                if (!((String) a3.a).isEmpty()) {
                    a3.a = String.format("NOT %s", a3.a);
                }
                return a3.k();
            }
            return ipz.c;
        } else {
            nga ngaVar4 = myeVar.b;
            c("OR", 0, Integer.MAX_VALUE, ngaVar4.size());
            osr a4 = ipz.a();
            a4.l(Arrays.asList((ipz[]) lre.H(ngaVar4, new fyn(jywVar, opuVar, 11, null, null, null, null)).toArray(new ipz[0])), ipz.b);
            return a4.k();
        }
    }

    public static ipz b(myd mydVar, jyw jywVar, opu opuVar) {
        ipy ipyVar;
        int i = mydVar.a;
        if (i != 2) {
            if (i == 3) {
                return a((mye) mydVar.b, jywVar, opuVar);
            }
            throw new IllegalArgumentException("Node parameter should either set atomic expression or node.");
        }
        mya myaVar = (mya) mydVar.b;
        if (b.matcher(myaVar.a).matches()) {
            if (((llw) opuVar.a).containsKey(myaVar.a)) {
                mxz b2 = mxz.b(myaVar.b);
                if (b2 == null) {
                    b2 = mxz.EQUAL;
                }
                switch (b2.ordinal()) {
                    case 0:
                        ipyVar = ipy.EQUAL;
                        break;
                    case 1:
                        ipyVar = ipy.UNEQUAL;
                        break;
                    case 2:
                        ipyVar = ipy.GREATER;
                        break;
                    case 3:
                        ipyVar = ipy.GREATER_OR_EQUAL;
                        break;
                    case 4:
                        ipyVar = ipy.LESS;
                        break;
                    case 5:
                        ipyVar = ipy.LESS_OR_EQUAL;
                        break;
                    case 6:
                        ipyVar = ipy.IN;
                        break;
                    case 7:
                        ipyVar = ipy.BETWEEN;
                        break;
                    case 8:
                        ipyVar = ipy.GLOB;
                        break;
                    case 9:
                        ipyVar = ipy.LIKE;
                        break;
                    case 10:
                        ipyVar = ipy.FIND_IN_SET;
                        break;
                    case 11:
                        ipyVar = ipy.DELTA_MOD_BETWEEN;
                        break;
                    default:
                        int i2 = b2.m;
                        throw new IllegalArgumentException("Cannot find corresponding operator for " + i2);
                }
                osr a2 = ipz.a();
                a2.p(myaVar.a, ipyVar, (String[]) lre.H(myaVar.c, new fyn(jywVar, myaVar, 12, null, null)).toArray(new String[0]));
                return a2.k();
            }
            throw new IllegalArgumentException("Customized check failed for column name: ".concat(String.valueOf(myaVar.a)));
        }
        throw new IllegalArgumentException("Illegal column name: ".concat(String.valueOf(myaVar.a)));
    }

    private static void c(String str, int i, int i2, int i3) {
        if (i3 < i || i3 > i2) {
            throw new IllegalArgumentException(String.format("Operator %s requires [%d,%d] parameters, but actual %d", str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)));
        }
    }
}
