package defpackage;

import android.app.Activity;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.DialogInterface;
import android.os.Bundle;

/* compiled from: PG */
/* renamed from: gue  reason: default package */
/* loaded from: classes.dex */
public final class gue extends DialogFragment implements guf {
    public gug a;
    private gtz b;

    @Override // defpackage.guf
    public final void hN() {
        Activity activity = getActivity();
        if (activity == null) {
            return;
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        fragmentManager.beginTransaction().remove(this).commit();
        fragmentManager.executePendingTransactions();
        show(fragmentManager, "");
        fragmentManager.executePendingTransactions();
    }

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        gug gugVar = this.a;
        if (gugVar != null) {
            gugVar.b(this.b, getDialog());
        }
        super.onCancel(dialogInterface);
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (this.a == null && bundle != null) {
            this.a = gug.a(this, bundle);
        }
        gug gugVar = this.a;
        if (gugVar != null) {
            gugVar.c(this);
        }
    }

    @Override // android.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        gug gugVar = this.a;
        guj gujVar = new guj(getActivity(), gugVar.c);
        this.b = gujVar;
        return gujVar.a(gugVar.b, true);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        gug gugVar = this.a;
        if (gugVar != null) {
            gugVar.f();
        }
        super.onDestroy();
    }

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        gug gugVar = this.a;
        if (gugVar != null) {
            gugVar.d(this.b, getDialog());
        }
        super.onDismiss(dialogInterface);
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        gug gugVar = this.a;
        if (gugVar != null) {
            gugVar.e(bundle);
        }
    }
}
