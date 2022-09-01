package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.googlehelp.GoogleHelp;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: fvd  reason: default package */
/* loaded from: classes.dex */
public final class fvd extends fvj {
    final /* synthetic */ Bundle a;
    final /* synthetic */ long e;
    final /* synthetic */ GoogleHelp f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fvd(fod fodVar, Bundle bundle, long j, GoogleHelp googleHelp) {
        super(fodVar);
        this.a = bundle;
        this.e = j;
        this.f = googleHelp;
    }

    @Override // defpackage.fvi
    protected final void b(fvo fvoVar) {
        try {
            Bundle bundle = this.a;
            long j = this.e;
            GoogleHelp googleHelp = this.f;
            fvc fvcVar = new fvc(this);
            Parcel a = fvoVar.a();
            bkh.d(a, bundle);
            a.writeLong(j);
            bkh.d(a, googleHelp);
            bkh.f(a, fvcVar);
            fvoVar.hJ(9, a);
        } catch (Exception e) {
            Log.e("gH_GoogleHelpApiImpl", "Requesting to save the async feedback psd failed!", e);
            i(fvk.a);
        }
    }
}
