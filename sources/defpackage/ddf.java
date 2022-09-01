package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import com.google.android.apps.inputmethod.libs.framework.firstrun.EnableStepPage;

/* compiled from: PG */
/* renamed from: ddf  reason: default package */
/* loaded from: classes.dex */
public final class ddf extends ContentObserver {
    final /* synthetic */ EnableStepPage a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ddf(EnableStepPage enableStepPage, Handler handler) {
        super(handler);
        this.a = enableStepPage;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        onChange(z, null);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z, Uri uri) {
        jaq.e();
        if (!this.a.c.h()) {
            return;
        }
        Context context = this.a.getContext();
        jbt.I(context, this);
        if (!(context instanceof Activity)) {
            return;
        }
        Intent intent = new Intent(context, context.getClass());
        intent.setFlags(67108864);
        context.startActivity(intent);
    }
}
