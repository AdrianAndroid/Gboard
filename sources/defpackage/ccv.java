package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* renamed from: ccv  reason: default package */
/* loaded from: classes.dex */
public final class ccv {
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/delight5/dlam/DlamLanguageIdentificationUtils");

    public static String a(ghg ghgVar, ghf ghfVar) {
        float f = ghfVar.b;
        double d = f;
        if (d <= 0.0d || d >= 1.0d) {
            ((ltd) ((ltd) a.d()).k("com/google/android/apps/inputmethod/libs/delight5/dlam/DlamLanguageIdentificationUtils", "identfyLanguageOfApp", 172, "DlamLanguageIdentificationUtils.java")).w("Invalid confidence value in LanguageIdentificationStrategy: %f it should be in (0, 1)", Float.valueOf(f));
            return "";
        }
        int i = (int) (f * 10.0f);
        int i2 = -1;
        String str = "";
        int i3 = 0;
        for (ghi ghiVar : ghgVar.c) {
            if (ghfVar.c) {
                for (int i4 = 0; i4 < i; i4++) {
                    i3 += ghiVar.f.d(i4);
                }
            }
            int i5 = 0;
            for (int i6 = i; i6 < ghiVar.f.size(); i6++) {
                i5 += ghiVar.f.d(i6);
                i3 += ghiVar.f.d(i6);
            }
            if (i5 > i2) {
                str = ghiVar.b;
                i2 = i5;
            }
        }
        return i2 >= ((int) (((float) i3) * ghfVar.a)) ? str : "";
    }

    public static ghg b(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ghg ghgVar = (ghg) it.next();
            if (ghgVar.b.equals("default_package")) {
                return ghgVar;
            }
        }
        return null;
    }
}
