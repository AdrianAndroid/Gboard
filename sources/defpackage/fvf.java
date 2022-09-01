package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.googlehelp.GoogleHelp;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: fvf  reason: default package */
/* loaded from: classes.dex */
public final class fvf extends fvj {
    final /* synthetic */ ful a;
    final /* synthetic */ Bundle e;
    final /* synthetic */ long f;
    final /* synthetic */ GoogleHelp g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fvf(fod fodVar, ful fulVar, Bundle bundle, long j, GoogleHelp googleHelp) {
        super(fodVar);
        this.a = fulVar;
        this.e = bundle;
        this.f = j;
        this.g = googleHelp;
    }

    @Override // defpackage.fvi
    protected final void b(fvo fvoVar) {
        try {
            ful fulVar = this.a;
            Bundle bundle = this.e;
            long j = this.f;
            GoogleHelp googleHelp = this.g;
            fve fveVar = new fve(this);
            Parcel a = fvoVar.a();
            bkh.d(a, fulVar);
            bkh.d(a, bundle);
            a.writeLong(j);
            bkh.d(a, googleHelp);
            bkh.f(a, fveVar);
            fvoVar.hJ(10, a);
        } catch (Exception e) {
            Log.e("gH_GoogleHelpApiImpl", "Requesting to save the async feedback psbd failed!", e);
            i(fvk.a);
        }
    }
}
