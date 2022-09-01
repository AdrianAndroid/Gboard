package defpackage;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.feedback.ErrorReport;

/* compiled from: PG */
/* renamed from: fue  reason: default package */
/* loaded from: classes.dex */
public final class fue extends fuh {
    final /* synthetic */ ful a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fue(fod fodVar, ful fulVar) {
        super(fodVar);
        this.a = fulVar;
    }

    @Override // defpackage.fou
    protected final /* synthetic */ void c(fnr fnrVar) {
        fur furVar = (fur) fnrVar;
        ful fulVar = this.a;
        giw.i(fulVar);
        if (((Boolean) fuv.a.a()).booleanValue()) {
            fut futVar = (fut) furVar.w();
            Parcel a = futVar.a();
            bkh.d(a, fulVar);
            Parcel hG = futVar.hG(7, a);
            bkh.g(hG);
            hG.recycle();
        } else {
            fut futVar2 = (fut) furVar.w();
            ErrorReport errorReport = new ErrorReport(fulVar, furVar.s.getCacheDir());
            Parcel a2 = futVar2.a();
            bkh.d(a2, errorReport);
            Parcel hG2 = futVar2.hG(3, a2);
            bkh.g(hG2);
            hG2.recycle();
        }
        k(Status.a);
    }
}
