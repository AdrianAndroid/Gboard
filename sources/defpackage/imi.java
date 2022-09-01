package defpackage;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.util.AttributeSet;

/* compiled from: PG */
/* renamed from: imi  reason: default package */
/* loaded from: classes.dex */
public final class imi {
    private static final UnderlineSpan a = new UnderlineSpan();
    private final boolean b;

    public imi(Context context, AttributeSet attributeSet) {
        this.b = jgd.o(context, attributeSet, null, "underline_on_decode", false);
    }

    public final CharSequence a(String str, iax iaxVar) {
        if (!this.b || iaxVar != iax.DECODE) {
            return str;
        }
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(a, 0, str.length(), 0);
        return spannableString;
    }
}
