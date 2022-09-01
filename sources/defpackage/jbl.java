package defpackage;

import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.URLSpan;

/* compiled from: PG */
/* renamed from: jbl  reason: default package */
/* loaded from: classes.dex */
public final class jbl extends Spannable.Factory {
    final /* synthetic */ Spannable.Factory a;

    public jbl(Spannable.Factory factory) {
        this.a = factory;
    }

    @Override // android.text.Spannable.Factory
    public final Spannable newSpannable(CharSequence charSequence) {
        Object[] spans;
        Spannable newSpannable = this.a.newSpannable(charSequence);
        iuu iuuVar = iuu.m;
        SpannableString spannableString = new SpannableString(newSpannable);
        for (Object obj : spannableString.getSpans(0, newSpannable.length(), URLSpan.class)) {
            int spanStart = spannableString.getSpanStart(obj);
            int spanEnd = spannableString.getSpanEnd(obj);
            Object a = iuuVar.a(obj);
            if (a != obj) {
                spannableString.removeSpan(obj);
                spannableString.setSpan(a, spanStart, spanEnd, 18);
            }
        }
        return spannableString;
    }
}
