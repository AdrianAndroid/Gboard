package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: PG */
/* renamed from: ian  reason: default package */
/* loaded from: classes.dex */
public final class ian {
    private static final hdz a = hdz.a();

    public static mko a(ict[] ictVarArr, mkr mkrVar) {
        return b(ictVarArr, hdl.a, mkrVar);
    }

    public static mko b(ict[] ictVarArr, hdl hdlVar, mkr mkrVar) {
        List<List> lonVar;
        if (ictVarArr == null) {
            return kcu.K(null);
        }
        List asList = Arrays.asList(ictVarArr);
        jdg.u(asList);
        jdg.v(true);
        if (asList instanceof RandomAccess) {
            lonVar = new loo(asList);
        } else {
            lonVar = new lon(asList);
        }
        ArrayList arrayList = new ArrayList(lonVar.size());
        for (List list : lonVar) {
            arrayList.add(mkrVar.hQ(new gnq(list, hdlVar, 8)));
        }
        return mio.g(kcu.G(arrayList), new hdp(ictVarArr, 18), mkrVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x015b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0018 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0131  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.List c(java.util.List r24, defpackage.hdl r25, int r26) {
        /*
            Method dump skipped, instructions count: 366
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ian.c(java.util.List, hdl, int):java.util.List");
    }

    public static ict[] d(ict[] ictVarArr, int i) {
        return e(ictVarArr, hdl.a, i);
    }

    public static ict[] e(ict[] ictVarArr, hdl hdlVar, int i) {
        if (ictVarArr == null) {
            return null;
        }
        return (ict[]) lre.ak(c(Arrays.asList(ictVarArr), hdlVar, i), ict.class);
    }

    private static ial f(ial ialVar, hdl hdlVar, iaj iajVar, ArrayList arrayList, ArrayList arrayList2, gvy gvyVar) {
        String c;
        boolean b = hdlVar.b();
        iay[] iayVarArr = ialVar.d;
        int length = iayVarArr == null ? 0 : iayVarArr.length;
        boolean z = false;
        boolean z2 = false;
        for (int i = 0; i < length; i++) {
            iay iayVar = ialVar.d[i];
            String e = ialVar.e(i);
            int b2 = ialVar.b(i);
            Object obj = iayVar.e;
            int i2 = iayVar.c;
            if ((obj instanceof String) && (i2 > 0 || iaz.i(i2) || i2 == -10071)) {
                String str = (String) iayVar.e;
                int i3 = 0;
                while (i3 < str.length()) {
                    String str2 = str;
                    if (str.charAt(i3) >= 8986) {
                        if (b) {
                            c = (String) iayVar.e;
                        } else {
                            c = a.c((String) iayVar.e);
                        }
                        if (c != null && (!b ? a.e(c) : a.f(c, hdlVar))) {
                            if (iayVar.e != c) {
                                h(arrayList, new iay(iayVar.c, iayVar.d, c));
                                z = true;
                            } else {
                                h(arrayList, iayVar);
                            }
                            if (e == null) {
                                h(arrayList2, null);
                                g(gvyVar, 0);
                            } else if (!b) {
                                String c2 = a.c(e);
                                if (arrayList != null) {
                                    c2 = (String) jdg.U(c2, (String) ((iay) lre.ac(arrayList)).e);
                                }
                                h(arrayList2, c2);
                                g(gvyVar, b2);
                                z |= !e.equals(c2);
                            } else {
                                h(arrayList2, e);
                                g(gvyVar, b2);
                            }
                            z2 = true;
                        } else {
                            z = true;
                        }
                    } else {
                        i3++;
                        str = str2;
                    }
                }
            }
            h(arrayList, iayVar);
            h(arrayList2, e);
            g(gvyVar, b2);
            z2 = true;
        }
        if (!z) {
            return ialVar;
        }
        if (!z2) {
            return null;
        }
        if (arrayList == null || arrayList2 == null || gvyVar == null) {
            return f(ialVar, hdlVar, iajVar, new ArrayList(length), new ArrayList(length), new gvy(length));
        }
        iajVar.k();
        iajVar.i(ialVar);
        iajVar.d = (String[]) arrayList2.toArray(new String[0]);
        iajVar.e = gvyVar.e();
        iajVar.c = (iay[]) arrayList.toArray(new iay[0]);
        return iajVar.b();
    }

    private static void g(gvy gvyVar, int i) {
        if (gvyVar != null) {
            gvyVar.b(i);
        }
    }

    private static void h(ArrayList arrayList, Object obj) {
        if (arrayList != null) {
            arrayList.add(obj);
        }
    }

    private static boolean i(Object[] objArr) {
        for (Object obj : objArr) {
            if (obj != null) {
                return false;
            }
        }
        return true;
    }
}
