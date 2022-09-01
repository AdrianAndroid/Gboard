package defpackage;

import android.os.Build;
import android.text.Html;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;

/* compiled from: PG */
/* renamed from: jbk  reason: default package */
/* loaded from: classes.dex */
public final class jbk extends Spannable.Factory {
    final /* synthetic */ Html.TagHandler a;

    public jbk(Html.TagHandler tagHandler) {
        this.a = tagHandler;
    }

    @Override // android.text.Spannable.Factory
    public final Spannable newSpannable(CharSequence charSequence) {
        Spanned fromHtml;
        String obj = charSequence.toString();
        Html.TagHandler tagHandler = this.a;
        if (Build.VERSION.SDK_INT >= 24) {
            fromHtml = xk.b(obj, 0, null, tagHandler);
        } else {
            fromHtml = Html.fromHtml(obj, null, tagHandler);
        }
        return new SpannableString(fromHtml);
    }
}
