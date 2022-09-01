package defpackage;

import android.content.Intent;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.googlehelp.GoogleHelp;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* renamed from: fvg  reason: default package */
/* loaded from: classes.dex */
public final class fvg extends fvj {
    final /* synthetic */ Intent a;
    final /* synthetic */ WeakReference e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fvg(fod fodVar, Intent intent, WeakReference weakReference) {
        super(fodVar);
        this.a = intent;
        this.e = weakReference;
    }

    @Override // defpackage.fvi
    protected final void b(fvo fvoVar) {
        GoogleHelp googleHelp = (GoogleHelp) this.a.getParcelableExtra("EXTRA_GOOGLE_HELP");
        fyb fybVar = googleHelp.K;
        try {
            fvh fvhVar = new fvh(this.a, this.e, this, fybVar, null);
            Parcel a = fvoVar.a();
            bkh.d(a, googleHelp);
            bkh.d(a, null);
            bkh.f(a, fvhVar);
            fvoVar.hI(2, a);
        } catch (RemoteException e) {
            Log.e("gH_GoogleHelpApiImpl", "Starting help failed!", e);
            i(fvk.a);
        }
    }
}
