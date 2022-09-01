package defpackage;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;

/* compiled from: PG */
/* renamed from: fnp  reason: default package */
/* loaded from: classes.dex */
public final class fnp extends ai {
    public Dialog ac;
    public DialogInterface.OnCancelListener ad;
    private Dialog ae;

    @Override // defpackage.ai
    public final Dialog a(Bundle bundle) {
        Dialog dialog = this.ac;
        if (dialog == null) {
            setShowsDialog(false);
            if (this.ae == null) {
                Context fS = fS();
                fyb.ax(fS);
                this.ae = new AlertDialog.Builder(fS).create();
            }
            return this.ae;
        }
        return dialog;
    }

    @Override // defpackage.ai, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.ad;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }
}
