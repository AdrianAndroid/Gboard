package defpackage;

import android.content.Context;
import android.util.Printer;
import com.google.android.libraries.inputmethod.nativelib.NativeLibHelper;
import com.google.android.libraries.inputmethod.trainingcache.impls.inputmetrics.InputMetricsPeriodicTask;

/* compiled from: PG */
/* renamed from: iuc  reason: default package */
/* loaded from: classes.dex */
public final class iuc implements iwb, ifw {
    @Override // defpackage.iwb
    public final isc c(ixe ixeVar) {
        return new InputMetricsPeriodicTask(ixeVar);
    }

    @Override // defpackage.gzv
    public final /* synthetic */ void dump(Printer printer, boolean z) {
    }

    @Override // defpackage.gzv
    public final /* synthetic */ String getDumpableTag() {
        return hqs.i(this);
    }

    @Override // defpackage.ifw
    public final void gm(Context context, igg iggVar) {
        NativeLibHelper.a("input-metrics-jni", false);
    }

    @Override // defpackage.ifw
    public final void gn() {
    }
}
