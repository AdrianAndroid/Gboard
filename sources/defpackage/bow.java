package defpackage;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.inputmethod.latin.R;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* renamed from: bow  reason: default package */
/* loaded from: classes.dex */
public final class bow implements hqz {
    private final llp a;

    public bow(Context context) {
        Resources resources = context.getResources();
        llk e = llp.e();
        String[] stringArray = resources.getStringArray(R.array.f1680_resource_name_obfuscated_res_0x7f030047);
        lmx g = lmz.g();
        for (String str : stringArray) {
            g.d(str);
        }
        e.h(g.g());
        String[] stringArray2 = resources.getStringArray(R.array.f1690_resource_name_obfuscated_res_0x7f030048);
        lfy c = lfy.c(',');
        for (String str2 : stringArray2) {
            lmx g2 = lmz.g();
            for (String str3 : c.i(str2)) {
                g2.d(str3);
            }
            e.h(g2.g());
        }
        this.a = e.g();
    }

    private final boolean c(hqt hqtVar, hqt hqtVar2) {
        if (e(hqtVar) || !e(hqtVar2)) {
            llp llpVar = this.a;
            int i = ((lrl) llpVar).c;
            for (int i2 = 0; i2 < i; i2++) {
                Set set = (Set) llpVar.get(i2);
                if (set.contains(hqtVar.h().n) && set.contains(hqtVar2.h().n)) {
                    return false;
                }
            }
            return true;
        }
        return true;
    }

    private final boolean d(hqt hqtVar) {
        if ("handwriting".equals(hqtVar.p())) {
            return false;
        }
        jav h = hqtVar.h();
        llp llpVar = this.a;
        int i = ((lrl) llpVar).c;
        int i2 = 0;
        while (i2 < i) {
            int i3 = i2 + 1;
            if (((lmz) llpVar.get(i2)).contains(h.n)) {
                return true;
            }
            i2 = i3;
        }
        return false;
    }

    private static boolean e(hqt hqtVar) {
        iav g = hqtVar.g();
        return g != null && g.q.d(R.id.f54960_resource_name_obfuscated_res_0x7f0b01d8, false);
    }

    @Override // defpackage.hqz
    public final int a(hqt hqtVar) {
        return d(hqtVar) ? 2 : 0;
    }

    @Override // defpackage.hqz
    public final lmz b(hqt hqtVar, Collection collection) {
        if (!d(hqtVar)) {
            return lrr.a;
        }
        qq qqVar = new qq();
        jav h = hqtVar.h();
        qq qqVar2 = new qq();
        qqVar2.add(h.g);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            hqt hqtVar2 = (hqt) it.next();
            if (!"handwriting".equals(hqtVar2.p())) {
                String str = hqtVar2.h().g;
                if (!qqVar2.contains(str) && !c(hqtVar, hqtVar2)) {
                    Iterator it2 = qqVar.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            if (c(hqtVar2, (hqt) it2.next())) {
                                break;
                            }
                        } else {
                            qqVar.add(hqtVar2);
                            qqVar2.add(str);
                            break;
                        }
                    }
                }
            }
        }
        return lmz.p(qqVar);
    }
}
