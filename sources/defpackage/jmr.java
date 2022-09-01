package defpackage;

import java.util.Map;

/* compiled from: PG */
/* renamed from: jmr  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class jmr implements kqk {
    private final /* synthetic */ int a;

    public /* synthetic */ jmr(int i) {
        this.a = i;
    }

    @Override // defpackage.kqk
    public final ngz a(kdg kdgVar, ngz ngzVar) {
        if (this.a == 0) {
            jio jioVar = (jio) ngzVar;
            nfh t = jio.d.t();
            lsz it = kdgVar.a().entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                try {
                    String str = (String) entry.getValue();
                    jdg.u(str);
                    try {
                        t.cZ((String) entry.getKey(), (jig) jez.r(str, (nhf) jig.v.N(7)));
                    } catch (ngd e) {
                        jmk.b("SharedPreferences file groups metadata had unexpected format: %s", e);
                    }
                } catch (ClassCastException | NullPointerException e2) {
                    jmk.b("SharedPreferences file groups metadata key wasn't a string: %s", e2);
                }
            }
            return (jio) t.cz();
        }
        jiw jiwVar = (jiw) ngzVar;
        nfh t2 = jiw.b.t();
        lsz it2 = kdgVar.a().entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it2.next();
            try {
                String str2 = (String) entry2.getValue();
                jdg.u(str2);
                try {
                    t2.db((String) entry2.getKey(), (jiu) jez.r(str2, (nhf) jiu.h.N(7)));
                } catch (ngd e3) {
                    jmk.b("SharedPreferences shared files metadata had unexpected format: %s", e3);
                }
            } catch (ClassCastException | NullPointerException e4) {
                jmk.b("SharedPreferences shared files metadata key wasn't a string: %s", e4);
            }
        }
        return (jiw) t2.cz();
    }
}
