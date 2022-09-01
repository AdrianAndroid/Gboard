package defpackage;

import android.text.TextUtils;
import android.view.inputmethod.EditorInfo;
import java.util.ArrayList;
import java.util.regex.Matcher;

/* compiled from: PG */
/* renamed from: hnn  reason: default package */
/* loaded from: classes.dex */
public final class hnn {
    private static final ltg c = ltg.j("com/google/android/libraries/inputmethod/ime/scrub/ScrubDeleteHandler");
    public boolean a;
    public boolean b;
    private final hls d;
    private CharSequence e;
    private int f;
    private final ArrayList g;
    private int h;
    private int i;
    private int j;
    private final idk k;
    private final boolean l;

    public hnn(hls hlsVar) {
        this(hlsVar, false);
    }

    private static CharSequence f(CharSequence charSequence) {
        EditorInfo b = hsu.b();
        if (b != null && han.DOCS.a(b)) {
            int length = charSequence.length();
            int i = 0;
            while (i < length && charSequence.charAt(i) == '\n') {
                i++;
            }
            while (length > i) {
                int i2 = length - 1;
                if (charSequence.charAt(i2) != '\n') {
                    break;
                }
                length = i2;
            }
            return length - i != charSequence.length() ? charSequence.subSequence(i, length) : charSequence;
        }
        return charSequence;
    }

    public final CharSequence a(int i) {
        if (this.b) {
            return "";
        }
        this.d.x();
        e(i);
        this.a = false;
        hqk hT = this.d.hT(0, 0, 1);
        this.d.D();
        CharSequence b = hT.b();
        idk idkVar = this.k;
        hlw hlwVar = hlw.SCRUB_DELETE;
        Object[] objArr = new Object[1];
        objArr[0] = Integer.valueOf(TextUtils.isEmpty(b) ? 0 : b.toString().codePointCount(0, b.length()));
        idkVar.e(hlwVar, objArr);
        return b;
    }

    public final void b() {
        this.b = true;
        this.a = false;
    }

    public final void c() {
        if (this.a) {
            hqk hT = this.d.hT(0, 0, 0);
            if (!hT.e()) {
                b();
                return;
            }
            CharSequence f = f(hT.b());
            CharSequence charSequence = null;
            if (this.e != null && !this.g.isEmpty()) {
                charSequence = f(this.e.subSequence(((Integer) lre.ac(this.g)).intValue(), ((Integer) this.g.get(0)).intValue()));
            }
            if (TextUtils.equals(f, charSequence)) {
                return;
            }
            b();
        }
    }

    public final void d(xv xvVar) {
        if (xvVar.a == null) {
            ((ltd) c.a(hip.a).k("com/google/android/libraries/inputmethod/ime/scrub/ScrubDeleteHandler", "startScrub", 206, "ScrubDeleteHandler.java")).t("composingRange.first is null");
        }
        if (xvVar.b == null) {
            ((ltd) c.a(hip.a).k("com/google/android/libraries/inputmethod/ime/scrub/ScrubDeleteHandler", "startScrub", 209, "ScrubDeleteHandler.java")).t("composingRange.second is null");
        }
        Object obj = xvVar.a;
        int intValue = obj == null ? 0 : ((Integer) obj).intValue();
        Object obj2 = xvVar.b;
        int intValue2 = obj2 == null ? 0 : ((Integer) obj2).intValue();
        this.h = 0;
        this.b = false;
        this.e = null;
        this.g.clear();
        this.a = true;
        this.i = intValue;
        this.j = intValue2;
        this.d.G();
    }

    public final void e(int i) {
        int intValue;
        ArrayList arrayList;
        int intValue2;
        int i2;
        if (this.b) {
            return;
        }
        this.d.x();
        int min = Math.min(0, i);
        if (this.h == 0 && min != 0) {
            this.d.hW();
        }
        if (min == this.h) {
            intValue = 0;
        } else {
            if (this.e == null) {
                hqk hT = this.d.hT(1000, 1000, 0);
                this.f = 0;
                if (hT == null) {
                    this.e = "";
                    this.g.clear();
                    this.g.add(Integer.valueOf(this.f));
                } else {
                    this.f = hT.c;
                    this.e = hT.b;
                    this.g.clear();
                    this.g.add(Integer.valueOf(this.f));
                }
            }
            int i3 = -min;
            if (i3 >= this.g.size()) {
                int size = i3 - (this.g.size() - 1);
                if (this.l) {
                    intValue2 = 0;
                } else {
                    Matcher matcher = hnm.a.matcher(this.e);
                    intValue2 = ((Integer) this.g.get(arrayList.size() - 1)).intValue();
                    while (size > 0 && intValue2 > 0) {
                        matcher.region(0, intValue2);
                        if (matcher.find()) {
                            intValue2 = matcher.start();
                            this.g.add(Integer.valueOf(intValue2));
                            size--;
                        }
                    }
                }
                while (true) {
                    int i4 = size - 1;
                    if (size <= 0) {
                        break;
                    }
                    this.g.add(Integer.valueOf(intValue2));
                    size = i4;
                }
            }
            intValue = ((Integer) this.g.get(i3)).intValue() - ((Integer) this.g.get(-this.h)).intValue();
        }
        if (intValue != 0) {
            this.d.M(intValue, 0);
            if (jam.w()) {
                this.d.O(hfd.d(new iay(-10091, null, null)));
            }
        }
        if (this.h != 0 && min == 0 && ((i2 = this.i) > 0 || this.j > 0)) {
            this.d.f(i2, this.j, null);
        }
        this.d.D();
        this.f += intValue;
        this.h = min;
    }

    public hnn(hls hlsVar, boolean z) {
        this.a = false;
        this.g = new ArrayList();
        this.h = 0;
        this.b = false;
        this.i = 0;
        this.j = 0;
        this.d = hlsVar;
        this.k = hlsVar.hO();
        this.l = z;
    }
}
