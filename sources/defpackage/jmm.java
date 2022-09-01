package defpackage;

import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* renamed from: jmm  reason: default package */
/* loaded from: classes.dex */
public final class jmm implements kqk {
    private static String b(String str, String str2) {
        return str + "|" + str2;
    }

    @Override // defpackage.kqk
    public final /* bridge */ /* synthetic */ ngz a(kdg kdgVar, ngz ngzVar) {
        jis jisVar = (jis) ngzVar;
        if (!jisVar.d) {
            HashSet hashSet = new HashSet();
            nfh nfhVar = (nfh) jisVar.N(5);
            nfhVar.cG(jisVar);
            boolean z = false;
            if (nfhVar.c) {
                nfhVar.cD();
                nfhVar.c = false;
            }
            jis jisVar2 = (jis) nfhVar.b;
            int i = 2;
            jisVar2.a |= 2;
            jisVar2.d = true;
            lsz it = kdgVar.a().entrySet().iterator();
            while (it.hasNext()) {
                List k = lfy.e("|").k((CharSequence) ((Map.Entry) it.next()).getKey());
                if (k.size() >= 4) {
                    int i2 = z ? 1 : 0;
                    int i3 = z ? 1 : 0;
                    int i4 = z ? 1 : 0;
                    int i5 = z ? 1 : 0;
                    String str = (String) k.get(i2);
                    String str2 = (String) k.get(1);
                    int parseInt = Integer.parseInt((String) k.get(i));
                    String str3 = str + "|" + str2 + "|" + parseInt;
                    if (!hashSet.contains(str3)) {
                        hashSet.add(str3);
                        String b = b(str3, "w");
                        String b2 = b(str3, "c");
                        long b3 = kdgVar.b(b);
                        long b4 = kdgVar.b(b2);
                        nfh t = jil.h.t();
                        nfh t2 = jiq.f.t();
                        if (t2.c) {
                            t2.cD();
                            t2.c = z;
                        }
                        jiq jiqVar = (jiq) t2.b;
                        str2.getClass();
                        int i6 = jiqVar.a | 1;
                        jiqVar.a = i6;
                        jiqVar.b = str2;
                        str.getClass();
                        jiqVar.a = i6 | 2;
                        jiqVar.c = str;
                        if (t.c) {
                            t.cD();
                            t.c = false;
                        }
                        jil jilVar = (jil) t.b;
                        jiq jiqVar2 = (jiq) t2.cz();
                        jiqVar2.getClass();
                        jilVar.b = jiqVar2;
                        jilVar.a |= 1;
                        if (t.c) {
                            t.cD();
                            t.c = false;
                        }
                        jil jilVar2 = (jil) t.b;
                        int i7 = jilVar2.a | 8;
                        jilVar2.a = i7;
                        jilVar2.e = parseInt;
                        int i8 = i7 | 16;
                        jilVar2.a = i8;
                        jilVar2.f = b4;
                        jilVar2.a = i8 | 32;
                        jilVar2.g = b3;
                        if (nfhVar.c) {
                            nfhVar.cD();
                            z = false;
                            nfhVar.c = false;
                        } else {
                            z = false;
                        }
                        jis jisVar3 = (jis) nfhVar.b;
                        jil jilVar3 = (jil) t.cz();
                        jilVar3.getClass();
                        jisVar3.b();
                        jisVar3.c.add(jilVar3);
                        i = 2;
                    }
                }
            }
            return (jis) nfhVar.cz();
        }
        return jisVar;
    }
}
