package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;

/* compiled from: PG */
/* renamed from: faz  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class faz implements DialogInterface.OnDismissListener {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ faz(Context context, fbe fbeVar, int i) {
        this.c = i;
        this.a = context;
        this.b = fbeVar;
    }

    public /* synthetic */ faz(cdm cdmVar, jav javVar, int i) {
        this.c = i;
        this.a = cdmVar;
        this.b = javVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        if (this.c == 0) {
            ((Context) this.a).unregisterReceiver((BroadcastReceiver) this.b);
            return;
        }
        Object obj = this.a;
        Object obj2 = this.b;
        cdm cdmVar = (cdm) obj;
        if (cdmVar.e.get()) {
            return;
        }
        cdmVar.a.e(cap.LANG_ID_DIALOG_DISMISSED, obj2);
    }
}
