package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;

/* compiled from: PG */
/* renamed from: au  reason: default package */
/* loaded from: classes.dex */
public class au extends ar {
    public final Activity b;
    public final Context c;
    public final Handler d;
    public final bi e = new bi();

    public au(Activity activity, Context context, Handler handler) {
        this.b = activity;
        this.c = context;
        this.d = handler;
    }

    @Override // defpackage.ar
    public View a(int i) {
        throw null;
    }

    @Override // defpackage.ar
    public boolean b() {
        throw null;
    }

    public void c() {
    }

    public final void e(Intent intent, int i, Bundle bundle) {
        if (i != -1) {
            throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
        }
        up.b(this.c, intent, bundle);
    }
}
