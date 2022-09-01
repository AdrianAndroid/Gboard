package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* renamed from: fuf  reason: default package */
/* loaded from: classes.dex */
public final class fuf extends fuh {
    final /* synthetic */ Bundle a;
    final /* synthetic */ long e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fuf(fod fodVar, Bundle bundle, long j) {
        super(fodVar);
        this.a = bundle;
        this.e = j;
    }

    @Override // defpackage.fou
    protected final /* bridge */ /* synthetic */ void c(fnr fnrVar) {
        fur furVar = (fur) fnrVar;
        try {
            Bundle bundle = this.a;
            long j = this.e;
            giw.h(bundle);
            fut futVar = (fut) furVar.w();
            Parcel a = futVar.a();
            bkh.d(a, bundle);
            a.writeLong(j);
            futVar.hI(4, a);
            k(Status.a);
        } catch (Exception e) {
            Log.e("gF_Feedback", "Requesting to save the async feedback psd failed!", e);
            i(fui.a);
        }
    }
}
