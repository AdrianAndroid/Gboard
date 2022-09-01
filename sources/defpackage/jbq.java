package defpackage;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.style.URLSpan;
import android.view.View;

/* compiled from: PG */
/* renamed from: jbq  reason: default package */
/* loaded from: classes.dex */
public final class jbq extends URLSpan {
    public jbq(URLSpan uRLSpan) {
        super(uRLSpan.getURL());
    }

    @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
    public final void onClick(View view) {
        Uri parse = Uri.parse(getURL());
        Context context = view.getContext();
        Intent intent = new Intent("android.intent.action.VIEW", parse);
        intent.putExtra("com.android.browser.application_id", context.getPackageName());
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        try {
            context.startActivity(intent);
        } catch (ActivityNotFoundException e) {
            ((ltd) ((ltd) ((ltd) jbr.a.d()).i(e)).k("com/google/android/libraries/inputmethod/utils/SpanUtil$URLSpanWithNewTaskFlag", "onClick", 197, "SpanUtil.java")).w("Actvity was not found for intent, %s", intent);
        }
    }
}
