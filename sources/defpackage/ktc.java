package defpackage;

import android.app.Dialog;
import android.os.Bundle;

/* compiled from: PG */
/* renamed from: ktc  reason: default package */
/* loaded from: classes.dex */
public class ktc extends du {
    @Override // defpackage.du, defpackage.ai
    public Dialog a(Bundle bundle) {
        return new ktb(fS(), this.b);
    }

    @Override // defpackage.ai
    public final void dismiss() {
        Dialog dialog = this.d;
        if (dialog instanceof ktb) {
            boolean z = ((ktb) dialog).a().t;
        }
        super.dismiss();
    }
}
