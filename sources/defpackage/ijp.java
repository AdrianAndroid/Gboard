package defpackage;

import android.content.Context;
import android.util.Printer;
import com.google.android.libraries.inputmethod.ondevicemetricaggregation.OnDeviceMetricAggregationProcessor;
import java.util.Collection;

/* compiled from: PG */
/* renamed from: ijp  reason: default package */
/* loaded from: classes.dex */
public final class ijp implements ijm {
    @Override // defpackage.idp
    public final Collection d(Context context, idi idiVar) {
        return llp.r(new OnDeviceMetricAggregationProcessor(context, idiVar));
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
    }

    @Override // defpackage.ifw
    public final void gn() {
    }
}
