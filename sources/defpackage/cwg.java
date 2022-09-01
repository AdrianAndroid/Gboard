package defpackage;

import android.content.Context;
import com.google.android.apps.inputmethod.libs.expression.tenoranimation.TenorAnimationJni;

/* compiled from: PG */
/* renamed from: cwg  reason: default package */
/* loaded from: classes.dex */
public final class cwg implements azo {
    private final Context a;
    private final TenorAnimationJni b = new TenorAnimationJni();

    public cwg(Context context) {
        this.a = context.getApplicationContext();
    }

    @Override // defpackage.azo
    public final azn b(azt aztVar) {
        return new cwi(this.a);
    }

    @Override // defpackage.azo
    public final void c() {
    }
}
