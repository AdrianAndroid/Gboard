package defpackage;

import com.google.android.inputmethod.latin.R;
import java.text.BreakIterator;
import java.util.Locale;

/* compiled from: PG */
/* renamed from: cnb  reason: default package */
/* loaded from: classes.dex */
public final class cnb {
    private static final lgb b = jdg.n(cqg.b);
    public static final boolean[][] a = {new boolean[]{false, true, true, false, true, true, false}, new boolean[]{true, true, true, true, true, true, true}, new boolean[]{true, true, true, true, true, true, true}, new boolean[]{false, true, true, true, true, true, false}, new boolean[]{false, false, true, true, true, false, false}, new boolean[]{false, false, false, true, false, false, false}};

    public static int a() {
        return ((Long) cmo.x.c()).intValue() != 0 ? R.drawable.f48960_resource_name_obfuscated_res_0x7f080280 : R.drawable.f47380_resource_name_obfuscated_res_0x7f0801dc;
    }

    public static cme b(String str) {
        nfh t = cme.c.t();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        str.getClass();
        ((cme) t.b).a = str;
        llp c = c(str);
        int i = ((lrl) c).c;
        for (int i2 = 0; i2 < i; i2++) {
            bxf bxfVar = (bxf) c.get(i2);
            nfh t2 = cmk.c.t();
            String str2 = bxfVar.a;
            if (t2.c) {
                t2.cD();
                t2.c = false;
            }
            ((cmk) t2.b).a = str2;
            nfh t3 = cmj.c.t();
            int i3 = bxfVar.b;
            if (t3.c) {
                t3.cD();
                t3.c = false;
            }
            cmj cmjVar = (cmj) t3.b;
            cmjVar.a = i3;
            cmjVar.b = bxfVar.c;
            cmj cmjVar2 = (cmj) t3.cz();
            if (t2.c) {
                t2.cD();
                t2.c = false;
            }
            cmjVar2.getClass();
            ((cmk) t2.b).b = cmjVar2;
            cmk cmkVar = (cmk) t2.cz();
            if (t.c) {
                t.cD();
                t.c = false;
            }
            cme cmeVar = (cme) t.b;
            cmkVar.getClass();
            nga ngaVar = cmeVar.b;
            if (!ngaVar.c()) {
                cmeVar.b = nfm.H(ngaVar);
            }
            cmeVar.b.add(cmkVar);
        }
        return (cme) t.cz();
    }

    public static llp c(String str) {
        Locale e = hqp.e();
        llk e2 = llp.e();
        BreakIterator c = ((bxg) b.a()).c(e);
        c.setText(str);
        int first = c.first();
        int next = c.next();
        while (true) {
            int i = next;
            int i2 = first;
            first = i;
            if (first != -1) {
                if (!str.substring(i2, first).trim().isEmpty()) {
                    e2.h(new bxf(str.substring(i2, first), i2, first));
                }
                next = c.next();
            } else {
                return e2.g();
            }
        }
    }
}
