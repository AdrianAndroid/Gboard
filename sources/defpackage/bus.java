package defpackage;

import android.text.InputFilter;
import android.text.SpannedString;

/* compiled from: PG */
/* renamed from: bus  reason: default package */
/* loaded from: classes.dex */
final class bus {
    private static final SpannedString a = new SpannedString("");

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.llp a(android.content.Context r12, android.view.inputmethod.EditorInfo r13) {
        /*
            llk r0 = defpackage.llp.e()
            java.util.Locale r1 = defpackage.ham.o(r13)
            if (r1 == 0) goto Lb
            goto Lf
        Lb:
            java.util.Locale r1 = defpackage.gwc.h(r12)
        Lf:
            int r12 = r13.inputType
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 26
            r4 = 32
            r5 = 16
            r6 = 3
            r7 = 4
            r8 = 2
            r9 = 0
            r10 = 1
            r11 = 0
            if (r2 >= r3) goto L23
        L21:
            r12 = r9
            goto L57
        L23:
            r2 = r12 & 15
            if (r2 != r8) goto L3a
            r2 = r12 & 4096(0x1000, float:5.74E-42)
            if (r2 == 0) goto L2d
            r2 = 1
            goto L2e
        L2d:
            r2 = 0
        L2e:
            r12 = r12 & 8192(0x2000, float:1.14794E-41)
            if (r12 == 0) goto L34
            r12 = 1
            goto L35
        L34:
            r12 = 0
        L35:
            android.text.method.DigitsKeyListener r12 = android.text.method.DigitsKeyListener.getInstance(r1, r2, r12)
            goto L57
        L3a:
            if (r2 != r7) goto L51
            r12 = r12 & 4080(0xff0, float:5.717E-42)
            if (r12 == r5) goto L4c
            if (r12 == r4) goto L47
            android.text.method.DateTimeKeyListener r12 = android.text.method.DateTimeKeyListener.getInstance(r1)
            goto L57
        L47:
            android.text.method.TimeKeyListener r12 = android.text.method.TimeKeyListener.getInstance(r1)
            goto L57
        L4c:
            android.text.method.DateKeyListener r12 = android.text.method.DateKeyListener.getInstance(r1)
            goto L57
        L51:
            if (r2 != r6) goto L21
            android.text.method.DialerKeyListener r12 = android.text.method.DialerKeyListener.getInstance()
        L57:
            if (r12 == 0) goto L5c
            r0.h(r12)
        L5c:
            int r12 = r13.inputType
            r13 = r12 & 15
            if (r13 != r8) goto L75
            r13 = r12 & 4096(0x1000, float:5.74E-42)
            if (r13 == 0) goto L68
            r13 = 1
            goto L69
        L68:
            r13 = 0
        L69:
            r12 = r12 & 8192(0x2000, float:1.14794E-41)
            if (r12 == 0) goto L6e
            goto L6f
        L6e:
            r10 = 0
        L6f:
            android.text.method.DigitsKeyListener r9 = new android.text.method.DigitsKeyListener
            r9.<init>(r13, r10)
            goto L92
        L75:
            if (r13 != r7) goto L8c
            r12 = r12 & 4080(0xff0, float:5.717E-42)
            if (r12 == r5) goto L87
            if (r12 == r4) goto L82
            android.text.method.DateTimeKeyListener r9 = android.text.method.DateTimeKeyListener.getInstance()
            goto L92
        L82:
            android.text.method.TimeKeyListener r9 = android.text.method.TimeKeyListener.getInstance()
            goto L92
        L87:
            android.text.method.DateKeyListener r9 = android.text.method.DateKeyListener.getInstance()
            goto L92
        L8c:
            if (r13 != r6) goto L92
            android.text.method.DialerKeyListener r9 = android.text.method.DialerKeyListener.getInstance()
        L92:
            if (r9 == 0) goto L97
            r0.h(r9)
        L97:
            llp r12 = r0.g()
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bus.a(android.content.Context, android.view.inputmethod.EditorInfo):llp");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean b(llp llpVar, String str) {
        int i = ((lrl) llpVar).c;
        int i2 = 0;
        while (i2 < i) {
            CharSequence filter = ((InputFilter) llpVar.get(i2)).filter(str, 0, str.length(), a, 0, 0);
            if (filter == null) {
                return true;
            }
            i2++;
            if (filter.length() == str.length()) {
                return true;
            }
        }
        return false;
    }
}
