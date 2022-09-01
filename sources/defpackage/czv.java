package defpackage;

import java.util.List;

/* compiled from: PG */
/* renamed from: czv  reason: default package */
/* loaded from: classes.dex */
public final class czv implements ixd {
    private static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/expression/trainingcache/materializer/ExampleSelectionCriteriaParser");

    @Override // defpackage.ixd
    public final /* bridge */ /* synthetic */ ipz a(ngz ngzVar, llw llwVar) {
        jzz jzzVar;
        jzx jzxVar = (jzx) ngzVar;
        try {
            kai kaiVar = new kai(jzxVar);
            long j = 0;
            if (((jzx) kaiVar.d).a > 0) {
                if (kaiVar.b) {
                    ((StringBuilder) kaiVar.f).append(" AND ");
                }
                kaiVar.b = true;
                Object obj = kaiVar.f;
                ((StringBuilder) obj).append("(((");
                ((StringBuilder) obj).append("selection_hint");
                ((StringBuilder) obj).append(" + ?) % ?) BETWEEN CAST(? as INTEGER) AND CAST(? as INTEGER))");
                kaiVar.a.add(String.valueOf(((jzx) kaiVar.d).d));
                kaiVar.a.add(String.valueOf(((jzx) kaiVar.d).a));
                kaiVar.a.add(String.valueOf(((jzx) kaiVar.d).b));
                kaiVar.a.add(String.valueOf(((jzx) kaiVar.d).c));
            }
            Object obj2 = kaiVar.d;
            int i = ((jzx) obj2).g;
            int i2 = ((jzx) obj2).h;
            if (i > 0 || i2 > 0) {
                jdg.w(i >= 0, "Selection start date must not be negative");
                jdg.w(i2 >= 0, "Selection end date must not be negative");
                if (i != 0) {
                    j = kaiVar.a(String.valueOf(i));
                }
                long currentTimeMillis = i2 == 0 ? System.currentTimeMillis() : kaiVar.a(String.valueOf(i2));
                jdg.w(currentTimeMillis >= j, "Invalid selection date range!");
                if (kaiVar.b) {
                    ((StringBuilder) kaiVar.f).append(" AND ");
                }
                kaiVar.b = true;
                Object obj3 = kaiVar.f;
                ((StringBuilder) obj3).append("(");
                ((StringBuilder) obj3).append("_timestamp_");
                ((StringBuilder) obj3).append(" BETWEEN CAST(? as INTEGER) AND CAST(? as INTEGER))");
                kaiVar.a.add(String.valueOf(j));
                kaiVar.a.add(String.valueOf(currentTimeMillis));
            }
            nfh t = jzz.e.t();
            for (kaa kaaVar : ((jzx) kaiVar.d).i) {
                int i3 = kaaVar.c;
                int m = lxj.m(i3);
                if (m != 0 && m == 3) {
                    kaiVar.b(kaaVar.a, kaaVar.b, true);
                }
                int m2 = lxj.m(i3);
                if (m2 != 0 && m2 == 4) {
                    kaiVar.b(kaaVar.a, kaaVar.b, false);
                }
                int m3 = lxj.m(i3);
                if (m3 == 0) {
                    m3 = 1;
                }
                if (m3 == 1) {
                    throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
                }
                StringBuilder sb = new StringBuilder();
                sb.append("Unknown predicate type: ");
                sb.append(m3 - 2);
                throw new kah(sb.toString());
            }
            String sb2 = ((StringBuilder) kaiVar.f).toString();
            if (t.c) {
                t.cD();
                t.c = false;
            }
            jzz jzzVar2 = (jzz) t.b;
            jzzVar2.a = sb2;
            List list = kaiVar.a;
            nga ngaVar = jzzVar2.b;
            if (!ngaVar.c()) {
                jzzVar2.b = nfm.H(ngaVar);
            }
            ndt.cs(list, jzzVar2.b);
            Object obj4 = kaiVar.d;
            if (((jzx) obj4).f) {
                String str = "DESC";
                if (true != ((jzx) obj4).k) {
                    str = "ASC";
                }
                Object obj5 = kaiVar.e;
                String str2 = ((String) obj5) + " " + str;
                if (t.c) {
                    t.cD();
                    t.c = false;
                }
                ((jzz) t.b).c = str2;
            }
            jzw jzwVar = ((jzx) kaiVar.d).e;
            if (jzwVar != null) {
                if (t.c) {
                    t.cD();
                    t.c = false;
                }
                ((jzz) t.b).d = jzwVar;
            }
            jzzVar = (jzz) t.cz();
        } catch (kah e) {
            ((ltd) ((ltd) ((ltd) a.c()).i(e)).k("com/google/android/apps/inputmethod/libs/expression/trainingcache/materializer/ExampleSelectionCriteriaParser", "getSQLiteSelectionCriteria", '3', "ExampleSelectionCriteriaParser.java")).t("Failed to convert example selection criteria.");
            jzzVar = jzz.e;
        }
        osr b = ipz.b(jzzVar.a, (String[]) jzzVar.b.toArray(new String[0]));
        if (jzxVar.j > 0) {
            b.m("gboard_version_code", ipy.GREATER_OR_EQUAL, String.valueOf(jzxVar.j));
        }
        b.q(jzzVar.c);
        return b.k();
    }
}
