package defpackage;

import android.text.Spannable;
import android.text.SpannableString;

/* compiled from: PG */
/* renamed from: jbm  reason: default package */
/* loaded from: classes.dex */
public final class jbm extends Spannable.Factory {
    final /* synthetic */ Spannable.Factory a;

    public jbm(Spannable.Factory factory) {
        this.a = factory;
    }

    @Override // android.text.Spannable.Factory
    public final Spannable newSpannable(CharSequence charSequence) {
        SpannableString spannableString = new SpannableString(this.a.newSpannable(charSequence));
        jbr.a(spannableString);
        return spannableString;
    }
}
