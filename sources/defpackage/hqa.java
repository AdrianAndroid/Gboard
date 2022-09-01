package defpackage;

import android.text.Editable;
import android.text.InputFilter;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.SuggestionSpan;
import java.util.Arrays;

/* compiled from: PG */
/* renamed from: hqa  reason: default package */
/* loaded from: classes.dex */
public final class hqa {
    public static final lmz a = lmz.r(SuggestionSpan.class);
    public final Editable b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    private CharSequence h;

    public hqa() {
        Editable newEditable = Editable.Factory.getInstance().newEditable("");
        this.b = newEditable;
        newEditable.setFilters(new InputFilter[]{new InputFilter() { // from class: hpz
            @Override // android.text.InputFilter
            public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
                llp g;
                if (hqa.this.g) {
                    if (i2 < i) {
                        return null;
                    }
                    char[] cArr = new char[i2 - i];
                    Arrays.fill(cArr, (char) 8226);
                    return String.valueOf(cArr);
                } else if (!((Boolean) hqg.e.c()).booleanValue() || !(charSequence instanceof Spanned)) {
                    return null;
                } else {
                    Spanned spanned2 = (Spanned) charSequence;
                    Object[] spans = spanned2.getSpans(i, i2, Object.class);
                    if (spans.length == 0) {
                        g = llp.q();
                    } else {
                        llk e = llp.e();
                        for (Object obj : spans) {
                            if (hqa.a.contains(obj.getClass())) {
                                e.h(obj);
                            }
                        }
                        g = e.g();
                    }
                    String substring = TextUtils.substring(spanned2, i, i2);
                    if (g.isEmpty()) {
                        return substring;
                    }
                    SpannableString spannableString = new SpannableString(substring);
                    int i5 = ((lrl) g).c;
                    for (int i6 = 0; i6 < i5; i6++) {
                        Object obj2 = g.get(i6);
                        int i7 = i2 - i;
                        spannableString.setSpan(obj2, Math.min(Math.max(spanned2.getSpanStart(obj2) - i, 0), i7), Math.min(Math.max(spanned2.getSpanEnd(obj2) - i, 0), i7), spanned2.getSpanFlags(obj2));
                    }
                    return spannableString;
                }
            }
        }});
    }

    private final void i(int i, int i2, CharSequence charSequence, int i3, boolean z) {
        this.e = true;
        int length = this.b.length();
        if (i < 0) {
            i = 0;
        } else if (i > length) {
            i = length;
        }
        if (i2 < 0) {
            i2 = 0;
        } else if (i2 > length) {
            i2 = length;
        }
        int i4 = i > i2 ? i : i2;
        if (i > i2) {
            i = i2;
        }
        CharSequence l = hqg.l(charSequence);
        if (i == i4 && l.length() == 0) {
            return;
        }
        try {
            this.b.replace(i, i4, l, 0, i3);
            if (!z) {
                this.f = false;
            }
        } catch (RuntimeException unused) {
            this.b.replace(i, i4, l.toString(), 0, i3);
            this.f = false;
        }
        e();
    }

    public final int a() {
        return this.b.length();
    }

    public final CharSequence b() {
        if (this.h == null) {
            this.h = new SpannedString(this.b);
        }
        return this.h;
    }

    public final CharSequence c(int i, int i2, int i3) {
        int length = this.b.length();
        int i4 = i > i2 ? i : i2;
        if (i > i2) {
            i = i2;
        }
        if (i < 0) {
            i = 0;
        } else if (i > length) {
            i = length;
        }
        if (i4 < 0) {
            length = 0;
        } else if (i4 <= length) {
            length = i4;
        }
        if (i3 != 0) {
            return this.b.subSequence(i, length);
        }
        return TextUtils.substring(this.b, i, length);
    }

    public final void d(CharSequence charSequence) {
        this.e = true;
        if (TextUtils.isEmpty(charSequence)) {
            return;
        }
        try {
            this.b.append(charSequence);
        } catch (RuntimeException unused) {
            this.b.append((CharSequence) charSequence.toString());
            this.f = false;
        }
        e();
    }

    public final void e() {
        this.h = null;
        if (this.c) {
            this.d = true;
        }
    }

    public final void f(int i, int i2, CharSequence charSequence) {
        i(i, i2, charSequence, charSequence != null ? charSequence.length() : 0, true);
    }

    public final boolean g() {
        this.c = false;
        return this.d;
    }

    public final void h(int i, int i2, CharSequence charSequence) {
        i(i, i2, charSequence, charSequence != null ? charSequence.length() : 0, false);
    }
}
