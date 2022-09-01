package defpackage;

import android.text.TextUtils;
import com.google.android.apps.inputmethod.libs.hmm.MutableDictionaryAccessorInterface$Entry;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: PG */
/* renamed from: cgo  reason: default package */
/* loaded from: classes.dex */
public final class cgo implements djp {
    private final /* synthetic */ int a;

    public cgo(int i) {
        this.a = i;
    }

    private static final boolean b(String str) {
        if (str != null) {
            for (int i = 0; i < str.length(); i++) {
                if (dmf.b(str.charAt(i)) == 0) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.djp
    public final MutableDictionaryAccessorInterface$Entry a(String str, String str2, String str3, int i) {
        String lowerCase;
        int i2 = this.a;
        if (i2 == 0) {
            if (str3 == null || !jbs.h(str3)) {
                return null;
            }
            if (str2 == null) {
                lowerCase = str3.toLowerCase(Locale.US);
            } else {
                lowerCase = str2.toLowerCase(Locale.US);
            }
            String[] a = dip.a(lowerCase);
            int[] iArr = new int[a.length];
            Arrays.fill(iArr, 26);
            return new MutableDictionaryAccessorInterface$Entry(a, iArr, str3, i, false, true, 0);
        } else if (i2 == 1) {
            if ((!TextUtils.isEmpty(str) && !str.startsWith("en") && !str.startsWith("zh")) || str3 == null || jbs.h(str3)) {
                return null;
            }
            if (str2 == null) {
                return new MutableDictionaryAccessorInterface$Entry(null, null, str3, i, false, false, 0);
            }
            String[] a2 = dip.a(str2.toLowerCase(Locale.US));
            int[] iArr2 = new int[a2.length];
            Arrays.fill(iArr2, 26);
            return new MutableDictionaryAccessorInterface$Entry(a2, iArr2, str3, i, false, true, 0);
        } else if (TextUtils.isEmpty(str2) && b(str3)) {
            return new MutableDictionaryAccessorInterface$Entry(null, null, str3, i, false, false, 0);
        } else {
            if (!b(str2) || !b(str3)) {
                return null;
            }
            int length = str2.length();
            String[] strArr = new String[length];
            int i3 = 0;
            while (i3 < length) {
                int i4 = i3 + 1;
                strArr[i3] = str2.substring(i3, i4);
                i3 = i4;
            }
            int[] iArr3 = new int[length];
            Arrays.fill(iArr3, 9);
            return new MutableDictionaryAccessorInterface$Entry(strArr, iArr3, str3, i, false, false, 0);
        }
    }
}
