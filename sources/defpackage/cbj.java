package defpackage;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/* compiled from: PG */
/* renamed from: cbj  reason: default package */
/* loaded from: classes.dex */
public final class cbj {
    private static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/delight5/InputContextApplicator");
    private volatile Set b;
    private final hls c;

    public cbj(hls hlsVar) {
        this.c = hlsVar;
    }

    private final void j(CharSequence charSequence, String str, CharSequence charSequence2, String str2, String str3, boolean z, hln hlnVar) {
        this.c.x();
        if (z) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str2);
            d(spannableStringBuilder.toString(), true);
            this.c.hV(spannableStringBuilder, false, 1);
        } else {
            if (TextUtils.isEmpty(str3)) {
                d(charSequence.toString(), false);
            }
            this.c.hW();
        }
        CharSequence subSequence = charSequence.subSequence(str2.length(), charSequence.length());
        if (!TextUtils.isEmpty(subSequence)) {
            this.c.hV(subSequence, false, 1);
        }
        if (!TextUtils.isEmpty(charSequence2)) {
            this.c.g(charSequence2, 1);
        }
        if (TextUtils.isEmpty(str)) {
            l(hlnVar, charSequence);
        }
        this.c.D();
    }

    private final void k(String str) {
        str.length();
        this.c.f(0, str.length(), str);
    }

    private final void l(hln hlnVar, CharSequence charSequence) {
        this.c.hZ(ccm.a(hlnVar, charSequence), true);
    }

    public final void a(boolean z, mub mubVar, String str, String str2, boolean z2, hln hlnVar) {
        int i;
        int i2;
        String str3;
        int i3;
        int i4;
        boolean z3;
        String str4 = mubVar.b;
        String str5 = mubVar.d;
        String str6 = mubVar.e;
        String str7 = mubVar.c;
        String str8 = mubVar.f;
        String str9 = mubVar.g;
        String str10 = mubVar.h;
        String str11 = mubVar.i;
        int length = str4.length();
        int length2 = str7.length();
        boolean z4 = false;
        if (!TextUtils.isEmpty(str11)) {
            if (z || length != 0 || length2 != 0 || !TextUtils.isEmpty(str5) || !TextUtils.isEmpty(str8) || !TextUtils.equals(str11, TextUtils.concat(str, str2))) {
                ((ltd) a.a(hip.a).k("com/google/android/apps/inputmethod/libs/delight5/InputContextApplicator", "applyInputConnectionDiffInternal", 222, "InputContextApplicator.java")).t("Text selection is not supported by Applicator except for word selection.");
                return;
            }
            int length3 = str.length();
            int length4 = str2.length();
            this.c.x();
            this.c.hW();
            this.c.M(-length3, length4);
            this.c.D();
            return;
        }
        if (!z && length == 0) {
            if (length2 != 0) {
                length = 0;
            } else if (TextUtils.isEmpty(str5) && TextUtils.isEmpty(str8) && TextUtils.isEmpty(str10)) {
                this.c.g(str9, 1);
                l(hlnVar, str9);
                return;
            } else {
                length = 0;
                length2 = 0;
            }
        }
        if (z || length != 0) {
            i = length2;
            i2 = length;
        } else if (length2 != 0) {
            i = length2;
            i2 = 0;
        } else if (TextUtils.isEmpty(str6) && str5.toString().startsWith(str) && TextUtils.equals(str8, str2) && TextUtils.isEmpty(str10)) {
            if (!this.c.h().o()) {
                if (!TextUtils.isEmpty(str9) || !TextUtils.isEmpty(str8)) {
                    j(str5, str8, str9, str, str2, z2, hlnVar);
                    return;
                }
                if (z2) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str5);
                    d(str, true);
                    this.c.hV(spannableStringBuilder, false, 1);
                } else {
                    this.c.hV(str5, false, 1);
                    d(str5.toString(), false);
                }
                l(hlnVar, str5);
                return;
            }
            j(str5, str8, str9, str, str2, z2, hlnVar);
            return;
        } else {
            i2 = 0;
            i = 0;
        }
        if (z || i2 != 0 || i != 0 || !TextUtils.isEmpty(str6) || !TextUtils.isEmpty(str9) || !str5.toString().startsWith(str) || TextUtils.equals(str5, str) || !TextUtils.equals(str10, str2)) {
            hln hlnVar2 = null;
            if (z || !TextUtils.isEmpty(str5) || !TextUtils.isEmpty(str8) || i2 <= 0 || i != 0 || TextUtils.isEmpty(str9) || !TextUtils.isEmpty(str) || !TextUtils.isEmpty(str2) || !str4.startsWith(str9.toString()) || !TextUtils.isEmpty(str10)) {
                if (z || !TextUtils.isEmpty(str9) || ((i2 != 0 && !TextUtils.isEmpty(str)) || i != 0 || !str.startsWith(str5.toString()) || !TextUtils.equals(str2, str8) || !TextUtils.isEmpty(str10))) {
                    if (z || TextUtils.isEmpty(str5) || i2 != 0 || i != 0 || !TextUtils.isEmpty(str9) || !TextUtils.isEmpty(str10) || !TextUtils.isEmpty(str8) || (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2))) {
                        if (z || !TextUtils.isEmpty(str5) || !TextUtils.isEmpty(str8) || i2 <= 0 || i != 0 || TextUtils.isEmpty(str9) || !TextUtils.isEmpty(str) || !TextUtils.isEmpty(str2) || !str9.toString().startsWith(str4) || !TextUtils.isEmpty(str10)) {
                            if (z || TextUtils.isEmpty(str) || !TextUtils.isEmpty(str2) || !TextUtils.isEmpty(str9) || TextUtils.isEmpty(str10) || !TextUtils.isEmpty(str4) || TextUtils.isEmpty(str5) || !TextUtils.isEmpty(str8)) {
                                str3 = str7;
                            } else {
                                str3 = str7;
                                if (TextUtils.equals(str10, str3)) {
                                    this.c.x();
                                    d(str5.toString(), z2);
                                    hls hlsVar = this.c;
                                    if (!((Boolean) cas.O.c()).booleanValue() || TextUtils.isEmpty(str6)) {
                                        i4 = 1;
                                    } else {
                                        i4 = 1;
                                        z4 = true;
                                    }
                                    hlsVar.hV(str5, z4, i4);
                                    k(str10);
                                    this.c.D();
                                    return;
                                }
                            }
                            if (!str.isEmpty() || !str2.isEmpty() || i2 != 0 || TextUtils.isEmpty(str10) || !TextUtils.equals(str3, str10) || TextUtils.isEmpty(str5) || !TextUtils.isEmpty(str8) || !TextUtils.isEmpty(str9)) {
                                if (!((Boolean) cas.H.c()).booleanValue() || TextUtils.isEmpty(str5) || z || i2 != 0 || i != 0 || !TextUtils.isEmpty(str6) || !TextUtils.isEmpty(str8) || !TextUtils.isEmpty(str10)) {
                                    if (!z || i2 != 0 || i != 0 || !TextUtils.equals(str, str9) || !TextUtils.equals(str2, str10) || !TextUtils.isEmpty(str5) || !TextUtils.isEmpty(str6) || !TextUtils.isEmpty(str8)) {
                                        if (z || TextUtils.isEmpty(str6) || !TextUtils.isEmpty(str) || !TextUtils.isEmpty(str2) || !TextUtils.isEmpty(str9) || !TextUtils.isEmpty(str10)) {
                                            this.c.hu(i2, i, str5, str6, str8, str9, str10);
                                            return;
                                        }
                                        int length5 = str5.length();
                                        while (length5 > 0 && !str6.endsWith(str5.subSequence(0, length5).toString())) {
                                            length5--;
                                        }
                                        int length6 = str6.length() - length5;
                                        String substring = str6.substring(0, length6);
                                        String valueOf = String.valueOf(str5);
                                        this.c.x();
                                        this.c.C(i2 + length6, i);
                                        this.c.hV(String.valueOf(substring).concat(String.valueOf(valueOf)), true, 1);
                                        this.c.D();
                                        return;
                                    }
                                    this.c.B();
                                    return;
                                }
                                this.c.x();
                                this.c.hV(str5, false, 1);
                                this.c.g(str9, 1);
                                this.c.D();
                                return;
                            }
                            this.c.x();
                            hls hlsVar2 = this.c;
                            if (!((Boolean) cas.O.c()).booleanValue() || TextUtils.isEmpty(str6)) {
                                i3 = 1;
                            } else {
                                i3 = 1;
                                z4 = true;
                            }
                            hlsVar2.hV(str5, z4, i3);
                            k(str10.toString());
                            this.c.D();
                            return;
                        }
                        this.c.x();
                        str4.length();
                        this.c.f(str4.length(), 0, str4);
                        this.c.g(str9, 1);
                        l(hlnVar, str9);
                        this.c.D();
                        return;
                    }
                    d(str5.toString(), false);
                    boolean z5 = !TextUtils.isEmpty(str6) && !((Boolean) cas.s.c()).booleanValue();
                    hls hlsVar3 = this.c;
                    if (!((Boolean) cas.O.c()).booleanValue() || !z5) {
                        z3 = true;
                    } else {
                        z3 = true;
                        z4 = true;
                    }
                    int i5 = z3 ? 1 : 0;
                    int i6 = z3 ? 1 : 0;
                    hlsVar3.hV(str5, z4, i5);
                    this.c.hZ(null, z3);
                    return;
                }
                this.c.x();
                this.c.hW();
                this.c.C((str.length() - str5.length()) + i2, 0);
                this.c.D();
                return;
            }
            this.c.x();
            this.c.C(i2 - str9.length(), 0);
            str9.length();
            this.c.f(str9.length(), 0, str9);
            if (hlnVar != null) {
                hlk hlkVar = new hlk();
                hlkVar.b(hlnVar);
                hlkVar.a = String.valueOf(str4.replace(str9, "")).concat(String.valueOf(String.valueOf(hlnVar.a)));
                hlnVar2 = hlkVar.a();
            }
            this.c.hZ(hlnVar2, true);
            this.c.D();
            return;
        }
        this.c.x();
        this.c.hW();
        this.c.hV(str5.subSequence(str.length(), str5.length()), false, 1);
        k(str10);
        this.c.D();
    }

    public final void b(boolean z) {
        this.c.hY(z);
    }

    public final void c() {
        this.c.hY(false);
    }

    final void d(String str, boolean z) {
        String substring;
        end b;
        Set set = this.b;
        if (set == null) {
            substring = str.trim();
        } else {
            int length = str.length();
            int i = 0;
            while (i < length) {
                char charAt = str.charAt(i);
                if (!Character.isSpaceChar(charAt) && !set.contains(Character.valueOf(charAt))) {
                    break;
                }
                i++;
            }
            while (length > i) {
                int i2 = length - 1;
                char charAt2 = str.charAt(i2);
                if (!Character.isSpaceChar(charAt2) && !set.contains(Character.valueOf(charAt2))) {
                    break;
                }
                length = i2;
            }
            substring = str.substring(i, length);
        }
        if (!substring.isEmpty() && (b = ene.b()) != null) {
            Iterable<String> i3 = lfy.c(' ').i(substring);
            if (z) {
                return;
            }
            for (String str2 : i3) {
                b.d(str2);
            }
        }
    }

    public final void e(String str, String str2) {
        int length = str.length();
        int length2 = str2.length();
        this.c.x();
        this.c.hW();
        this.c.M(length, 0);
        this.c.hX(length, 0, str2, false);
        this.c.M(-length2, 0);
        this.c.D();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f(List list) {
        this.c.O(hfd.d(new iay(-10067, null, list)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void g(mtv mtvVar) {
        this.c.y(1L, mtvVar.d > 0);
    }

    public final void h(String str) {
        TreeSet treeSet = new TreeSet();
        for (int i = 0; i < str.length(); i++) {
            treeSet.add(Character.valueOf(str.charAt(i)));
        }
        this.b = treeSet;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void i(boolean z) {
        this.c.y(4611686018427387904L, z);
    }
}
