package defpackage;

import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* compiled from: PG */
/* renamed from: pj  reason: default package */
/* loaded from: classes2.dex */
public final class pj extends pi {
    @Override // defpackage.pi
    public final /* synthetic */ Object a(int i, Intent intent) {
        if (i != -1 || intent == null) {
            return ojs.a;
        }
        String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
        int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
        if (intArrayExtra == null || stringArrayExtra == null) {
            return ojs.a;
        }
        int length = intArrayExtra.length;
        ArrayList arrayList = new ArrayList(length);
        int i2 = 0;
        while (i2 < length) {
            int i3 = i2 + 1;
            arrayList.add(Boolean.valueOf(intArrayExtra[i2] == 0));
            i2 = i3;
        }
        List z = nxp.z(stringArrayExtra);
        Iterator it = z.iterator();
        Iterator it2 = arrayList.iterator();
        ArrayList arrayList2 = new ArrayList(Math.min(nxp.u(z), nxp.u(arrayList)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList2.add(oix.b(it.next(), it2.next()));
        }
        return nxp.m(arrayList2);
    }

    @Override // defpackage.pi
    public final /* synthetic */ Intent b(Object obj) {
        Intent putExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", (String[]) obj);
        oll.d(putExtra, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
        return putExtra;
    }

    @Override // defpackage.pi
    public final /* synthetic */ aqq c(Context context, Object obj) {
        aqq aqqVar;
        String[] strArr = (String[]) obj;
        int length = strArr.length;
        if (length == 0) {
            aqqVar = new aqq(ojs.a, (char[]) null);
        } else {
            int i = 0;
            int i2 = 0;
            while (i2 < length) {
                int i3 = i2 + 1;
                if (uv.a(context, strArr[i2]) != 0) {
                    return null;
                }
                i2 = i3;
            }
            int length2 = strArr.length;
            LinkedHashMap linkedHashMap = new LinkedHashMap(ols.b(nxp.k(length2), 16));
            while (i < length2) {
                int i4 = i + 1;
                ojc b = oix.b(strArr[i], true);
                linkedHashMap.put(b.a, b.b);
                i = i4;
            }
            aqqVar = new aqq(linkedHashMap, (char[]) null);
        }
        return aqqVar;
    }
}
