package defpackage;

import android.content.res.Resources;
import android.os.AsyncTask;

/* compiled from: PG */
/* renamed from: bjr  reason: default package */
/* loaded from: classes.dex */
public abstract class bjr extends AsyncTask {
    public djc b = null;
    public float a = -1.0f;

    /* JADX INFO: Access modifiers changed from: protected */
    public final float a(Resources resources) {
        float a = bjd.a(resources);
        float f = this.a;
        return f > 0.0f ? a * f : a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void b(bjd bjdVar, Resources resources) {
        float f = this.a;
        if (f > 0.0f) {
            bjdVar.h(f);
        }
        bjdVar.h(bjd.a(resources));
    }
}
