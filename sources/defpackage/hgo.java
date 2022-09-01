package defpackage;

import android.widget.TextView;
import com.google.android.libraries.inputmethod.featuresplit.debugactivity.FeatureSplitDebugActivity;

/* compiled from: PG */
/* renamed from: hgo  reason: default package */
/* loaded from: classes.dex */
public final class hgo implements kzf {
    final /* synthetic */ FeatureSplitDebugActivity a;

    public hgo(FeatureSplitDebugActivity featureSplitDebugActivity) {
        this.a = featureSplitDebugActivity;
    }

    @Override // defpackage.kzf
    public final /* synthetic */ void a(Object obj) {
        TextView m = this.a.m();
        new StringBuilder().append(obj);
        m.append(obj.toString().concat("\n"));
        lbh lbhVar = (lbh) obj;
        int i = lbhVar.b;
        if (i == 5) {
            hgj p = this.a.p();
            if (p != null) {
                p.e();
            }
        } else if (i == 8) {
            this.a.q().g(lbhVar, this.a);
        }
        this.a.r();
    }
}
