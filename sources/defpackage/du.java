package defpackage;

import android.app.Dialog;
import android.os.Bundle;

/* compiled from: PG */
/* renamed from: du  reason: default package */
/* loaded from: classes.dex */
public class du extends ai {
    @Override // defpackage.ai
    public Dialog a(Bundle bundle) {
        return new dt(fS(), this.b);
    }

    @Override // defpackage.ai
    public final void m(Dialog dialog, int i) {
        if (dialog instanceof dt) {
            dt dtVar = (dt) dialog;
            if (i != 1 && i != 2) {
                if (i != 3) {
                    return;
                }
                dialog.getWindow().addFlags(24);
            }
            dtVar.f();
            return;
        }
        super.m(dialog, i);
    }
}
