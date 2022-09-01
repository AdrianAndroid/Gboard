package defpackage;

import android.content.Context;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.inputmethod.latin.R;
import com.google.android.libraries.inputmethod.featuresplit.debugactivity.FeatureSplitDebugActivity;

/* compiled from: PG */
/* renamed from: hgp  reason: default package */
/* loaded from: classes.dex */
public final class hgp extends olm implements okf {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hgp(FeatureSplitDebugActivity featureSplitDebugActivity, int i) {
        super(0);
        this.b = i;
        this.a = featureSplitDebugActivity;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hgp(klo kloVar, int i) {
        super(0);
        this.b = i;
        this.a = kloVar;
    }

    @Override // defpackage.okf
    public final /* synthetic */ Object a() {
        switch (this.b) {
            case 0:
                return (TextView) ((cx) this.a).findViewById(R.id.f55280_resource_name_obfuscated_res_0x7f0b01f9);
            case 1:
                return (TextView) ((cx) this.a).findViewById(R.id.f55270_resource_name_obfuscated_res_0x7f0b01f8);
            case 2:
                lay e = lby.e((Context) this.a);
                oll.d(e, "create(this)");
                return e;
            case 3:
                return (TextView) ((cx) this.a).findViewById(R.id.f55290_resource_name_obfuscated_res_0x7f0b01fa);
            case 4:
                return (Button) ((cx) this.a).findViewById(R.id.f55300_resource_name_obfuscated_res_0x7f0b01fb);
            case 5:
                ((klo) this.a).e(klj.LISTENING);
                return oji.a;
            case 6:
                ((klo) this.a).e(klj.USER_INPUT);
                return oji.a;
            case 7:
                ((klo) this.a).c(true);
                return oji.a;
            default:
                ((klo) this.a).c(false);
                return oji.a;
        }
    }
}
