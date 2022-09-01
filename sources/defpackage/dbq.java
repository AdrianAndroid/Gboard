package defpackage;

import android.content.Context;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dbq  reason: default package */
/* loaded from: classes.dex */
public final class dbq implements ibr {
    final /* synthetic */ Context a;
    final /* synthetic */ hsz b;
    final /* synthetic */ iav c;
    final /* synthetic */ ibz d;
    final /* synthetic */ hta e;
    final /* synthetic */ dbr f;

    public dbq(dbr dbrVar, Context context, hsz hszVar, iav iavVar, ibz ibzVar, hta htaVar) {
        this.f = dbrVar;
        this.a = context;
        this.b = hszVar;
        this.c = iavVar;
        this.d = ibzVar;
        this.e = htaVar;
    }

    @Override // defpackage.ibr
    public final void b(ibm ibmVar) {
        if (this.f.d.get() != null) {
            Context context = this.a;
            hsz hszVar = this.b;
            iav iavVar = this.c;
            ibz ibzVar = this.d;
            hta htaVar = this.e;
            if (ibmVar == null) {
                htaVar.a(ibzVar, null, null);
            } else {
                htaVar.a(ibzVar, iin.l(context, hszVar, ibmVar, iavVar, ibzVar), ibmVar);
            }
        }
    }
}
