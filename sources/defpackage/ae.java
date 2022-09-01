package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;

/* compiled from: PG */
/* renamed from: ae  reason: default package */
/* loaded from: classes.dex */
final class ae implements DialogInterface.OnCancelListener {
    final /* synthetic */ ai a;

    public ae(ai aiVar) {
        this.a = aiVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        ai aiVar = this.a;
        Dialog dialog = aiVar.d;
        if (dialog != null) {
            aiVar.onCancel(dialog);
        }
    }
}
