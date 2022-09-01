package defpackage;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.Collection;
import java.util.Set;

/* compiled from: PG */
/* renamed from: eqp  reason: default package */
/* loaded from: classes.dex */
public final class eqp {
    private static final ltg c = ltg.j("com/google/android/apps/inputmethod/libs/theme/core/SimpleSelectorSet");
    public final int[] a;
    public final int b;
    private final Collection d;

    public eqp(Collection collection, int[] iArr) {
        this.d = collection;
        this.a = iArr;
        this.b = collection.size() + iArr.length;
    }

    public static eqp a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        char c2 = 65535;
        String[] split = str.split(":", -1);
        String str2 = split[0];
        String str3 = split.length > 1 ? split[1] : null;
        String[] strArr = gvw.g;
        if (str2.startsWith(".")) {
            strArr = str2.substring(1).split("\\.", -1);
        } else if (!str2.isEmpty()) {
            ((ltd) ((ltd) c.d()).k("com/google/android/apps/inputmethod/libs/theme/core/SimpleSelectorSet", "parse", 89, "SimpleSelectorSet.java")).w("Invalid class selector: %s", str);
            return null;
        }
        int[] iArr = gvw.b;
        if (str3 != null) {
            switch (str3.hashCode()) {
                case -1609594047:
                    if (str3.equals("enabled")) {
                        c2 = 3;
                        break;
                    }
                    break;
                case -318264286:
                    if (str3.equals("pressed")) {
                        c2 = 0;
                        break;
                    }
                    break;
                case 204392913:
                    if (str3.equals("activated")) {
                        c2 = 2;
                        break;
                    }
                    break;
                case 1191572123:
                    if (str3.equals("selected")) {
                        c2 = 1;
                        break;
                    }
                    break;
            }
            int i = c2 != 0 ? c2 != 1 ? c2 != 2 ? c2 != 3 ? 0 : 16842910 : 16843518 : 16842913 : 16842919;
            if (i == 0) {
                ((ltd) ((ltd) c.d()).k("com/google/android/apps/inputmethod/libs/theme/core/SimpleSelectorSet", "parse", 99, "SimpleSelectorSet.java")).w("Invalid state selector: %s", str);
                return null;
            }
            iArr = new int[]{i};
        }
        return new eqp(Arrays.asList(strArr), iArr);
    }

    public final boolean b(Set set) {
        return set.containsAll(this.d);
    }
}
