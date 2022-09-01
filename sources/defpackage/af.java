package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;

/* compiled from: PG */
/* renamed from: af  reason: default package */
/* loaded from: classes.dex */
final class af implements DialogInterface.OnDismissListener {
    final /* synthetic */ ai a;

    public af(ai aiVar) {
        this.a = aiVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        ai aiVar = this.a;
        Dialog dialog = aiVar.d;
        if (dialog != null) {
            aiVar.onDismiss(dialog);
        }
    }
}
