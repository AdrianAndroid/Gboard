package defpackage;

import android.content.Context;
import android.database.SQLException;
import android.text.TextUtils;
import java.util.HashSet;
import java.util.Map;

/* compiled from: PG */
/* renamed from: ipo  reason: default package */
/* loaded from: classes.dex */
public final class ipo {
    private static final ltg a = ltg.j("com/google/android/libraries/inputmethod/protoxdb/ProtoXDBFactory");

    public static ipk a(Context context, ipa ipaVar) {
        try {
            ipm ipmVar = new ipm(ipaVar, gvs.a, new ipn(context, ipaVar.a).getWritableDatabase(), null);
            lsz it = ipmVar.c.values().iterator();
            while (it.hasNext()) {
                ipr iprVar = (ipr) it.next();
                if (ipf.b(iprVar.d).contains(iprVar.b)) {
                    llw a2 = ipf.a(iprVar.d, iprVar.b);
                    lmz c = ipf.c(iprVar.d, iprVar.b, true);
                    if (c.size() > 1) {
                        ((ltd) ipr.a.a(hip.a).k("com/google/android/libraries/inputmethod/protoxdb/TableSchema", "maintainSchema", 453, "TableSchema.java")).G("ProtoXDB tables only support one unique field, but table [%s] has: %s", iprVar.b, c);
                    }
                    String str = (String) lre.ao(c);
                    if (TextUtils.isEmpty(iprVar.c.d) || TextUtils.equals(str, iprVar.c.d)) {
                        if (!TextUtils.isEmpty(str) && TextUtils.isEmpty(iprVar.c.d)) {
                            ipf.h(iprVar.d, iprVar.b, str);
                        }
                        lsf i = lvw.i(iprVar.g.entrySet(), a2.entrySet());
                        if (!i.isEmpty()) {
                            ipq ipqVar = iprVar.c;
                            lsz it2 = i.iterator();
                            while (it2.hasNext()) {
                                Map.Entry entry = (Map.Entry) it2.next();
                                ipf.d(iprVar.d, iprVar.b, (String) entry.getKey(), (iox) entry.getValue());
                            }
                        }
                        iprVar.a();
                        iprVar.k = true;
                        boolean z = iprVar.k;
                    } else {
                        ipf.i(iprVar.d, iprVar.b);
                    }
                }
                iprVar.b();
                iprVar.k = true;
                boolean z2 = iprVar.k;
            }
            HashSet hashSet = new HashSet();
            llp llpVar = ipmVar.d.b;
            int i2 = ((lrl) llpVar).c;
            for (int i3 = 0; i3 < i2; i3++) {
                hashSet.add(((ipq) llpVar.get(i3)).a.d());
            }
            lsz it3 = lvw.i(ipf.b(ipmVar.e), hashSet).iterator();
            while (it3.hasNext()) {
                String str2 = (String) it3.next();
                if (!ipm.b.contains(str2)) {
                    ipf.i(ipmVar.e, str2);
                }
            }
            return ipmVar;
        } catch (SQLException e) {
            ((ltd) ((ltd) ((ltd) a.c()).i(e)).k("com/google/android/libraries/inputmethod/protoxdb/ProtoXDBFactory", "create", ')', "ProtoXDBFactory.java")).t("Failed to get writable database.");
            return null;
        }
    }
}
