package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.style.URLSpan;
import android.view.View;

/* compiled from: PG */
/* renamed from: jbo  reason: default package */
/* loaded from: classes.dex */
public final class jbo extends URLSpan {
    final /* synthetic */ String a;
    final /* synthetic */ Context b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jbo(String str, String str2, Context context) {
        super(str);
        this.a = str2;
        this.b = context;
    }

    @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
    public final void onClick(View view) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(this.a));
        intent.setFlags(268435456);
        this.b.startActivity(intent);
    }
}
