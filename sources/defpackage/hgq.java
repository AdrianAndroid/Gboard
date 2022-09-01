package defpackage;

import com.google.android.libraries.inputmethod.featuresplit.debugactivity.FeatureSplitDebugActivity;
import java.util.Collection;

/* compiled from: PG */
/* renamed from: hgq  reason: default package */
/* loaded from: classes.dex */
public final class hgq implements gel {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public hgq(FeatureSplitDebugActivity featureSplitDebugActivity, Collection collection, int i) {
        this.c = i;
        this.a = featureSplitDebugActivity;
        this.b = collection;
    }

    public hgq(hgj hgjVar, iiy iiyVar, int i) {
        this.c = i;
        this.a = hgjVar;
        this.b = iiyVar;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.Collection, java.lang.Object] */
    @Override // defpackage.gel
    public final /* synthetic */ void e(Object obj) {
        if (this.c == 0) {
            Integer num = (Integer) obj;
            gyc.b.execute(new gxi((FeatureSplitDebugActivity) this.a, (Collection) this.b, 5));
            return;
        }
        Void r5 = (Void) obj;
        ((hgj) this.a).g((iiy) this.b);
    }
}
