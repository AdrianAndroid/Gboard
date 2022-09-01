package defpackage;

import com.google.android.libraries.inputmethod.featuresplit.debugactivity.FeatureSplitDebugActivity;

/* compiled from: PG */
/* renamed from: hgr  reason: default package */
/* loaded from: classes.dex */
public final class hgr implements gek {
    final /* synthetic */ FeatureSplitDebugActivity a;

    public hgr(FeatureSplitDebugActivity featureSplitDebugActivity) {
        this.a = featureSplitDebugActivity;
    }

    @Override // defpackage.gek
    public final void d(Exception exc) {
        gyc.b.execute(new gxi(this.a, exc, 6));
    }
}
