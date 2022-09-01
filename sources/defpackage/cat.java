package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.inputmethod.latin.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* renamed from: cat  reason: default package */
/* loaded from: classes.dex */
public final class cat {
    public static final hhl a = hhq.a("use_mdd_in_delight", false);

    public static List a(List list) {
        ArrayList arrayList = new ArrayList();
        boolean booleanValue = ((Boolean) cfd.g.c()).booleanValue();
        if (list.isEmpty()) {
            throw new cen();
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            hqt hqtVar = (hqt) it.next();
            if (TextUtils.equals(hqtVar.p(), "handwriting")) {
                iav g = hqtVar.g();
                if (booleanValue && g != null && g.q.d(R.id.f54880_resource_name_obfuscated_res_0x7f0b01d0, false)) {
                    dfv.b();
                    arrayList.add(dfv.a(hqtVar.h()));
                }
            } else {
                arrayList.add(hqtVar.h().q());
            }
        }
        return arrayList.isEmpty() ? Collections.emptyList() : Collections.unmodifiableList(arrayList);
    }

    public static Locale b(Context context, Locale locale) {
        return cdx.b(context).d(locale);
    }
}
